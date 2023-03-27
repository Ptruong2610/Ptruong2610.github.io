import java.util.Scanner;

public class Btvn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again = "";
        do {
            System.out.print("Please input name student: ");
            String name = scanner.nextLine();
            System.out.print("Please input address student: ");
            String address = scanner.nextLine();
            System.out.print("Please input age student: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println(" information of the student: " +"name:" +name+" address:" +address+ " age:" + age);
            System.out.print("Do you want to continues?(Y/N): ");

             again = scanner.nextLine();

            // Kiểm tra ký tự ngắt
            if (again.equalsIgnoreCase("n")) {
                break;
            }
        } while (again.equalsIgnoreCase("y"));
    }
}
