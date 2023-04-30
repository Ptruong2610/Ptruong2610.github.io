package handle;

import entity.BienLai;
import entity.KhachHang;


import java.util.Scanner;

public class BienLaiHandle {
    KhachHangHandle khachHangHandle = new KhachHangHandle();
    public BienLai inputBienLai(Scanner scanner){
        System.out.println("Mời bạn nhập thông tin hộ:");
        KhachHang khachHang = khachHangHandle.inputKhachHang(scanner);
        System.out.println("Nhập chỉ số cũ:");
        double chiSoCu = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chỉ số mới:");
        double chiSoMoi = Double.parseDouble(scanner.nextLine());

        BienLai bienLai = new BienLai(khachHang,chiSoCu,chiSoMoi);
        return bienLai;

    }
}
