package OOP.BTVN.ExInterface;

import OOP.BTVN.ExInterface.entity.Account;
import OOP.BTVN.ExInterface.handle.AccountHandle;
import OOP.BTVN.ExInterface.menu.AccountMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class mainInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountHandle accountHandle = new AccountHandle();
        accountHandle.inputAccount(scanner);
    }
}
