import java.util.Scanner;

public class Buoi4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số phần tử của mảng:");
//        int size = scanner.nextInt();
//        int sum = 0;
//        double tb;
//
//        // Cấp phát bộ nhớ mảng theo người dùng nhập vào
//        int[] array = new int[size];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("nhập giá trị cho phần tủ thứ " +(i+1)+ ":");
//            // gán giá trị cho phần tử trong mảng
//            array[i] = scanner.nextInt();
//        }
//        System.out.println("hiển thị giá trị mảng");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Giá trị của phần tử thứ " + (i+1)+"=" +array[i]);
//            sum+= array[i];
//
//            System.out.println("Lập phương của phần tử thứ "+(i+1)+"là : "+Math.pow(array[i],3 ));
//        }
//
//        tb = sum/ array.length;
//
//        System.out.println("Trung binh cong cac phan tu trong mang la : "+tb);

        // Mảng 2 chiều
//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 7;
//        numbers[0][1] = 5;
//        numbers[0][2] = 2;
//        numbers[1][0] = 4;
//        numbers[1][1] = 9;
//        numbers[1][2] = 6;
        System.out.println("mời bàn nhập vào số dòng: ");
        int row = scanner.nextInt();
        System.out.println("mời bàn nhập vào số cột: ");
        int column = scanner.nextInt();
       int[][] numbers = new int[row][column];

//Để duyệt mảng đa chiều cần sử dụng 2 vòng lặp, 1 vòng lặp duyệt hàng và một vòng lặp duyệt cột
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.printf("mời bạn nhập vào phần tử của [%d][%d]", i,j,":");
                numbers[i][j] = scanner.nextInt();

            }


        }
        int sumChan =0;
        int sumLe = 0;
        System.out.println("Mang vừa nhập là:");
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){

                if (numbers[i][j]%2==0){
                    sumChan+=numbers[i][j];
                }else {
                    sumLe+=numbers[i][j];
                }
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Tông các phần tử là chẵn trong mảng là :" +sumChan);
        System.out.println("Tông các phần tử là chẵn trong mảng là :" +sumLe);
    }
}
