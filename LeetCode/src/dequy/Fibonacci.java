package dequy;

import java.util.Arrays;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int fib1 = 1;
            int fib2 = 1;
            int fibN = 1;
            for (int i = 3; i <= n; i++) {
                fibN = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibN;
            }
            return fibN;
        }
    }
    public static int fib(int n){
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else
            return fib(n-1)+ fib(n-2);
    }

    public static int search(int[] a, int key, int start) {
        if (start >= a.length) {
            return -1;
        }
        if (a[start] == key) {
            return start;
        }
        return search(a, key, start + 1);
    }
    public static void main(String[] args) {
        int n = 4;
        int result = Fibonacci.fib(n);
        System.out.println("Fibonacci(" + n + ") = " + result);

        int[] a = {1 ,4 ,9 ,12 ,19 ,25 ,31 ,46 ,50 ,57 ,72};

//        int key = 50;
//        int index = Arrays.binarySearch(a, key);
//        if (index >= 0) {
//            System.out.println("Vị trí của số 50 trong mảng là: " + index);
//        } else {
//            System.out.println("Không tìm thấy số 50 trong mảng" +index);
//        }
    // de quy
        int key = 50;
        int index = search(a, key, 0);
        if (index >= 0) {
            System.out.println("Vị trí của số 50 trong mảng là: " + index);
        } else {
            System.out.println("Không tìm thấy số 50 trong mảng");
        }
    }
}
