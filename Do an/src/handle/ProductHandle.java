package handle;

import entity.Product;

import java.util.Scanner;

public class ProductHandle {
    public Product inputProduct(Scanner scanner){
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập số lượng sản phẩm: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá tiền : ");
        int price = Integer.parseInt(scanner.nextLine());
        return new Product(name,number,price);
    }
//    public Product creatOder(Scanner scanner){
//        System.out.println("Nhập tên sản phẩm: ");
//        String name = scanner.nextLine();
//        System.out.println("Nhập số lượng sản phẩm: ");
//        int number = Integer.parseInt(scanner.nextLine());
//        return new Product(name,number);
//    }
}
