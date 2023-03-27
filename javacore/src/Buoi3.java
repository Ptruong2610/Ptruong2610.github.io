import java.util.Scanner;

public class Buoi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Moi ban nhap vao diem HS: ");
//        double diemHocSinh = sc.nextDouble();
//        if (diemHocSinh >= 8){
//            System.out.println("HSG");
//        } else if (diemHocSinh<8 && diemHocSinh>=6.5){
//            System.out.println("HSTT");
//        } else {
//            System.out.println("HSTB");
//        }
//
//        System.out.print("moi ban nhap so dien: ");
//        int n = sc.nextInt();
//        switch ( n){
//            case 1:
//                System.out.println("N==1");
//                break;
//            case  2:
//                System.out.println("N==2");
//                break;
//            default:
//                System.out.println("N!1&2");
//
//        }

//        for (int i = 0; i <10; i++) {
//            System.out.println(i);
//        }

        System.out.println("Mời bạn nhâp vào i=");
        int i = sc.nextInt();
        while(i>0) {
            System.out.println(i);
            i--;
        }
        do{
            System.out.println(i);
            i++;
        }while (i<=5);
    }
}
