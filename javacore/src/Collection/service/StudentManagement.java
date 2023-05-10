package Collection.service;

import Collection.entity.Student;

public interface StudentManagement {
    void addStudent(Student student);
    void removeStudent(int id);
    void getStudentByID(int id);
    void getAverageScore();
}
