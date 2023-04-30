import entity.Oder;
import entity.Product;
import handle.OderHandle;
import handle.ProductHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainWeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OderHandle oderHandle = new OderHandle();
        ProductHandle productHandle = new ProductHandle();
        ArrayList<Oder> oders = new ArrayList<>();
        ArrayList<Product> products =new ArrayList<>();
        Product product = new Product("Iphone5s",5,1000);
        products.add(product);
        Product product1 = new Product("Iphone6s",5,1500);
        products.add(product1);
        Product product2 = new Product("Iphone7s",5,2000);
        products.add(product2);
        Product product3 = new Product("Iphone8s",5,2500);
        products.add(product3);
        System.out.println(products);
        oderHandle.inputOder(scanner,products,oders);
        System.out.println(oders);
        System.out.println(products);
    }

}
