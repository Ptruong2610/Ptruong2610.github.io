package dequy;
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
    public static void main(String[] args) {
        int n = 4;
        int result = Fibonacci.fib(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
