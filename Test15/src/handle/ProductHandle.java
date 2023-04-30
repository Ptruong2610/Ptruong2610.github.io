package handle;

import entity.Product;
import entity.User;

import java.util.ArrayList;
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
    public Product checkByProductID(ArrayList<Product> products, int productID){
        for (Product product:products
        ) {
            if (product.getId()==productID)
                return product;
        }
        return null;
    }
    public void displayProduct(ArrayList<Product> products){
        for (Product product: products
        ) {
            System.out.println(product);

        }
    }
}
