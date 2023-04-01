import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Câu 1:
        System.out.print("Nhập họ và tên của bạn: ");
        String fullName = scanner.nextLine();
        String[] words = fullName.split(" ");
        String fullName1 = "";
        for (String name: words) {
            fullName1 = fullName1+(name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase());
            fullName1 = fullName1 +" ";
        }
        System.out.println("Chuỗi sau khi được chuẩn hóa :" +fullName1);

        // Câu 2:
        int n;
        do {
            System.out.print("Nhập số phần tử cho mảng n = ");
             n = scanner.nextInt();

        }while(n<=0);
        int array[] = new int[n];
        System.out.println("Mời bạn nhập các phần tử cho mảng: ");
        for (int i = 0; i <n; i++) {
            System.out.print("Nhập phần tử thứ " +(i+1) + ": ");
            array[i] =scanner.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập là: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(array[i] + "\t");
            }
        System.out.println();
        System.out.println("Mảng sau khi thay đổi các Ptu chắn lên 1 đơn vị:");
        for (int i = 0; i <n ; i++) {
            if (array[i]%2==0){
                array[i] = array[i]+1;

            }
            System.out.print(array[i]+ "\t");
        }
        System.out.println();

        // Câu 3:
//    int array[] = new int[] {1,5,4,3,2,9,8,6,4,3};
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num>max){
                max = num;
            } else if (num<min){
                min = num;
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là : " +max);
        System.out.println("Giá trị nhỏ nhất của mảng là :"  +min);
    }


}
