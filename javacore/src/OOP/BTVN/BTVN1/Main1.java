package OOP.BTVN.BTVN1;

import java.util.Scanner;

public class Main1 {
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
        System.out.println("Mời bạn nhập cạnh hình vuông:");
        square.setSide(sc.nextDouble());
        System.out.println("Chu vi hình chữ nhật là:"+rectangle.chuVi());
        System.out.println("Diện tích hình chữ nhật là:"+rectangle.dienTich());
        System.out.println("Chu vi hình vuông là:"+square.chuVi());
        System.out.println("Diện tích hình vuông là:"+square.dienTich());
        System.out.println(rectangle);
        System.out.println(square);

    }
}
