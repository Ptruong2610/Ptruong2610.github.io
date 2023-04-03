package OOP.BTVN.BTVN2;

import java.util.Scanner;

public class Doctor extends People{
    private String department;
    private double workTime;

    public Doctor() {
    }

    public Doctor(String name, String gender, String address, String dateOfBirth, String department, double workTime) {
        super(name, gender, address, dateOfBirth);
        this.department = department;
        this.workTime = workTime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return super.toString()+
                "department='" + department + '\'' +
                ", workTime=" + workTime +
                '}';
    }

    public void inputDoctor(Scanner scanner){
        System.out.println("Nhập thông tin của bác sĩ");
        super.input(scanner);
        System.out.print("Nhập chuyên khoa:");department = scanner.nextLine();
        System.out.print("Nhập số giờ làm việc: ");workTime = Double.parseDouble(scanner.nextLine());
    }

}
