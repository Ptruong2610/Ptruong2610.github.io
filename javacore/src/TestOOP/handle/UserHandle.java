package TestOOP.handle;
import TestOOP.entity.User;
import TestOOP.view.Menu;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserHandle {

    public void addUser(Scanner scanner,ArrayList<User> users){
        System.out.print("Nhập username:");
        String userName = scanner.nextLine();
        System.out.print("Nhập password:");
        String password = scanner.nextLine();
        System.out.print("Nhập email:");
        String email = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)||users.get(i).getEmail().equals(email)) {
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("Username hoặc Email đã tồn tại.Xin mời nhập lại");
            addUser(scanner,users);
        }else if (!checkRegexPassword(password)){
            System.out.println("Pass nhập sai cú pháp!Nhập lại");
            addUser(scanner,users);
        }
        else if (!checkRegexEmail(email)){
            System.out.println("Email nhập sai cú pháp!nhập lại");
            addUser(scanner,users);
        }
        else {
            User user =new User(userName,password,email);
            users.add(user);
        }
    }

    public void signInUser(Scanner scanner,ArrayList<User> users) {
        Menu menu = new Menu();
        System.out.print("Nhập username:");
        String userName = scanner.nextLine();
        System.out.print("Nhập password:");
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
            signInUser(scanner, users);
        }
        for (int i = 0; i < users .size(); i++) {
            if (users.get(i).getUserName().equals(userName)&&!users.get(i).getPassWord().equals(password)){
                System.out.println("Sai password");
                menu.menuErrPassword(scanner,users,userName);
            }
        }
        for (int i = 0; i < users .size(); i++) {
            if (users.get(i).getUserName().equals(userName)&&users.get(i).getPassWord().equals(password)){
                System.out.println("Chào mừng " + userName + ",bạn có thể thực hiện các công việc sau:");

                menu.menuLogin(scanner, users, userName);
            }
        }
    }

    public boolean checkRegexPassword(String password){
        Pattern patternPassword = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()._–[{}]:;',?/*~$^+=<>]).{7,15}$");
        return patternPassword.matcher(password).matches();
    }

    public boolean checkRegexEmail(String email){
        Pattern patternEmail = Pattern.compile("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$");
        return patternEmail.matcher(email).matches();
    }

    public User checkByUserName(ArrayList<User> users,String userName){
        for (User user: users) {
            if(user.getUserName().equals(userName)) return user;
        }
        return null;
    }

    public User checkByEmail(Scanner scanner,ArrayList<User> users, String email){

        for (User user: users) {
            if(user.getEmail().equals(email)) return user;
        }
        return null;
    }

    public void editUserName(Scanner scanner,ArrayList<User>users,User user){
        System.out.print("Nhập username mới: ");
        String newUserName = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(newUserName) ) {
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("username đã tồn tại, Nhập lại!");
            editUserName(scanner,users, user);
        }else if (user != null) {
            user.setUserName(newUserName);
            System.out.println("Đỏi username thành công!Vui Lòng đăng nhập lại để tiếp tục");
            signInUser(scanner,users);
        }

    }

    public void editEmail(Scanner scanner,ArrayList<User> users,User user){
        System.out.print("Nhập email mới: ");
        String newEmail = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(newEmail)){
                check = true;
                break;
            }
        }
        if (check&&user!=null){
            System.out.println("Email đã tồn tại, Nhập lại!");
            editEmail(scanner,users,user);
        }else if (!check &&user!=null&&!checkRegexEmail(newEmail)){
            System.out.println("Email sai cú pháp, Nhập lại!");
            editEmail(scanner,users,user);
        }else if (!check &&user!=null&&checkRegexEmail(newEmail)){
            user.setEmail(newEmail);
        }
    }

    public void editPassword(Scanner scanner,ArrayList<User> users,User user){
        System.out.print("Nhập password mới: ");
        String newPassword = scanner.nextLine();
        if (user!=null&&checkRegexPassword(newPassword)){
            user.setPassWord(newPassword);
            System.out.println("Đỏi password thành công!Vui Lòng đăng nhập lại để tiếp tục");
            signInUser(scanner,users);
        }else {
            System.out.println("Sai cú pháp,password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;), Nhập lại!");
            editPassword(scanner,users,user);
        }
    }


    public void searchEmailUpdatePassword(Scanner scanner, User user,ArrayList<User> users){
        System.out.println("Mời bạn nhập vào Email");
        String email = scanner.nextLine();
        if (user!=null&&user.getEmail().equals(email)){
            editPassword(scanner,users,user);
        }else if (user!=null&&!user.getEmail().equals(email)){
            System.out.println("Tài khoản không tồn tại");
            searchEmailUpdatePassword(scanner, user,users);
        }
    }


    public void displayUser(ArrayList<User> users){
        for (User user: users
             ) {
            System.out.println(user);

        }
    }
}
