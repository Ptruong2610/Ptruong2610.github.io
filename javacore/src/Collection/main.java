package Collection;

import Collection.entity.Student;
import Collection.handle.StudentHandle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số h/s muốn thêm vào :");
        int n = Integer.parseInt(scanner.nextLine());
        StudentHandle studentHandle  = new StudentHandle();
        for (int i = 0; i < n; i++) {
            Student student = studentHandle.addStudent(scanner);
            map.put(student.getId(),student);
        }
        System.out.println(map);

        System.out.println("Mời bạn nhập vào id sinh viên:");
        int id = Integer.parseInt(scanner.nextLine());
        Student student = studentHandle.getStudentByID(id,map);
        System.out.println(student);
    }
}
