package OOP.BTVN.ExInterface.entity;

import OOP.BTVN.ExInterface.service.IAccount;

import java.util.ArrayList;

public class Account implements IAccount {
    private String name;
    private int accountNumber;
    private String email;
    private double accountBalance;


    public Account(String name, int accountNumber, String email, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", email='" + email + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    @Override
    public double recharge(double amount) {

       return  getAccountBalance()+amount ;

    }

    @Override
    public void changeEmail(String email) {

          setEmail(email);

    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }
}
