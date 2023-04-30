package entity;

import java.util.ArrayList;

public class Class {
    private String nameClass;
    private ArrayList<Student> students;

    public Class(String nameClass, ArrayList<Student> students) {
        this.nameClass = nameClass;
        this.students = students;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "nameClass='" + nameClass + '\'' +
                ", students=" + students +
                '}';
    }
}
