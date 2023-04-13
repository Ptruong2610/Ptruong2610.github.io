package OOP.ArrrayListTechmaster.entity;

import java.util.ArrayList;

public class TechMaster {
    private String classManage;
    private  String lecturer;
    private ArrayList<Classroom> classrooms;

    public TechMaster(String classManage, String lecturer, ArrayList<Classroom> classrooms) {
        this.classManage = classManage;
        this.lecturer = lecturer;
        this.classrooms = classrooms;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                "classManage='" + classManage + '\'' +
                ", lecturer='" + lecturer + '\'' +
                ", classrooms=" + classrooms +
                '}';
    }
}
