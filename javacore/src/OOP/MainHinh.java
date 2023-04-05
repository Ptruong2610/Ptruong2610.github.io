package OOP;

import OOP.BTVN.BTVN1.HinhChuNhat;

import java.util.Scanner;

public class MainHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChuNhat hcn = new ChuNhat();
        System.out.println("Nhập chiều dài:");
        hcn.setDai(scanner.nextDouble());
        System.out.println("Nhập chiều rong:");
        hcn.setRong(scanner.nextDouble());
        hcn.xuat();
        Vuong vuong = new Vuong();
        System.out.println("Nhập cạnh hình vuông");
        vuong.setSide(scanner.nextDouble());
        vuong.xuat();
    }
}
