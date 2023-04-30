package handle;

import entity.NVHanhChinh;
import entity.NVTiepThi;

import java.util.Scanner;

public class NVHanhChinhHandle {
    public NVTiepThi inputNVTiepThi(Scanner scanner) {
        System.out.println("Nhập tên nhân viên tiếp thị: ");
        String name = scanner.nextLine();
        System.out.println("Nhập lương nhân viên:");
        double luong = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập doanh số: ");
        double doanhSo = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hoa hồng: ");
        double hoaHong = Double.parseDouble(scanner.nextLine());
        NVTiepThi nvTiepThi = new NVTiepThi(name, luong, doanhSo, hoaHong);
        return nvTiepThi;
    }

    public void thuNhap(){

    }

}

