package handle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {
    public Student inputStudent(Scanner scanner, int i){
        System.out.println("Mời bạn nhập tên Student thứ: " +(i+1));
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập môn toán");
        Double scoreMath = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập môn Physic");
        Double scourePhysic = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập môn Chemistry");
        Double scoureChemistry = Double.parseDouble(scanner.nextLine());
        Student student = new Student(name,scoreMath,scourePhysic,scoureChemistry);
        return student;
    }

    public double avgScoure(Student student){
        return (student.getScoreMath()+student.getScoureChemistry()+student.getScourePhysic())/3;
    }

    public void rankedAcademic(double avgScore){
        if (avgScore>=8){
            System.out.println("Xếp Loại A");

        } else if (avgScore<8&&avgScore>=6.5){
            System.out.println("Xếp loại B");

        } else if (avgScore<6.5){
            System.out.println("Xếp loại C");

        }
    }
    public void displayStudents(Student[] students,int n){
        for (int i = 0; i <  n; i++) {
            System.out.println(students[i]);
            System.out.println("Điểm trung bình của học sinh thứ "+ (i + 1) + " là :" + avgScoure(students[i]));
            rankedAcademic(avgScoure(students[i]));
        }
    }

    public void getPercentage(Student[] students,int n){
        int demA=0;
        int demB=0;
        int demC=0;
        for (int i = 0; i < n; i++) {
            if (avgScoure(students[i])>=8){
                demA++;
            }
            else if(avgScoure(students[i])<8&&avgScoure(students[i])>=6.5){
                demB++;
            }
            else if(avgScoure(students[i])<6.5){
                demC++;
            }
        }
        System.out.println("Số học sinh đạt loai A chiếm: "+(demA*100)/n+"%");
        System.out.println("Số học sinh đạt loai B chiếm: "+(demB*100)/n+"%");
        System.out.println("Số học sinh đạt loai C chiếm: "+(demC*100)/n+"%");

    }

}
