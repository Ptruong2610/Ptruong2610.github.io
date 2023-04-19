package OOP.BTVN.ExInterface.handle;

import OOP.BTVN.ExInterface.entity.Account;
import OOP.BTVN.ExInterface.menu.AccountMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountHandle {
    public void inputAccount(Scanner scanner){

        System.out.println("Nhập tên tài khoản");
        String name = scanner.nextLine();
        System.out.println("Nhập số tài khoản");
        int accountNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email tài khoản");
        String email = scanner.nextLine();
        System.out.println("Nhập số dư tài khoản");
        double accountBalance = Double.parseDouble(scanner.nextLine());

        Account account = new  Account(name,accountNumber,email,accountBalance);
//        accounts.add(account);
        System.out.println(account);
        AccountMenu accountMenu = new AccountMenu();
        accountMenu.selectAccount(scanner,account);
    }

}

