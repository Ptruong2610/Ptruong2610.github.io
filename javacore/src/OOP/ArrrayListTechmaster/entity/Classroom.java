package OOP.ArrrayListTechmaster.entity;

import java.util.ArrayList;

public class Classroom {
    private  String subject;
    private ArrayList<Student> students;

    public Classroom(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
}
