package handle;

import entity.Follower;
import entity.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolHandle {
    public Idol inputIdol(Scanner scanner){
        System.out.println("Nhập tên Idol: ");
        String name = scanner.nextLine();
        System.out.println("Nhập email Idol: ");
        String email = scanner.nextLine();
        System.out.println("Bạn muốn nhập bao nhiêu followers: ");
        int n = Integer.parseInt(scanner.nextLine());
        FollowerHandle followerHandle = new FollowerHandle();
        ArrayList<Follower> followers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Follower follower = followerHandle.inputFollower(scanner);
            followers.add(follower);
        }
        Idol idol = new Idol(name,email,followers);
        return idol;
    }
}
