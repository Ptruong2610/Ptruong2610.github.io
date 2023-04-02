package OOP.BTVN;

import java.util.Scanner;

public class People {
    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;

    public People() {
    }

    public People(String name, String gender, String address, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void input(Scanner scanner){

        System.out.print("Nhập Họ Tên : ");name = scanner.nextLine();
        System.out.print("Nhập giới tính: ");gender = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");address = scanner.nextLine();
        System.out.print("Nhập ngày tháng năm sinh :");dateOfBirth = scanner.nextLine();
    }
    public void output(){

        System.out.println("Họ Tên : "+getName());
        System.out.println(" giới tính: "+getGender());
        System.out.println(" địa chỉ: "+getAddress());
        System.out.println("ngày tháng năm sinh :"+getDateOfBirth());
    }

}
