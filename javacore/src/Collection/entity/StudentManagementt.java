package Collection.entity;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public abstract class StudentManagementt {
    public abstract Student addStudent(Scanner scanner);
    public abstract Student getStudentByID(int id, Map<Integer,Student> map);
    public abstract String removeStudentByID(int id, Map<Integer,Student> map);

}
