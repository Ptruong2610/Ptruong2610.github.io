import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("nhập vào số n:");
//        int sum = 0;
//        int n = sc.nextInt();
//        for (int i = 0; i <= n; i++) {
//            sum+= i;
//
//        }
//        System.out.println("Tổng=" +sum);
//
//        int mul = 1;
//        for (int i = 1; i <=n ; i++) {
//            mul*=i;
//        }
//        System.out.println("Tích=" +mul);
//    }
        //tinh tông các số chắc từ 0-n theo 3 cách
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int answer = 0;

        //Cach 1:

//             for (int i = 2; i <=n; i+=2) {
//                 answer+=i;
//             }
//        System.out.println(answer);
//
//
//        //Cách 2: While(điều_kiện)
        int i=2;
//        while(i<=n){
//            answer+=i;
//            i+= 2;
//        }
//        System.out.println(answer);

        //cách 3:do while
        do {
            answer+=i;
            i+=2;
        }while (i<=n);
        System.out.println(answer);

//        do{
//            if (n%2==0){
//                answer+=n;
//            }
//            n--;
//        }while(n>0);
//        System.out.println(answer);
         }



}
