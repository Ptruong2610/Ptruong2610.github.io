import entity.*;
//import handle.OderHandle;
import handle.OderHandle;
import handle.ProductHandle;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainWeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductHandle productHandle = new ProductHandle();
        ArrayList<AdminHistory> adminHistories = new ArrayList<>();
        ArrayList<Oder> oders = new ArrayList<>();
        ArrayList<Product> products =new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        User user = new User("admin","admin","smaker26101998@gmail.com",1);
        users.add(user);
        User user1 = new User("Smaker26","Smaker26@","smaker15101998@gmail.com",0);
        users.add(user1);
        User user2 = new User("Ptruong26","Ptruong26@","smaker@gmail.com",0);
        users.add(user2);
        Product product = new Product("SamSung S23 Ultra 5G","SamSung",5,1000);
        products.add(product);
        Product product1 = new Product("Samsung Galaxy Z Fold4 5G","SamSung",5,1500);
        products.add(product1);
        Product product2 = new Product("OPPO Find N2 Flip 5G","OPPO",0,2000);
        products.add(product2);
        Product product3 = new Product("Xiaomi 13 series","Xiaomi",5,2500);
        products.add(product3);
        Product product4 = new Product("Nokia 105 4G","Nokia",5,2500);
        products.add(product4);
        Product product5 = new Product("Iphone11ProMax","Iphone",5,3500);
        products.add(product5);
        Product product6 = new Product("Iphone12ProMax","Iphone",5,4000);
        products.add(product6);
        Product product7 = new Product("Iphone13ProMax","Iphone",5,5500);
        products.add(product7);
        Product product8 = new Product("AVA+ LA Y68","AVA",5,170);
        products.add(product8);
        Product product9 = new Product("Anker PowerCore Essential A1287","Anker",5,1280);
        products.add(product9);


        Menu menu = new Menu();
        menu.selectMenu(scanner,products,users,oders,adminHistories);

    }

}
