package OOP.ArrayList.handle;

import OOP.ArrayList.entity.Commander;
import OOP.ArrayList.entity.Teams;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamsHandle {
    public Teams inputTeams(Scanner scanner) {
        System.out.println("Nhập tên đội tham giá");
        String name = scanner.nextLine();
        System.out.println("Nhập 5 vị tướng:");
        CommanderHandle commander = new CommanderHandle();
        ArrayList<Commander> commanders = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin vị tướng thứ : "+(i+1) +":");
            Commander commander1 = commander.inputCommander(scanner);
            commanders.add(commander1);
        }
        Teams teams = new Teams(name,commanders);
        return teams;
    }
}
