package TestOOP;

import TestOOP.entity.User;
import TestOOP.handle.UserHandle;
import TestOOP.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        String userName = "admin";
        String password = "admin";
        String email = "smaker26101998@gmail.com";
        User user = new User(userName,password,email);
        users.add(user);
        String userName1 = "admin1";
        String password1 = "admin1";
        String email1 = "smaker26101998@gmail.com";
        User user1 = new User(userName1,password1,email1);
        users.add(user1);
        Menu menu = new Menu();
        menu.selectMenu(scanner,users);
    }


}
