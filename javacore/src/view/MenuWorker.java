package view;

import entity.Worker;
import handle.WorkerHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuWorker {
    private void showMenu(Scanner scanner, ArrayList<Worker> workers){
        System.out.println("1. Add Worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down Slary");
        System.out.println("4. Display Information salary");
        System.out.println("5. Exit");


    }
    public void selectMenu(Scanner scanner, ArrayList<Worker> workers){

        int option ;
        WorkerHandle workerHandle = new WorkerHandle();
        do {
            showMenu(scanner,workers);
             option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    Worker worker = workerHandle.addWorker(scanner);
                    workers.add(worker);
                    break;
                case 2:
                    workerHandle.UpSalary(scanner,workers);
                    break;
                case 3:
                    workerHandle.DownSalary(scanner,workers);
                    break;
                case 4:
                    workerHandle.displayWorker(workers);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Nhập lại!!!");
                    break;

            }
        }while (option!=5);

    }
    public void showUpDownSalary(){
        System.out.println("1. Up salary");
        System.out.println("1. Down salary");
    }


}
