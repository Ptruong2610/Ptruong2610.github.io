package OOP.ArrrayListTechmaster.handle;

import OOP.ArrrayListTechmaster.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandle {

    public Student inputStudent(Scanner scanner){
        System.out.println("Nhập tên học viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học viên:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập học lực:");
        String rank = scanner.nextLine();
        Student student = new Student(name,age,rank);
        return student;
    }
    public void addStudent(Scanner scanner, ArrayList<Student> students){
        System.out.println("Mời bạn nhập vào thông tin học viên cần thềm:");
        System.out.println("Mời bạn nhập tên:");
        String name = scanner.nextLine();

        System.out.println("Mời bạn nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Mời bạn nhập học lực:");
        String rank = scanner.nextLine();
       Student student = new Student(name,age,rank);
        students.add(student);
    }
    public void editStudentByID(Scanner scanner,ArrayList<Student> students){
        System.out.println("Nhập id học viên cần sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checkID = false;
        for (int i = 0; i <students.size() ; i++) {
            if (students.get(i).getId()==id){
                System.out.println("Nhập học lực mới muốn sửa");
                String rank = scanner.nextLine();
                students.get(i).setRank(rank);
                checkID=true;
            }
        }
        if (checkID==false) System.out.println("Không tìm thấy học viên nào");
    }
    public void deleteStudent(Scanner scanner,ArrayList<Student> students){
        System.out.println("Nhập tên học viên cần xóa:");
        String name = scanner.nextLine();
        boolean checkName = false;
        int delete=-1;
        for (int i = 0; i <students.size() ; i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)){
                checkName=true;
                delete= i;
                break;
            }
        }
        if (checkName==false) System.out.println("Không tìm thấy học viên nào");
        else {
            students.remove(delete);
        }
    }



}
