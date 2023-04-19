package interfacee.handle;

import interfacee.entity.Yasuo;

import java.util.Scanner;

public class YasuoHandle {
    public Yasuo inputYasuo(Scanner scanner){
        System.out.println("Nhập hair:");
        String hair = scanner.nextLine();
        System.out.println("Nhập vũ khí:");
        String weapon = scanner.nextLine();
        Yasuo yasuo = new Yasuo(hair,weapon);
        return yasuo;
    }
}
