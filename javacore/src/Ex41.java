import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

            System.out.println("Mời bạn nhập số dòng và cột ma 2 ma trận A và B:");
            System.out.println("mời bàn nhập vào số dòng: ");
            int row = scanner.nextInt();
            System.out.println("mời bàn nhập vào số cột: ");
            int column = scanner.nextInt();
            int[][] A = new int[row][column];
            int[][] B = new int[row][column];
        System.out.println(A.length);

        for (int i = 0; i < A.length ; i++) {
            for (int j = 0; j <A[i].length ; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập các phần tử cho ma trận B:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("B[" + i + "," + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Ma trận B:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int[][] C = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Ma trận tổng C:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
