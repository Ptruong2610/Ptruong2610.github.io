package entity;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate date;
    private String homeTown;

    public Student(String name, LocalDate date, String homeTown) {
        this.name = name;
        this.date = date;
        this.homeTown = homeTown;
        date.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
