package view;

import entity.Oder;
import entity.OderDetail;
import entity.Product;
import entity.User;
import handle.OderDetailHandle;
import handle.OderHandle;
import handle.ProductHandle;
import handle.UserHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void menuStart(){
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Thoát");
    }

    public void menuLoginFail(){
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.println("3 - Thoát");
    }

    public void menuUserLogin(){
        System.out.println("1 - Tìm kếm Điện thoại theo giá tiền");
        System.out.println("2 - Mua hàng");
        System.out.println("3 - Đơn mua");
        System.out.println("4 - Đăng Xuất");
        System.out.println("5 - Thoát");
    }
    public void menuPO(){
        System.out.println("1 - Mua thêm");
        System.out.println("2 - Hủy đơn hàng");
        System.out.println("3 - Quay lại");
    }
    public void menuAdminLogin(){
        System.out.println("1 - Thêm Sản phẩm");
        System.out.println("2 - Cập nhật sản phẩm");
        System.out.println("3 - Xóa sản phẩm");
        System.out.println("4 - Cập nhật trạng thái đơn hàng");
        System.out.println("5 - Đăng xuất");
        System.out.println("6 - Thoát");
    }
    public void menuAdminEditProduct(){
        System.out.println("1 - Cập nhật số lượng tồn kho");
        System.out.println("2 - Cập nhật giá bán sản phẩm");
        System.out.println("3 - Cập nhật số lượng kho và giá bán sản phẩm");
    }
    public void menuAdminUpdateOder(){
        System.out.println("Bạn có muốn tiếp tục cập nhật trạng thái đơn hàng không:");
        System.out.println("1 - Có");
        System.out.println("2 - Không");

    }

    /* Đây là menu bắt đầu chương trình */
    public void selectMenu(Scanner scanner, ArrayList<Product> products, ArrayList<User> users, ArrayList<Oder> oders){
        UserHandle userHandle = new UserHandle();
        ProductHandle productHandle = new ProductHandle();
        productHandle.displayProduct(products);
        menuStart();
        try {
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    userHandle.login(scanner,products,users,oders);
                    break;
                case 2:
                    userHandle.signUp(scanner,products,users,oders);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lỗi! Bạn hãy lựa chọn bằng cách nhập vào 1 số nguyên dương 1->3 !!!");
                    selectMenu(scanner,products,users,oders);
                    break;
            }
        }catch (NumberFormatException e){
            System.out.println("Lỗi! Bạn hãy lựa chọn bằng cách nhập vào 1 số nguyên dương 1->3 !!!");
            selectMenu(scanner, products, users, oders);
        }
    }

    /* Đây là menu sau khi user đăng nhập thành công */
    public void selectMenuUserLogin(Scanner scanner, ArrayList<Product> products, ArrayList<User> users, ArrayList<Oder> oders, String username){
            UserHandle userHandle = new UserHandle();
            OderHandle oderHandle = new OderHandle();
            ProductHandle productHandle = new ProductHandle();
            productHandle.displayProduct(products);
            menuUserLogin();
            User user = userHandle.checkByUsername(users,username);
            try {
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        productHandle.searchAndDisplayByPriceRange(scanner,products);
                        oderHandle.selectMenuBuyAfterSearch(scanner, oders, products, users, user, username);
                        break;
                    case 2:
                        oderHandle.addOder(scanner,oders,products,user);
                        oderHandle.displayOderAfterBuy(oders,products,user);
                        selectMenuPO(scanner, products, users, oders, username,user);
                        break;
                    case 3:
                        oderHandle.displayOderAfterBuy(oders,products,user);
                        selectMenuPO(scanner, products, users, oders, username,user);
                        break;
                    case 4:
                        selectMenu(scanner,products,users,oders);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Bạn phải nhập vào 1 số nguyên dương 1->5, Chọn Lại!!!");
                        selectMenuUserLogin(scanner, products, users, oders, username);
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Lỗi! Bạn phải nhập vào 1 số nguyên 1->5, Chọn lại ");
                selectMenuUserLogin(scanner, products, users, oders, username);
            }
    }

    /* Đây là menu sau khi admin đăng nhập thành công */
    public void selectMenuAdminLogin(Scanner scanner,ArrayList<Product> products,ArrayList<User> users,ArrayList<Oder> oders){
        ProductHandle productHandle = new ProductHandle();
        OderHandle oderHandle = new OderHandle();
        menuAdminLogin();
        int option = 0;
        try {
         option = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Lỗi! Bạn phải nhập vào 1 số nguyên 1->6, Chọn lại ");
            selectMenuAdminLogin(scanner, products, users, oders);
        }
        switch (option){
            case 1:
                productHandle.displayProduct(products);
                System.out.println("Mời bạn nhập số sản phẩm muốn thêm: ");
                int n = productHandle.isValidInput(scanner);
                for (int i = 0; i < n; i++) {
                    System.out.println("Mời bạn nhập sản phẩm thứ : " + (i + 1));
                    Product product = productHandle.inputProduct(scanner);
                    products.add(product);
                }
                System.out.println("Thêm thành công !");
                selectMenuAdminLogin(scanner, products, users, oders);
                break;
            case 2:
                productHandle.displayProduct(products);
                productHandle.editProductByID(scanner,products);
                System.out.println("Cập nhật thành công!");
                selectMenuAdminLogin(scanner, products, users, oders);
                break;
            case 3:
                productHandle.displayProduct(products);
                productHandle.deleteProductById(scanner,products);
                System.out.println("Xóa thành công !");
                boolean check3 = false;
                do {
                    productHandle.displayProduct(products);
                    System.out.println("Bạn có muốn tiếp tục xóa sản phẩm không?");
                    System.out.println("1 - Có");
                    System.out.println("2 - Không");
                    System.out.println("Mời bạn chọn: ");
                    int chose = productHandle.isValidInput(scanner);;
                    if (chose==1){
                        productHandle.deleteProductById(scanner,products);
                        check3 = false;
                    }else if (chose==2){
                        selectMenuAdminLogin(scanner, products, users, oders);
                    }else if (chose!=1&&chose!=2){
                        System.out.println("chọn lại!");
                        check3 = true;
                    }
                }while (check3=true);
                break;
            case 4:
                if (oders.size()==0){
                    System.out.println("Web của bạn chưa phát sinh đơn hàng nào!");
                    selectMenuAdminLogin(scanner, products, users, oders);
                } else {
                    oderHandle.displayOder(oders);
                    oderHandle.updateStatusOderById(scanner,oders);
                    boolean check4 = false;
                    do {
                        oderHandle.displayOder(oders);
                        System.out.println("Bạn có muốn tiếp tục cập nhật trạng thái đơn hàng không?");
                        System.out.println("1 - Có");
                        System.out.println("2 - Không");
                        System.out.println("Mời bạn chọn: ");
                        int chose = productHandle.isValidInput(scanner);
                        if (chose==1){
                            oderHandle.displayOder(oders);
                            oderHandle.updateStatusOderById(scanner,oders);
                            check4 = false;
                        }else if (chose==2){
                            selectMenuAdminLogin(scanner, products, users, oders);
                        }else if (chose!=1&&chose!=2){
                            System.out.println("chọn lại!");
                            check4 = true;
                        }
                    }while (check4=true);
                }
                break;
            case 5:
                selectMenu(scanner,products,users,oders);
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Lỗi! Bạn phải nhập vào 1 số nguyên 1->6, Chọn lại ");
                selectMenuAdminLogin(scanner, products, users, oders);
                break;
        }

    }

    /* Đây là menu sau khi đăng nhập thất bại */
    public void selectMenuLoginFail(Scanner scanner,ArrayList<Product> products,ArrayList<User> users,ArrayList<Oder> oders ){

        UserHandle userHandle = new UserHandle();
        menuLoginFail();
        try {
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    userHandle.login(scanner, products, users, oders);
                    break;
                case 2:
                    userHandle.isFailLogin(scanner, products, users, oders);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Chọn lại!!!");
                    selectMenuLoginFail(scanner, products, users, oders);
            }
        }catch (NumberFormatException e){
            System.out.println("Bạn phải nhập vào lựa chọn là 1 số nguyên dương 1->3,Nhập Lại");
            selectMenuLoginFail(scanner, products, users, oders);
        }
    }

    /* Đây là menu sau khi mua hàng thành công */
    public void selectMenuPO(Scanner scanner, ArrayList<Product> products, ArrayList<User> users, ArrayList<Oder> oders, String username,User user){
        OderHandle oderHandle = new OderHandle();
        try {
            menuPO();
            int option = Integer.parseInt(scanner.nextLine());

        switch (option){
            case 1:
            case 3:
                selectMenuUserLogin(scanner, products, users, oders, username);

                break;
            case 2:
                oderHandle.cancelOder(scanner,oders,products);
                oderHandle.displayOderAfterBuy(oders,products,user);
                selectMenuPO(scanner, products, users, oders, username,user);
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Chọn lại!!!");
                selectMenuPO(scanner, products, users, oders, username, user);

        }
        }catch (NumberFormatException e){
            System.out.println("Bạn hãy lựa chọn bằng cách nhập vào 1 số nguyên dương 1->3");
            selectMenuPO(scanner, products, users, oders, username, user);
        }
    }


}
