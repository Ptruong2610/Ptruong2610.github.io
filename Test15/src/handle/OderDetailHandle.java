package handle;
import entity.Oder;
import entity.OderDetail;
import entity.Product;


import java.util.ArrayList;
import java.util.Scanner;

public class OderDetailHandle {
    ProductHandle productHandle = new ProductHandle();
    public OderDetail addOderDetail(Scanner scanner,ArrayList<Product> products){
//        boolean check = false;
//        int productID;
//        int quannity;
//        do {
//            System.out.println("Mời bạn nhập id sản phẩm:");
//            productID = Integer.parseInt(scanner.nextLine());
//            for (Product product: products
//            ) {
//                if (product.getId()==productID)
//                    check = true;
//            }
//            if (!check){
//                System.out.println("id sản phẩm nhập không đúng! Nhập lại");
//            }
//        }while (!check);
//        Product product = productHandle.checkByProductID(products,productID);
//        do {
//            System.out.println("Mời bạn nhập số lượng muốn mua:");
//            quannity = Integer.parseInt(scanner.nextLine());
//            if (product!=null&&product.getNumber()>=quannity){
//                check = true;
//
//            }else if (product!=null&&product.getNumber()==0){
//                System.out.println("Sản phẩm này hiện đã hết vui lòng chọn sản phẩm khac!");
//                addOderDetail(scanner, products);
//            }else if (product!=null&&product.getNumber()<quannity) {
//                System.out.println("Số lượng bạn nhập hiện không đủ! ,Nhập lại");
//                check = false;
//            }
//        }while (!check);
//        OderDetail oderDetail = new  OderDetail(productID,quannity);
//        setNumberAfterAdd(products,productID,quannity);
//        return oderDetail;
        boolean check = false;
        int productID =0;
        int quannity = 0 ;
        do {
            System.out.println("Mời bạn nhập id sản phẩm:");
            try {
                productID = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! id Bạn phải nhập vào số nguyên dương!!!");
                continue;
            }
            for (Product product: products) {
                if (product.getId()==productID&&product.getNumber()!=0){
                   check = true;
                }
            }
            if (!check){
                System.out.println("Id bạn nhập không đúng hoặc đã hết hàng, Nhập lại!");
            }

        } while (!check);

        Product product = productHandle.checkByProductID(products,productID);
        do {
            System.out.println("Mời bạn nhập số lượng muốn mua:");
            try {
                quannity = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! Bạn phải nhập vào 1 số nguyên dương và ít nhất bằng 1!!!");
                System.out.println("Mời bạn nhập lại số lượng muốn mua:");
                quannity = Integer.parseInt(scanner.nextLine());
//                continue;
            } if (quannity<1){
                System.out.println("Số lượng bạn mua phải ít nhất là 1!,Hãy nhập lại");
                check = false;
            }
            else if (product != null && product.getNumber() >= quannity){
                check = true;
//            }else if (product!=null&&product.getNumber()==0){
//                System.out.println("Sản phẩm này hiện đã hết vui lòng chọn sản phẩm khác!");
//                addOderDetail(scanner, products);
            }else if (product!=null&&product.getNumber()<quannity) {
                System.out.println("Số lượng bạn nhập hiện không đủ! ,Nhập lại");
                check = false;
            }
        } while (!check);
        OderDetail oderDetail = new  OderDetail(productID,quannity);
        setNumberAfterAdd(products,productID,quannity);
        return oderDetail;
    }

    /* Đây là hàm thay đổi số lượng kho sau khi mua hàng thành công */
    public void setNumberAfterAdd(ArrayList<Product> products,int idProduct,int quanity){
        for (int i = 0; i <products.size() ; i++) {
            if (products.get(i).getId()==idProduct){
                products.get(i).setNumber(products.get(i).getNumber()-quanity);
            }
        }
    }
}

