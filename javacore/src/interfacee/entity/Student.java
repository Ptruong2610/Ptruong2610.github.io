package interfacee.entity;

import interfacee.service.IClassification;

public class Student implements IClassification {
    private String name;
    private int age;
    private double marks;
    private String classification;

    public Student(String name, int age, double marks, String classification) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", classification='" + classification + '\'' +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void classify() {
        if (marks >= 8) {
            System.out.println("A");
        } else if (marks < 8 && marks > 6.5) {
            System.out.println("B");
        } else if (marks <= 6.5) {
            System.out.println("C");
        }
    }
}
