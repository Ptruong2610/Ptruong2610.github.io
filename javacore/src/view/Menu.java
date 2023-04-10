package view;

import entity.Product;
import handle.ProductHandle;
import handle.StudentHandle;

import java.util.Scanner;

public class Menu {
    public void showMenu(){
        System.out.println("Hãy chọn công việc bạn muốn làm:");
        System.out.println("1.Hiển thị danh sách sản phẩm");
        System.out.println("2.Tìm sản phẩm theo tên");
        System.out.println("3.Tìm sản phẩm theo ID");
        System.out.println("4.Tìm các sản phẩm có số lượng < 5");
        System.out.println("5.Tìm sản phẩm theo mức giá");
        System.out.println("6.sắp xếp các sản phẩm theo mức giá:");
        System.out.println("7.Thoát");
    }

    public void menuSearchName(ProductHandle productHandle,Product[] products,Scanner scanner){
        System.out.println("Mời bạn nhập tên sản phẩm muốn tìm:");
        String name = scanner.nextLine();
        productHandle.checkNameProduct(products,name);

    }

    public Product menuSearchID(Scanner scanner,ProductHandle productHandle,Product[] products){
        System.out.println("Mời bạn nhập id sản phẩm muốn tìm:");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = productHandle.checkIDProduct(products,id);
        return product;
    }

    public void showMenuUpdateNumber(){
        System.out.println("Bạn có muốn cập nhật số lượng sản phẩm vừa tìm được không :");
        System.out.println("1.YES");
        System.out.println("2.NO");
    }
    public void menuUpdateNumberByID(Scanner scanner,ProductHandle productHandle,Product product){
        System.out.println("Nhập số lướng sp muốn update:");
        int numberNew = Integer.parseInt(scanner.nextLine());
        boolean checkUpdate = productHandle.updateProductByID(product,numberNew);
        if (checkUpdate){
            System.out.println("Update thành công");

        }  else System.out.println("KHông tìm thấy sản phẩm update!");
    }

    public void menuSelectByPrice(){
        System.out.println("Bạn muốn tìm sản phẩm theo mức giá nào? ");
        System.out.println("1: Dưới 50.000\n" +
                "2: Từ 50.000 đến dưới 100.000\n" +
                "3: Từ 100.000 trở lên");
        System.out.println("Mời b chọn");
    }

}
