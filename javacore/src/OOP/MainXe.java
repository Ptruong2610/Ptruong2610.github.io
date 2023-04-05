package OOP;

import java.util.Scanner;

public class MainXe {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nhập vào quãng đường:");
        double s = scanner.nextDouble();
        QLDS qlds = new QLDS();
        Bus bus = new Bus();
        bus.time(s);
        System.out.println(bus.time(s));
        RailwayTrain railwayTrain = new RailwayTrain();
        railwayTrain.time(s);
        System.out.println(railwayTrain.time(s));
        Plan plan = new Plan();
        plan.time(s);
        System.out.println(plan.time(s));


    }
}
