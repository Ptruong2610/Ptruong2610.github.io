package OOP.ArrayList.handle;

import OOP.ArrayList.entity.Commander;

import java.util.Scanner;

public class CommanderHandle {
    public Commander inputCommander(Scanner scanner){
        System.out.println("Nhập tên vị tướng");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả cho vị tướng:");
        String position = scanner.nextLine();
        Commander commander = new Commander(name,position);
        return commander;
    }

}
