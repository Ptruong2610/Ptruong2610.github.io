import java.util.Scanner;

public class EXb32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("moi ban nhap a: ");
        double a = sc.nextDouble();
        System.out.print("moi ban nhap b: ");
        double b = sc.nextDouble();
        System.out.print("moi ban nhap c: ");
        double c = sc.nextDouble();
        double delta = b*b-4*a*c;

        if (a==0){
            if (b==0){
                System.out.println("PT vo nghiem");
            } else {
                System.out.println("Ptrinh co nghiem la: x=" + (-c / b));
            }
        }else {
            if (delta < 0) {
                System.out.println("Pt vo nghiem roi");
            } else if (delta == 0) {
                System.out.println("PT co nghiem la: x1=x2=" + (-b / a));
            } else {
                System.out.println("PT co nghiem la: x1=" + ((-b - Math.sqrt(delta)) / (2 * a)) + "va x2=" + ((-b + Math.sqrt(delta)) / (2 * a)));
            }
        }
    }
}
