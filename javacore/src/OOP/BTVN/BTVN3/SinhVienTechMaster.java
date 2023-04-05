package OOP.BTVN.BTVN3;

import java.util.Scanner;

public abstract class SinhVienTechMaster {
    private String name;
    private String majors;


    public SinhVienTechMaster(String name, String majors) {
        this.name = name;
        this.majors = majors;
    }

    public String getName() {
        return name;
    }

    public String getMajors() {
        return majors;
    }

    public abstract double getDiem();
    public void getHocLuc(){
        if (getDiem()<5){
            System.out.println("Yếu");
        }else if (5<=getDiem()&&getDiem()<6.5){
            System.out.println("Trung bình");
        }else if (getDiem()>=6.5&&getDiem()<7.5){
            System.out.println("Khá");
        } else if (getDiem()>=7.5&&getDiem()<=10){
            System.out.println("Giỏi");
        }
    }
    public void xuat(){
        System.out.println("Họ tên của sinh viên:"+getName());
        System.out.println("Ngành học của sinh viên:"+getMajors());
        System.out.println("Điểm của sinh viên:"+getDiem());
        System.out.print("Học lực của sinh viên:");
        getHocLuc();

    }
}
