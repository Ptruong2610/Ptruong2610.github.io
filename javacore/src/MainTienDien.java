import entity.BienLai;
import handle.BienLaiHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTienDien {
    public static void main(String[] args) {
        BienLaiHandle bienLaiHandle = new BienLaiHandle();
        ArrayList<BienLai> bienLais = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn muốn nhập thông tin bao nhiêu hộ dân:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập hộ thứ "+(i+1)+" :");
            BienLai bienLai = bienLaiHandle.inputBienLai(scanner);
            bienLais.add(bienLai);
        }
        System.out.println(bienLais);
    }
}
