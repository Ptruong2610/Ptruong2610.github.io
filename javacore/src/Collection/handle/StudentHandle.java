package Collection.handle;

import Collection.entity.Student;
import Collection.entity.StudentManagementt;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class StudentHandle extends StudentManagementt {

    @Override
    public Student addStudent(Scanner scanner) {
        System.out.println("Mời bạn nhập hs:");
        String name = scanner.nextLine();
        System.out.println("Nhập điểm");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(name,score);
        return student;
    }

    @Override
    public Student getStudentByID(int id, Map<Integer, Student> map) {
        return map.get(id);
    }

    @Override
    public String removeStudentByID(int id, Map<Integer, Student> map) {
       if (map.remove(id)!=null)
           return "Xóa thành công";
           return "KHông tìm thấy Student với id:"+id;
    }


}
