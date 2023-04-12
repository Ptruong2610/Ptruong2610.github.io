package handle;

import entity.HouseHole;
import entity.Members;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseHandle {
    public HouseHole inputHouseHole(Scanner scanner, ArrayList<Members> members){
        System.out.println("Mời bạn nhập số nhà:");
        int numberHouse = Integer.parseInt(scanner.nextLine());
//        members = new ArrayList<>();
        HouseHole houseHole = new HouseHole(numberHouse,members);
        return houseHole;
    }
}
