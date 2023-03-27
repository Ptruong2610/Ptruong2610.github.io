import java.util.Scanner;

public class Exb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("moi ban nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Moi ban nhap b: ");
        double b = sc.nextDouble();
        double x;
         if(a==0 && b==0){
             System.out.println("Ptrinh VO SO NGHIEM");
         } else if (a==0 && b!=0){
             System.out.println("Ptrinh VO NGHIEM");
         } else {
             System.out.println("Ptrinh co nghiem la: x=" +(-b/a));
         }
    }
}
