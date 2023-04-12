package entity;

import java.util.ArrayList;

public class HouseHole {
    private static int autoID;
    private int id;
    private int numberHouse;
    private ArrayList<Members> members;

    public HouseHole(int numberHouse, ArrayList<Members> members) {
        this.id = ++id;
        this.numberHouse = numberHouse;
        this.members = members;
    }

    @Override
    public String toString() {
        return "HouseHole{" +
                "id=" + id +
                ", numberHouse=" + numberHouse +
                ", members=" + members +
                '}';
    }
}
