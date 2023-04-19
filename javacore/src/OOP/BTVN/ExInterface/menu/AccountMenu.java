package OOP.BTVN.ExInterface.menu;

import OOP.BTVN.ExInterface.entity.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountMenu {
    private void showMenuAccount(){
        System.out.println("1 - Nạp tiền vào tài khoản");
        System.out.println("2 - Sửa Email");
        System.out.println("3 - Hiển thị danh sách tài khoản");
        System.out.println("Vui lòng chọn:");
    }
    public void selectAccount(Scanner scanner, Account account){

        showMenuAccount();
        int option = Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1:
                System.out.println("Nhập số tiền muốn nạp");
                double amount = Double.parseDouble(scanner.nextLine());
                double a = account.recharge(amount);
                account.setAccountBalance(a);
                break;
            case 2:
                System.out.println("Nhập email mới :");
                String email = scanner.nextLine();
                account.changeEmail(email);
                break;
            case 3:
                account.displayInfo();
                break;
        }
    }
}
