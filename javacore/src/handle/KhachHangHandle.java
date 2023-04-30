package handle;

import entity.KhachHang;

import java.util.Scanner;

public class KhachHangHandle {
    public KhachHang inputKhachHang(Scanner scanner){
        System.out.println("Nhập họ và tên chủ hộ: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập số nhà:");
        String soNha = scanner.nextLine();
        System.out.println("Nhập mã công tơ");
        int maSoCongTo = Integer.parseInt(scanner.nextLine());
        KhachHang khachHang = new KhachHang(hoTen,soNha,maSoCongTo);
        return khachHang;
    }
}
