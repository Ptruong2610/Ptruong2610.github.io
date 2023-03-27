import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mời bạn nhập tên hàng nhập kho: ");
        String name = sc.nextLine();
        System.out.println("name: " + name);

        System.out.print("Mời bạn nhập ngày tháng năm sinh: ");
        String date = sc.nextLine();
        System.out.println("name: " + date);

        System.out.print("Mời bạn nhập thời gian nhập hàng yyyy/MM/dd HH:mm: ");
        String timeString = sc.nextLine();
        LocalDateTime lcdt = LocalDateTime.parse(timeString, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        System.out.println("Thời gian nhập hàng là: " + lcdt);

        System.out.print("Mời bạn nhập thời gian HH:mm:ss");
        String time = sc.nextLine();
        LocalTime lct = LocalTime.parse(time,DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("thời gian là : " + lct);



    }
}
