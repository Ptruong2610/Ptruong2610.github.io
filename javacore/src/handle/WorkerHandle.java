package handle;

import entity.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerHandle {
    public Worker addWorker(Scanner scanner ){
        System.out.println("Nhập name : ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mức lương: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập nơi làm việc: ");
        String workPlace = scanner.nextLine();
        System.out.println("Nhập status : ");
        String status = scanner.nextLine();
        System.out.println("Nhập ngày update: ");
        String date = scanner.nextLine();
        Worker worker = new Worker(name,age,salary,workPlace,status,date);
        return worker;
    }
    public  void UpSalary(Scanner scanner,ArrayList<Worker> workers  ){
        double up ;
        for (int i = 0; i <workers.size() ; i++) {
            System.out.println("Nhập số lương muốn sửa: ");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập status muôn sửa:");
            String status = scanner.nextLine();
            System.out.println("Nhập thời gian update lương:");
            String date = scanner.nextLine();

            up = workers.get(i).getSalary() + salary;
            workers.get(i).setSalary(up);
            workers.get(i).setStatus(status);
            workers.get(i).setDate(date);
        }
    }
    public  void DownSalary(Scanner scanner,ArrayList<Worker> workers  ){
        double down ;
        for (int i = 0; i <workers.size() ; i++) {
            System.out.println("Nhập số lương muốn sửa: ");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập status muôn sửa:");
            String status = scanner.nextLine();
            System.out.println("Nhập thời gian update lương:");
            String date = scanner.nextLine();

            down = workers.get(i).getSalary() - salary;
            workers.get(i).setSalary(down);
            workers.get(i).setStatus(status);
            workers.get(i).setDate(date);
        }
    }
    public void displayWorker(ArrayList<Worker> workers){
        for (Worker w:workers) {
            System.out.println(w);
        }

    }
}
