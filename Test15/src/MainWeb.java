import entity.Oder;
import entity.OderDetail;
import entity.Product;
import entity.User;
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
        ArrayList<Oder> oders = new ArrayList<>();
        ArrayList<Product> products =new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        User user = new User("admin","admin","smaker26101998@gmail.com",0);
        users.add(user);
        User user1 = new User("admin1","admin1","smaker15101998@gmail.com",1);
        users.add(user1);
        User user2 = new User("admin2","admin2","smaker@gmail.com",0);
        users.add(user2);
        Product product = new Product("Iphone5s","Iphone",5,1000);
        products.add(product);
        Product product1 = new Product("Iphone6s","Iphone",5,1500);
        products.add(product1);
        Product product2 = new Product("Iphone7s","Iphone",5,2000);
        products.add(product2);
        Product product3 = new Product("Iphone8s","Iphone",0,2500);
        products.add(product3);

        Menu menu = new Menu();
        menu.selectMenu(scanner,products,users,oders);

    }

}
