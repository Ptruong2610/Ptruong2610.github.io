package handle;

import entity.Oder;
import entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class OderHandle {
    ProductHandle productHandle = new ProductHandle();
    public void inputOder(Scanner scanner,ArrayList<Product> products,ArrayList<Oder>oders){
        System.out.println("Mời bạn nhập thông tin sản phẩm muốn mua : ");
        Product product = productHandle.inputProduct(scanner);
        System.out.println("Nhập tên bạn: ");
        String customerName = scanner.nextLine();
        System.out.println("Nhập địa chỉ giao hàng: ");
        String address = scanner.nextLine();
        System.out.println("Nhập số điện thoại :");
        String phone = scanner.nextLine();
//        boolean check = false;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getName().equalsIgnoreCase(product.getName())){
//                check = true;
//                break;
//            }
//
//        }
        if (checkNumber(products, product)){
            Oder oder=  new Oder(product,customerName,address,phone);
            oders.add(oder);

        }else {
            System.out.println("Không tìm thấy sản phẩm");
        }
//        System.out.println("Nhập số lượng muốn sửa:");
//        int number = Integer.parseInt(scanner.nextLine());
//        number = product.getNumber();
//        for (int i = 0; i < oders.size(); i++) {
//            if (oders.get(i).getId()==1){
//                oders.get(i).setProduct(product.setNumber(number));
//            }
//        }


    }
    public boolean checkNumber(ArrayList<Product> products, Product product){
        for (int i = 0; i <products.size() ; i++) {
            if (products.get(i).getName().equalsIgnoreCase(product.getName())&&products.get(i).getNumber()>=product.getNumber()){
                products.get(i).setNumber(products.get(i).getNumber()-product.getNumber());
                return true;
            }

        }
        return false;
    }

}
