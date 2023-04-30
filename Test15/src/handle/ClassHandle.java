//package handle;
//
//import entity.Class;
//import entity.Student;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ClassHandle {
//    public Class inputClass(Scanner scanner,ArrayList<Student> students){
//        System.out.println("Nhập vào tên lớp");
//        String nameClass = scanner.nextLine();
//        System.out.println("Nhập vào số học sinh của lớp:");
//        StudentHandle studentHandle = new StudentHandle();
//
//        int n = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập vào số học sinh thứ "+(i+1)+" : ");
//            Student student = studentHandle.inputStudent(scanner);
//            students.add(student);
//        }
//        Class classs = new Class(nameClass,students);
//        return classs;
//    }
//    public void checkClass( ArrayList<Student> students){
////        for (int i = 0; i < classes.size(); i++) {
//            for (int j = 0; j < students.size(); j++) {
//                if (students.get(j).getDate().getYear()==1985 && students.get(j).getHomeTown().equals("Thái Nguyên"))
//                    System.out.println(students);
//            }
////        }
//    }
//    public void checkByNameClass(ArrayList<Class> classes){
//        for (int i = 0; i < classes.size(); i++) {
//            if (classes.get(i).getNameClass().equals("10A1"))
//                System.out.println(classes);
//        }
//    }
//
//}
