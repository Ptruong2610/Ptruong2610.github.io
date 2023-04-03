package OOP.BTVN.BTVN2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageHospital manageHospital = new ManageHospital();
        Doctor doctor = new Doctor();
        Patient patient = new Patient();
        patient.inputPatient(scanner);
        doctor.inputDoctor(scanner);
        manageHospital.setDoctor(doctor);
        manageHospital.setPatient(patient);
        System.out.println(manageHospital);
    }

}
