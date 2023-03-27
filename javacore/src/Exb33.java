import java.util.Scanner;

public class Exb33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("moi ban nhap so dien: ");
//        double soDien = sc.nextDouble();
//
//        if(soDien>=0 && soDien<=50){
//            System.out.println("Tien dien cua ban la:" +(soDien*1000));
//
//        }else if (soDien>50){
//            System.out.println("Tien dien cua ban la: " +((50*1000)+(soDien-50)*1200));
//        }

//        System.out.print("moi ban nhap so dien: ");
//        int n = sc.nextInt();
//        switch ( n){
//            case 1:
//                System.out.println("N==1");
//                break;
//            case  2:
//                System.out.println("N==2");
//                break;
//            default:
//                System.out.println("N!1&2");
//
//        }

//        System.out.print("moi ban nhap hãng điện thoại: ");
//        String phone = sc.nextLine();
//        switch (phone){
//            case "IPhone":
//                System.out.println("Đây là hãng Iphone");
//                break;
//            case "SamSung":
//                System.out.println("Đây là hãng SamSung");
//                break;
//            case "OPPO":
//                System.out.println("Đây là hãng OPPO");
//                break;
//            default:
//                System.out.println("Đây là hãng gì vậy?");
//
//        }

        System.out.print("moi ban nhap a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("moi ban nhap b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("moi ban nhap phép tính: ");
        String n = sc.nextLine();

        switch (n){
            case "+":
                System.out.println("kết quả la a+b = " +(a+b));
                break;
            case "-":
                System.out.println("kết quả la a+b = " +(a-b)+  "và" +(b-a));
                break;
            case "*":
                System.out.println("kết quả la a+b = " +(a*b));
                break;
            case "/":
                System.out.println("kết quả la a+b = " +(a/b)+ "và" +(b/a));
                break;
            case "%":
                System.out.println("kết quả la a+b = " +(a%b)+ "và"  +(b%a));
                break;
            default:
                System.out.println("Đây là phép tính gì vậy?");

        }
    }

    }

