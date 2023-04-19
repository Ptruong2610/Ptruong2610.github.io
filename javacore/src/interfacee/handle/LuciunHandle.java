package interfacee.handle;

import interfacee.entity.Lucian;
import interfacee.entity.Yasuo;

import java.util.Scanner;

public class LuciunHandle {
    public Lucian inputLuciun(Scanner scanner){
        System.out.println("Nhập hair:");
        String hair = scanner.nextLine();
        System.out.println("Nhập vũ khí:");
        String weapon = scanner.nextLine();
        Lucian lucian = new Lucian(hair,weapon);
        return lucian;
    }
}
