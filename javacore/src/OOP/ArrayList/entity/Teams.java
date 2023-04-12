package OOP.ArrayList.entity;

import OOP.ArrayList.entity.Commander;

import java.util.ArrayList;

public class Teams {
    private String name;
    private ArrayList<Commander> commander;

    public Teams(String name, ArrayList<Commander> commander) {
        this.name = name;
        this.commander = commander;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "name='" + name + '\'' +
                ", commander=" + commander +
                '}';
    }
}
