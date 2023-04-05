package OOP.BTVN.BTVN3;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên IT");
        System.out.print("Mời bạn nhập tên sinh viên:");
        String nameIT = scanner.nextLine();
        System.out.print("Mời bạn nhập ngành học sinh viên:");
        String majorsIT = scanner.nextLine();
        System.out.print("Mời bạn nhập diểm môn Java :");
        double markJava = Double.parseDouble(scanner.nextLine());
        System.out.print("Mời bạn nhập điểm HTML :");
        double markHtml = Double.parseDouble(scanner.nextLine());
        System.out.print("Mời bạn nhập diểm CSS :");
        double markCss = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập thông tin sinh viên BIz");
        System.out.print("Mời bạn nhập tên sinh viên:");
        String nameBiz = scanner.nextLine();
        System.out.print("Mời bạn nhập ngành học sinh viên:");
        String majorsBiz = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm Marketing sinh viên:");
        double markMarketing = Double.parseDouble(scanner.nextLine());
        System.out.print("Mời bạn nhập điểm Sales sinh viên:");
        double markSales = Double.parseDouble(scanner.nextLine());
       SinhVienIT sinhVienIT = new SinhVienIT(nameIT,majorsIT,markJava,markHtml,markCss);
       SinhVienBiz sinhVienBiz = new SinhVienBiz(nameBiz,majorsBiz,markMarketing,markSales);
        System.out.println("Thông tin SinhVienIT :");
       sinhVienIT.xuat();
        System.out.println("Thông tin SinhVienBiz :");
       sinhVienBiz.xuat();
    }
}
