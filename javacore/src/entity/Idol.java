package entity;

import java.util.ArrayList;

public class Idol extends Person{
    private static int autoID;
    private int id;

    private ArrayList<Follower> followers;

    public Idol(String name, String email, ArrayList<Follower> followers) {
        super(name, email);
        this.id = +autoID;
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "id=" + id +
                ", followers=" + followers +
                '}';
    }
}
