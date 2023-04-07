import entity.Student;
import handle.StudentHandle;
import view.Menu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        Menu menu = new Menu();
//        menu.selectType(scanner);
        int n;
        do {
            System.out.println("Mời bạn nhập số lượng student muốn tạo:");
             n = Integer.parseInt(scanner.nextLine());
             if (n<0)
                 System.out.println("Bạn phải tạo số lượng sinh viên muốn nhập phải lớn hơn 0");
        }while (n<0);

        Student[] students = new Student[n];
        StudentHandle studentHandle = new StudentHandle();
        for (int i = 0; i < n; i++) {
            //Creat student
            do {
                Student student = studentHandle.inputStudent(scanner, i);
                //Lưu student vào trong array;
                students[i] = student;
                if (students[i].getScoreMath()<0||students[i].getScoreMath()>10||students[i].getScourePhysic()<0
                        ||students[i].getScourePhysic()>10||students[i].getScoureChemistry()<0||students[i].getScoureChemistry()>10){
                    System.out.println("Bạn phải nhập điểm >0 và <10.Xin mời nhập lại:");
                }
            }while (students[i].getScoreMath()<0||students[i].getScoreMath()>10||students[i].getScourePhysic()<0
                    ||students[i].getScourePhysic()>10||students[i].getScoureChemistry()<0||students[i].getScoureChemistry()>10);
        }
        //Display student form students[]
        studentHandle.displayStudents(students,n);
        //Display Rating PercentageStudent
        studentHandle.getPercentage(students,n);

    }
}
