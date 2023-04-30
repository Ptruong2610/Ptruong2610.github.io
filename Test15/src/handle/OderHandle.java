package handle;

import entity.Oder;
import entity.Product;
import entity.User;

import java.util.ArrayList;
import java.util.Scanner;

public class OderHandle {
    ProductHandle productHandle = new ProductHandle();
    UserHandle userHandle = new UserHandle();
    public void inputOder(Scanner scanner,ArrayList<Product> products,ArrayList<User> users,ArrayList<Oder>oders,String username){
        System.out.println("Mời bạn nhập thông tin sản phẩm muốn mua : ");
        boolean check = false;

        int productID;
        int numberBuy;
        do {
            System.out.println("Mời bạn nhập id sản phẩm:");
            productID = Integer.parseInt(scanner.nextLine());
            for (Product product: products
                 ) {
                    if (product.getId()==productID)
                        check = true;
            }
            if (check==false){
                System.out.println("id sản phẩm nhập không đúng! Nhập lại");
            }
        }while (check==false);
        Product product = productHandle.checkByProductID(products,productID);
        do {
            System.out.println("Mời bạn nhập số lượng muốn mua:");
            numberBuy = Integer.parseInt(scanner.nextLine());
          if (product!=null&&product.getNumber()>=numberBuy){
              check = true;
          }else if (product!=null&&product.getNumber()<numberBuy){
              System.out.println("Số lượng bạn nhập hiện không đủ! ,Nhập lại");
              check = false;
          }
        }while (check==false);

        System.out.println("Mời bạn nhập vào tên:");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập vào địa chỉ giao hàng:");
        String address = scanner.nextLine();
        System.out.println("Mời bạn nhập vào số điện thoại:");
        String phone = scanner.nextLine();
        User user = userHandle.checkByUsername(users,username);
        if (user!=null&&product!=null){
        Oder oder = new Oder(user.getId(),product.getName(),numberBuy,product.getPrice(),name,address,phone,"Đang xử lý");
        oders.add(oder);
            setNumberAfterAdd(products,productID,numberBuy);
        System.out.println("Mua thành công");
        displayOder(oders);
        productHandle.displayProduct(products);
        }
    }
    public void setNumberAfterAdd(ArrayList<Product> products,int idProduct,int numberBuy){
        for (int i = 0; i <products.size() ; i++) {
            if (products.get(i).getId()==idProduct){
                products.get(i).setNumber(products.get(i).getNumber()-numberBuy);

            }
        }

    }
    public void displayOder(ArrayList<Oder> oders){
        for (Oder oder:oders
             ) {
            System.out.println(oder);
        }
    }


}
