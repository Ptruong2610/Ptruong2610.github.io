package handle;
import entity.*;
import view.Menu;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class OderHandle {
    /* đây là hàm để xử lý phần mua hang */
    public void addOder(Scanner scanner, ArrayList<Oder> oders, ArrayList<Product> products, User user) {
        System.out.println("Mời bạn nhập thông tin sản phẩm muốn mua : ");
        OderDetailHandle oderDetailHandle = new OderDetailHandle();
        ArrayList<OderDetail> oderDetails = new ArrayList<>();
        OderDetail oderDetail = oderDetailHandle.addOderDetail(scanner,products);
        oderDetails.add(oderDetail);
        boolean check = false;

        do {
            System.out.println("Bạn muốn thêm sản phẩm nào nữa không :");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int option = 0;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! Bạn phải nhập vào 1 số nguyên dương!!!");
                check = true;
//                continue;
            }
            if (option == 1) {
                OderDetail oderDetail1 = oderDetailHandle.addOderDetail(scanner,products);
                oderDetails.add(oderDetail1);
                check = true;
            } else if (option == 2) {
                check = false;
            } else if (option!=1&&option!=2) {
                check = true;
            }
        } while (check == true);
        System.out.println("Mời bạn nhập vào tên: ");
        String nameCustomer = scanner.nextLine();
        System.out.println("Mời bạn nhập vào địa chỉ: ");
        String address = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[0-9]{10}$"); // Định dạng số điện thoại
        String phoneNumber;

        while (true) {
            System.out.print("Nhập số điện thoại của bạn: ");
            phoneNumber = scanner.nextLine();

            // Kiểm tra định dạng số điện thoại
            if (pattern.matcher(phoneNumber).matches()) {
                break;
            }
            System.out.println("Số điện thoại không hợp lệ!");
        }

        if (user != null) {
            Oder oder = new Oder(user.getId(), oderDetails, nameCustomer, address, phoneNumber, "Đang xử lý");
            oders.add(oder);
            System.out.println("Mua thành công!");
        }
    }
    /* Đây là hàm trả về các oder có userid trùng với id của user */
    public ArrayList<Oder> findByUserId(int userId, ArrayList<Oder> oders){
        ArrayList<Oder> odersFound = new ArrayList<>();
        for (Oder oder:oders
             ) {
            if(oder.getUserID()==userId){
                odersFound.add(oder);
            }
        }
        return odersFound;
    }
    /* Đây là hàm hiển thị danh sách đơn hàng sau khi mua thành công */
    public void displayOderAfterBuy(ArrayList<Oder> oders,ArrayList<Product> products,User user){
        OderHandle handle = new OderHandle();
        ArrayList<Oder> oders1 = handle.findByUserId(user.getId(), oders);

        if (oders1.size()==0){
            System.out.println("Bạn hiện chưa có đơn hàng nào!");
        }else {
            for (Oder od : oders1
            ) {
                System.out.println(od.printOder(products));
                int amount = 0;
                for (OderDetail detail : od.getOderDetails()
                ) {
                    System.out.println(detail.printDetailProduct(products));
                    for (Product product : products
                    ) {
                        if (detail.getProductID() == product.getId())
                            amount += detail.getQuantity() * product.getPrice();
                    }

                }
                System.out.println("}");
                System.out.println("Thành tiền:" + amount+"$");
                System.out.println("----------------------------------------------------------------------------------------------");
            }
        }
    }
    /*  Đây là hàm hủy đơn hàng của user */
    public void cancelOder(Scanner scanner,ArrayList<Oder> oders,ArrayList<Product> products,User user){
        OderHandle handle = new OderHandle();
        ArrayList<Oder> oders1 = handle.findByUserId(user.getId(), oders);
        try {
            System.out.println("Mời bạn nhập id đơn hàng muốn hủy");
            int oderId = Integer.parseInt(scanner.nextLine());
            boolean check = false;
            for (Oder oder: oders1
            ) {
                if (oder.getId()==oderId){
                    check = true;
                    if (oder.getStatus().equals("Đang xử lý")){
                        oders.remove(oder);
                        System.out.println("Order id=" + oderId + " đã được xóa.");
                        for (OderDetail oderdetail: oder.getOderDetails()
                        ) {
                            for (Product product: products
                            ) {
                                if (product.getId()==oderdetail.getProductID()){

                                    product.setNumber(oderdetail.getQuantity()+product.getNumber());
//                                break;
                                }
                            }
                        }
                    }else {
                        System.out.println("Order id=" + oderId + " không còn ở trạng thái được hủy.Vui lòng liên hệ adminWeb để được hỗ trợ");
//                        check = true;
//                    break;
                    }
                }
            }
            if (!check){
                System.out.println("Không tìm thấy đơn hàng nào có id="+oderId+" !");
//                cancelOder(scanner, oders, products);
            }
        }catch (ConcurrentModificationException e){
        }catch (NumberFormatException e){
            System.out.println("Lỗi! id phải là một số nguyên dương");
            cancelOder(scanner, oders, products,user);
        }

    }

    /* Đây là hàm cập nhật trạng thái đơn hàng bởi admin */
    public void updateStatusOderById(Scanner scanner,ArrayList<Oder> oders,ArrayList<AdminHistory>adminHistories){
        OderHandle oderHandle = new OderHandle();
            boolean check = false;
                System.out.println("Nhập vào id của oder muốn cập nhật tráng thái");
                try {

                    int id = Integer.parseInt(scanner.nextLine());
                    for (Oder oder : oders
                    ) {
                        if (oder.getId() == id) {
                            check = true;
                            oderHandle.selecMenuUpdateStatus(scanner,oder,adminHistories);
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("Không tìm thấy đơn hàng nào có id=" + id + " Nhập lại");
                        updateStatusOderById(scanner, oders,adminHistories);
                    }
                }catch (NumberFormatException e){
                    System.out.println("Lỗi! ID phải là một số nguyên dương, Nhập lại");
                    updateStatusOderById(scanner, oders,adminHistories);
                }
    }
    /* Đây là hàm hiển thị menu sau khi người dùng tìm kiếm sản phẩm */
    public void selectMenuBuyAfterSearch(Scanner scanner,ArrayList<Oder> oders,ArrayList<Product> products,ArrayList<User> users,User user,String username,ArrayList<AdminHistory>adminHistories){
        OderHandle oderHandle = new OderHandle();
        Menu menu = new Menu();
        boolean check = false;
        do {
            System.out.println("1 - Mua hàng");
            System.out.println("2 - Quay lại");
            try {
                int chose = Integer.parseInt(scanner.nextLine());
                if (chose==1){
                    oderHandle.addOder(scanner,oders,products,user);
                    oderHandle.displayOderAfterBuy(oders,products,user);
                    menu.selectMenuPO(scanner, products, users, oders, username,user,adminHistories);
                    check = true;

                }else if (chose==2){
                    menu.selectMenuUserLogin(scanner, products, users, oders, username,adminHistories);
                    check = true;
                }else {
                    System.out.println("Chọn lại!");
                    check = false;
                }
            }catch (NumberFormatException e){
                System.out.println("Lỗi! Bạn hãy nhập vào 1 số nguyên dương");
                selectMenuBuyAfterSearch(scanner, oders, products, users, user, username,adminHistories);
            }

        }while (!check);
    }
    public void displayOder(ArrayList<Oder>oders){
        for (Oder oder:oders
             ) {
            System.out.println(oder);
        }
    }
    /* Đây là hàm hiển thị menu sau khi nhập id cập nhật trạng thái đơn hàng */
    public void selecMenuUpdateStatus(Scanner scanner,Oder oder,ArrayList<AdminHistory> adminHistories){
        ProductHandle productHandle = new ProductHandle();
        System.out.println("Mời bạn chọn trạng thái cho đơn hàng");
        System.out.println("1 -Xác nhận đơn hàng");
        System.out.println("2 -Từ chối đơn hàng ");
        int chose = productHandle.isValidInput(scanner);
        if (chose==1){
            oder.setStatus("Đơn hàng đã xác nhận");
            AdminHistory adminHistory = new AdminHistory(oder);
            adminHistories.add(adminHistory);
        }else if (chose==2){
            oder.setStatus("Đơn hàng đã bị từ chối");
            AdminHistory adminHistory = new AdminHistory(oder);
            adminHistories.add(adminHistory);
        }else {
            System.out.println("Lỗi!Bạn hãy lựa chọn nhập 1 số nguyên 1->2");
            selecMenuUpdateStatus(scanner,oder,adminHistories);
        }
    }


}
