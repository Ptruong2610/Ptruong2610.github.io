import entity.Student;
import handle.StudentHandle;
import view.Menu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        Menu menu = new Menu();
//        menu.selectType(scanner);
        System.out.println("Mời bạn nhập số lượng student muốn tạo:");
        int n = Integer.parseInt(scanner.nextLine());

        Student[] students = new Student[n];
        StudentHandle studentHandle = new StudentHandle();
        for (int i = 0; i < n; i++) {
            //Creat student
            Student student = studentHandle.inputStudent(scanner, i);
            //Lưu student vào trong array;
            students[i] = student;
        }
        //Display student form students[]
        studentHandle.displayStudents(students,n);
        //Display phần trăm loại học sinh
        studentHandle.getPercentage(students,n);

    }
}
