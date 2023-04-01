package OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Car audi = new Car();
//        Car nissan = new Car();
//        Season season = Season.Spring;
//        System.out.println(season);
//
//        audi.checkThis();
//        Product laptop = new Product();
//        laptop.setId("1");
//        laptop.setName("Asus");
//        laptop.setPrice(20000);
//        double rate = laptop.caculateVate(laptop.getPrice());
//        System.out.println("Thuế nhập khẩu của SP là:"+rate);
//        String info = laptop.toString();
//        System.out.println(info);
//        System.out.println(laptop);
//         Employee employee = new Employee();
//         employee.setId(1);
//         employee.setName("Trường");
//         employee.setAge(25);
//         employee.setExperience(2);
//        System.out.println(employee);
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhập số lương Employee: ");
        int n = Integer.parseInt(sc.nextLine());
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho người thứ: "+(i+1));
            System.out.println("Mời bạn nhập id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhập name: ");
            String name = sc.nextLine();
            System.out.println("Mời bạn nhập age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhập experience: ");
            int exp = Integer.parseInt(sc.nextLine());
            Employee employee = new Employee(id,name,age,exp);
            employees[i]= employee;
        }
        for (Employee info:employees) {
            System.out.println(info);
        }





    }
}
