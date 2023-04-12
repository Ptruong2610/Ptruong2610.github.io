package entity;

import java.util.ArrayList;

public class Tiktok {
    private ArrayList<Idol> idols;
    private ArrayList<Song> songs;

    public Tiktok(ArrayList<Idol> idols, ArrayList<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
