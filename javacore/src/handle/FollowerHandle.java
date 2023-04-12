package handle;

import entity.Follower;

import java.util.Scanner;

public class FollowerHandle {
    public Follower inputFollower(Scanner scanner){
        System.out.println("Nhập tên người theo dõi:");
        String name = scanner.nextLine();
        System.out.println("Nhập email người theo dõi:");
        String email = scanner.nextLine();
        System.out.println("Nhập số lượt like :");
        int numberOflike = Integer.parseInt(scanner.nextLine());
        Follower follower = new Follower(name,email,numberOflike);
        return follower;


    }
}
