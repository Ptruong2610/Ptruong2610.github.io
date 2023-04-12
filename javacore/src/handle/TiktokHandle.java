package handle;

import entity.Idol;
import entity.Song;
import entity.Tiktok;

import java.util.ArrayList;
import java.util.Scanner;

public class TiktokHandle {
    public Tiktok inputTiktok(Scanner scanner, ArrayList<Idol> idols, ArrayList<Song> songs){
       Tiktok tiktok = new Tiktok(idols,songs);
       return tiktok;

    }
}
