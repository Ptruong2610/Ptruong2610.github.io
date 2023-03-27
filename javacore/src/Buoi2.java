import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Buoi2 {
    public static void main(String[] args) {
//        String upperCase = "upperCase";
//        String lowerCase = "LOwerCase";
//        System.out.println(upperCase.toUpperCase());
//        System.out.println(lowerCase.toLowerCase());
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập tên :");
//        String name= sc.nextLine();
//
//        System.out.println("Nhập tuổi : ");
//        //khi nhập từ kiểu số về chuỗi ta dùng  Integer.parseInt để tránh nuốt lệnh
//        int age = Integer.parseInt(sc.nextLine());
//        System.out.println("age : " + age);
//
//        System.out.println("nhập địa chỉ :");
//        String address = sc.nextLine();
        //  auto boxing biến kiểu referent sang object
        int a = 5 ;
        Integer b = a;
        System.out.println(b);
        //unboxing biễn kiểu object sang referent
        int j = b.intValue();
        System.out.println(j);

        // cộng thêm ngày
        System.out.println(LocalDateTime.of(2023,03,23,21,3).plusDays(4));
        // cộng thêm tháng
        System.out.println(LocalDateTime.of(2023,03,23,21,3).plusMonths(3));
        // check thời gian vế trước trước có nhỏ hơn thời gian vế sau?
        System.out.println(LocalDateTime.of(2023,03,23,21,3).isBefore(LocalDateTime.of
                (2023,2,11,7,26)));

        //Local datetime
        String timeString = "1998/10/26";
        LocalDate localDate = LocalDate.parse(timeString, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDate);

    }
}
