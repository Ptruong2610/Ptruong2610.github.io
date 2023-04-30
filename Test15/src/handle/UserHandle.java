package handle;

import entity.Oder;
import entity.Product;
import entity.User;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserHandle {
    Menu menu = new Menu();
    public void login(Scanner scanner, ArrayList<Product> products, ArrayList<User> users, ArrayList<Oder> oders){
        Menu menu = new Menu();
        System.out.print("username:");
        String userName = scanner.nextLine();
        System.out.print("password:");
        String password = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName) ) {
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Kiểm tra lại username");
            login(scanner,products,users,oders);
        }
        for (int i = 0; i < users .size(); i++) {
            if (users.get(i).getUserName().equals(userName)&&!users.get(i).getPassWord().equals(password)){
                System.out.println("Sai password");
                menu.selectMenuLoginFail(scanner,products,users,oders);
            }
        }
        for (int i = 0; i < users .size(); i++) {
            if (users.get(i).getUserName().equals(userName)&&users.get(i).getPassWord().equals(password)){
                if (users.get(i).getRole()==0){
                    System.out.println("Chào mừng " + userName);
                    menu.selectMenuUserLogin(scanner,products,users,oders,userName);
                }else if (users.get(i).getRole()==1){
                    System.out.println("Chào mừng " + userName);
                    menu.selectMenuAdminLogin(scanner,products,users,oders,userName);
                }
            }
        }
    }

    public void signUp(Scanner scanner,ArrayList<Product> products,ArrayList<User> users,ArrayList<Oder> oders){
        boolean check = false;
        String username;
        String password;
        String email;
        do {
            System.out.println("Nhập username: ");
            username = scanner.nextLine();
            if (isUsernameTaken(users,username)){
                System.out.println("username đã tồn tại: ");
                check = true;
            }else  if (!isUsernameTaken(users,username)){
                check = false;
            }
        }while (check==true);

        do {
            System.out.println("Nhập password: ");
            password = scanner.nextLine();
            if (!checkRegexPassword(password)){
                System.out.println("password không đúng cú pháp! Nhập lại: ");
                check = true;
            }else  if (checkRegexPassword(password)){
                check = false;
            }
        }while (check==true);
        do {
            System.out.println("Nhập email: ");
            email = scanner.nextLine();
            if (isEmailTaken(users,email)){
                System.out.println("email đã tồn tại: ");
                check = true;
            }else  if (!isEmailTaken(users,username)&&!checkRegexEmail(email)){
                System.out.println("email nhập không đúng cú pháp! Nhập lại");
                check = true;
            } else if (!isEmailTaken(users,username)&&checkRegexEmail(email)){
                check = false;
            }
        }while (check==true);
        User user = new User(username,password,email,0);
        users.add(user);
        System.out.println("Đăng ký tài khoản thành công! Xin mời bạn đăng nhập");
        displayUser(users);
        login(scanner,products,users,oders);


    }

    public void isFailLogin(Scanner scanner, ArrayList<Product> products, ArrayList<User> users, ArrayList<Oder> oders){
        System.out.println("Mời bàn nhập Email đăng ký tk để kiểm tra:");
        String email = scanner.nextLine();
        for (User user: users
             ) {
            if (isEmailTaken(users,email)){
                System.out.println("Nhập password mới: ");
                String newPassword = scanner.nextLine();
                user.setPassWord(newPassword);
                System.out.println("Đổi password thành công!Xin mời đăng nhập lại");

            }else if (!isEmailTaken(users, email)){
                System.out.println("Email bạn nhập không tồn tại!");
                isFailLogin(scanner,products,users,oders);
            }
            menu.selectMenu(scanner,products,users,oders);
        }
    }

    public User checkByUsername(ArrayList<User> users, String username){
        for (User user: users
             ) {
        if (user.getUserName().equals(username))
            return user;
        }
        return null;
    }

    public boolean isUsernameTaken(ArrayList<User> users,String username){
        for (User user:users
             ) {
            if (user.getUserName().equals(username))
                return true;
        }
        return false;
    }
    public boolean isPasswordTaken(ArrayList<User> users,String password){
        for (User user:users
        ) {
            if (user.getPassWord().equals(password))
                return true;
        }
        return false;
    }
    public boolean isEmailTaken(ArrayList<User> users,String email){
        for (User user:users
        ) {
            if (user.getEmail().equals(email))
                return true;
        }
        return false;
    }
    public boolean checkRegexPassword(String password){
        Pattern patternPassword = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()._–[{}]:;',?/*~$^+=<>]).{7,15}$");
        return patternPassword.matcher(password).matches();
    }

    public boolean checkRegexEmail(String email){
        Pattern patternEmail = Pattern.compile("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$");
        return patternEmail.matcher(email).matches();
    }

    public void displayUser(ArrayList<User> users){
        for (User user: users
        ) {
            System.out.println(user);
        }
    }

}
