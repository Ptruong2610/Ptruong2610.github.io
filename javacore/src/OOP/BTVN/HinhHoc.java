package OOP.BTVN;

import java.util.Scanner;

public class HinhHoc {

    public Double chuViHCN(double a, double b){return (a+b)*2;
    }
    public  double dienTichHCN(double a, double b){return a*b;}
    public  double chuviHV(double c){ return 4*c; }
    public double dienTichHV(double c){
       return c*c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhChuNhat rectangle = new HinhChuNhat();
       do {
           System.out.println("mời bạn nhập chiều dài HCN:");
           rectangle.setLength(sc.nextDouble());
//        double length = sc.nextDouble();
           System.out.println("mời bạn nhập chiều rộng HCN:");
//        double width = sc.nextDouble();
//        HinhChuNhat rectangle = new HinhChuNhat(length,width);
           rectangle.setWidth(sc.nextDouble());
           if (rectangle.getLength()==rectangle.getWidth()){
               System.out.println("MỜi bạn nhập lại chiều dài phải khác chiều rộng ");
           }
       }while (rectangle.getLength()==rectangle.getWidth());


        HinhVuong square = new HinhVuong();
        System.out.println("mời bạn nhập cạnh hình vuông");
        square.setSide(sc.nextDouble());
        System.out.println(rectangle);
        rectangle.tinhChuViHCN();
        rectangle.tinhDienTichHCN();
        System.out.println(square);
        square.tinhChuViHV();
        square.tinhDienTichHV();


    }


}
