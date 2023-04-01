import java.util.Scanner;

public class Buoi5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputName(scanner);

    }
    public static String inputName(Scanner scanner){
        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        return  name;
    }
}
