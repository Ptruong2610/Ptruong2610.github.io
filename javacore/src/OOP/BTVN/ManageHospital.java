package OOP.BTVN;

import java.util.Scanner;

public class ManageHospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Doctor doctor = new Doctor();
        Patient patient = new Patient();
        doctor.inputDoctor(scanner);
        patient.inputPatient(scanner);
        doctor.outputDoctor();
        patient.outputPatient();

    }
}
