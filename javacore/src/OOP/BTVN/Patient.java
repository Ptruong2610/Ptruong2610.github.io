package OOP.BTVN;

import java.util.Scanner;

public class Patient extends People {
    private int medicalRecord;
    private String hospitalizedDay;

    public Patient() {
    }

    public Patient(String name, String gender, String address, String dateOfBirth, int medicalRecord, String hospitalizedDay) {
        super(name, gender, address, dateOfBirth);
        this.medicalRecord = medicalRecord;
        this.hospitalizedDay = hospitalizedDay;
    }

    public int getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(int medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getHospitalizedDay() {
        return hospitalizedDay;
    }

    public void setHospitalizedDay(String hospitalizedDay) {
        this.hospitalizedDay = hospitalizedDay;
    }

    public void inputPatient(Scanner scanner){
        System.out.println("Nhập Thông tin của bệnh nhân:");
        super.input(scanner);
        System.out.print("Nhập số bệnh án:");medicalRecord = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập ngày vào viện:");hospitalizedDay = scanner.nextLine();
    }

    public void outputPatient(){
        System.out.println("-----------------------------");
        System.out.println("Thông tin của bệnh nhân:");
        super.output();
        System.out.println("số bệnh án:"+getMedicalRecord());
        System.out.println("ngày vào viện:"+getHospitalizedDay());
    }
}
