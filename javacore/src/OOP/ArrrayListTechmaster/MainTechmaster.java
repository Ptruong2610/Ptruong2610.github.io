package OOP.ArrrayListTechmaster;

import OOP.ArrrayListTechmaster.entity.Classroom;
import OOP.ArrrayListTechmaster.entity.Student;
import OOP.ArrrayListTechmaster.entity.TechMaster;
import OOP.ArrrayListTechmaster.handle.ClassroomHandle;
import OOP.ArrrayListTechmaster.handle.StudentHandle;
import OOP.ArrrayListTechmaster.handle.TechMasterHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTechmaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Classroom> classrooms = new ArrayList<>();
        ArrayList<TechMaster> techMasters = new ArrayList<>();

        System.out.println("Mời bạn nhập vào thông tin của trung tâm Techmaster:");
        System.out.println("Nhập tên quan lý lớp:");
        String classManage = scanner.nextLine();
        System.out.println("Nhập tên giảng viên:");
        String lecturer = scanner.nextLine();
        System.out.println("Mời nhập thong tin lớp học:");
        System.out.println("Nhập môn học:");
        String subject = scanner.nextLine();
        StudentHandle studentHandle = new StudentHandle();
        System.out.println("Nhập vào số học viên:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập học viện thứ " + (i + 1) + ":");
            Student student = studentHandle.inputStudent(scanner);
            students.add(student);
        }

        Classroom classroom = new Classroom(subject, students);
        classrooms.add(classroom);

        TechMaster techMaster = new TechMaster(classManage, lecturer, classrooms);
        techMasters.add(techMaster);

        System.out.println("Thông tin trung tâm TechMaster");
        System.out.println(techMasters);
        //thêm
//        Student student = studentHandle.inputStudent(scanner);
        studentHandle.addStudent(scanner, students);
        System.out.println(techMasters);

        //Sửa
        studentHandle.editStudentByID(scanner,students);
        System.out.println(techMasters);
        //Xóa
        studentHandle.deleteStudent(scanner,students);
        System.out.println(techMasters);
    }
}
