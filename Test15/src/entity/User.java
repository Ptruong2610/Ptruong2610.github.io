package entity;

import java.util.ArrayList;

public class User {
    private static int autoID;
    private int id;
    private String userName;
    private String passWord;
    private String email;
    private int role;
//    private ArrayList<Oder> oders;


    public User(String userName, String passWord, String email, int role) {
        this.id = ++autoID;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
