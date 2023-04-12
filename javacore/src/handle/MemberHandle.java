package handle;

import entity.Members;

import java.util.Scanner;

public class MemberHandle {
    public Members inputMember(Scanner scanner){
        System.out.println("Mời bạn nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập dob:");
        String dob = scanner.nextLine();
        System.out.println("Mời bạn nhập công việc:");
        String job = scanner.nextLine();
        Members members = new Members(name,dob,job);
        return members;
    }

}
