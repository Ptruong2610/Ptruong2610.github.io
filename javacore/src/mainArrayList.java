import entity.HouseHole;
import entity.Members;
import entity.Student;
import handle.HouseHandle;
import handle.MemberHandle;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mainArrayList {
    public static void main(String[] args) {
       /* ArrayList<String> arrayList = new ArrayList<String>();*/
//        List<Integer> list = new ArrayList<>();
////        ArrayList<Student> students = new ArrayList<Student>();

        Scanner scanner = new Scanner(System.in);

        MemberHandle memberHandle = new MemberHandle();

        Members members1 = memberHandle.inputMember(scanner);
        Members members2 = memberHandle.inputMember(scanner);

        ArrayList<Members> members = new ArrayList<>(Arrays.asList(members1,members2));
//        members.add(members1);
//        members.add(members2);

//        System.out.println(members);
//        System.out.println();
        HouseHandle houseHandle = new HouseHandle();
        HouseHole houseHole = houseHandle.inputHouseHole(scanner,members);
        System.out.println(houseHole);

    }
}
