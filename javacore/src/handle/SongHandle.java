package handle;

import entity.Song;

import java.util.Scanner;

public class SongHandle {
    public Song inputSong(Scanner scanner){
        System.out.println("Mời bạn nhập tên bài hát: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập singer: ");
        String singer = scanner.nextLine();
        Song song = new Song(name,singer);
        return song;
    }
}
