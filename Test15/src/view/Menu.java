package view;

import entity.Oder;
import entity.Product;
import entity.User;
import handle.OderHandle;
import handle.UserHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void menuStart(){
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Thoát");
    }

    public void menuLoginFail(){
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.println("3 - Thoát");
    }

    public void menuUserLogin(){
        System.out.println("1 - Tìm kếm Điện thoại theo giá tiền");
        System.out.println("2 - Mua hàng");
        System.out.println("3 - Đơn mua");
        System.out.println("4 - Đăng Xuất");
        System.out.println("5 - Thoát");
    }
    public void menuPO(){
        System.out.println("1 - Mua thêm");
        System.out.println("2 - Cập nhật đơn hàng");
        System.out.println("3 - Hủy đơn hàng");
        System.out.println("4 - Quay lại");
    }
    public  void menuAdminLogin(){
        System.out.println("1 - Thêm Sản phẩm");
        System.out.println("2 - Cập nhật sản phẩm");
        System.out.println("3 - Xóa sản phẩm");
        System.out.println("4 - Danh sách đơn hàng");
        System.out.println("5 - Đăng xuất");
        System.out.println("6 - Thoát");

    }
    public void menuAdminUpdateOder(){
        System.out.println("Bạn có muốn cập nhật trang thái đơn hàng không:");
        System.out.println("1 - Có");
        System.out.println("2 - Không");

    }

    public void selectMenu(Scanner scanner, ArrayList<Product> products, ArrayList<User> users, ArrayList<Oder> oders){
        UserHandle userHandle = new UserHandle();
        menuStart();
        int option = Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1:
                userHandle.login(scanner,products,users,oders);
                break;
            case 2:
                userHandle.signUp(scanner,products,users,oders);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Chọn lại!!!");
                selectMenu(scanner,products,users,oders);
                break;
        }
    }

    public void selectMenuUserLogin(Scanner scanner, ArrayList<Product> products, ArrayList<User> users, ArrayList<Oder> oders, String username){
            UserHandle userHandle = new UserHandle();
            OderHandle oderHandle = new OderHandle();
            menuUserLogin();
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    break;
                case 2:
                    oderHandle.inputOder(scanner,products,users,oders,username);
                    break;
                case 3:
                    break;
                case 4:
                    selectMenu(scanner,products,users,oders);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn Lại!!!");
                    selectMenuUserLogin(scanner,products,users,oders,username);
                    break;
            }
    }

    public void selectMenuAdminLogin(Scanner scanner,ArrayList<Product> products,ArrayList<User> users,ArrayList<Oder> oders,String username){
        UserHandle userHandle = new UserHandle();
        menuAdminLogin();
        int option = Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                selectMenu(scanner,products,users,oders);
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Chọn Lại!!!");
                selectMenuAdminLogin(scanner,products,users,oders,username);
                break;
        }
    }

    public void selectMenuLoginFail(Scanner scanner,ArrayList<Product> products,ArrayList<User> users,ArrayList<Oder> oders){
        UserHandle userHandle = new UserHandle();
        menuLoginFail();
        int option = Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1:
                userHandle.login(scanner,products,users,oders);
                break;
            case 2:
                userHandle.isFailLogin(scanner,products,users,oders);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Chọn lại!!!");
                selectMenuLoginFail(scanner,products,users,oders);
        }
    }

}
