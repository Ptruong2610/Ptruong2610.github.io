import entity.Worker;
import handle.WorkerHandle;
import view.MenuWorker;

import java.util.ArrayList;
import java.util.Scanner;

public class MainWorker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();
//        ArrayList<String> workers = new ArrayList<String>();
//        workers.add("ptruong.dev@gmail.com");
//        workers.add("123456");
//        workers.add("Smaker26101998@gmail.com");
//        System.out.println(workers);


        WorkerHandle workerHandle = new WorkerHandle();

        MenuWorker menuWorker = new MenuWorker();
        menuWorker.selectMenu(scanner,workers);


    }
}
