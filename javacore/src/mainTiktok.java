import entity.Idol;
import entity.Song;
import handle.IdolHandle;
import handle.SongHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class mainTiktok {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);



        ArrayList<Song> songs = new ArrayList<>();
        ArrayList<Idol> idols = new ArrayList<>();

        System.out.println("Mười bạn nhập sối bài hát muốn tạo:");
        int numberOfSong = Integer.parseInt(scanner.nextLine());
        SongHandle songHandle = new SongHandle();
        for (int i = 0; i < numberOfSong; i++) {
            Song song = songHandle.inputSong(scanner);
            songs.add(song);
        }

        //Khởi tạo danh sách Idol
        System.out.println("Mười bạn nhập số lượng idol muốn tạo:");
        int numberOfIdol = Integer.parseInt(scanner.nextLine());
        IdolHandle idolHandle = new IdolHandle();
        for (int i = 0; i < numberOfIdol; i++) {
                Idol idol = idolHandle.inputIdol(scanner);
            idols.add(idol);
        }

    }
}
