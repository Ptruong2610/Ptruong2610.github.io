package OOP.ArrayList;

import OOP.ArrayList.entity.SummonRift;
import OOP.ArrayList.handle.SummonRiftHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLOL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SummonRift> summonRifts = new ArrayList<>();
        SummonRiftHandle summonRiftHandle = new SummonRiftHandle();

        System.out.println("Mời bạn nhập số trận đấu:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập trận đấu thứ " + (i+1) + ":");
            SummonRift summonRift =  summonRiftHandle.inputSummonRift(scanner);
            summonRifts.add(summonRift);
        }
        
        System.out.println(summonRifts);
    }
}
