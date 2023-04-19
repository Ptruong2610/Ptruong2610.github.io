package handle;

import entity.News;

import java.util.Scanner;

public class NewsHandle {
    public News inputNews(Scanner scanner){
        System.out.println("mời bạn nhập vào title");
        String title = scanner.nextLine();
        System.out.println("mời bạn nhập vào author");
        String author = scanner.nextLine();
        System.out.println("mời bạn nhập vào publicDate");
        String publicDate = scanner.nextLine();
        System.out.println("mời bạn nhập vào rate");
        double rate = Double.parseDouble(scanner.nextLine());
        News news = new News(title,author,publicDate,rate);
        return news;
    }
}
