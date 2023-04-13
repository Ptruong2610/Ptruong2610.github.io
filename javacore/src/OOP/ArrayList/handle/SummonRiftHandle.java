package OOP.ArrayList.handle;

import OOP.ArrayList.entity.SummonRift;
import OOP.ArrayList.entity.Teams;

import java.util.ArrayList;
import java.util.Scanner;

public class SummonRiftHandle {
    public SummonRift inputSummonRift(Scanner scanner){
        System.out.println("Nhập thời gian bắt đầu trận đấu: ");
        String timeStart = scanner.nextLine();
        ArrayList<Teams> teams = new ArrayList<>();
        System.out.println("Mười bạn nhập vào 2 team:");
        TeamsHandle teamsHandle = new TeamsHandle();
        for (int i = 0; i < 2; i++) {
            Teams teams1 = teamsHandle.inputTeams(scanner);
            teams.add(teams1);
        }
        SummonRift summonRift = new SummonRift(teams,timeStart);
        return summonRift;

    }
}
