package OOP.ArrayList.entity;

import OOP.ArrayList.entity.Teams;

import java.util.ArrayList;

public class SummonRift {
    private ArrayList<Teams> teams;
    private String timeStart;

    public SummonRift(ArrayList<Teams> teams, String timeStart) {
        this.teams = teams;
        this.timeStart = timeStart;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "teams=" + teams +
                ", time='" + timeStart + '\'' +
                '}';
    }
}
