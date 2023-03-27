import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        String continues = "";
        do {
            System.out.print("moi ban nhap vao so nguyen:");
            int n = Integer.parseInt(sc.nextLine());
            sum+=n;
            System.out.println("Do you want to continue?(Y/N)");
            continues = sc.nextLine();
        }while (continues.equalsIgnoreCase("y"));
        System.out.println(sum);

    }
}

