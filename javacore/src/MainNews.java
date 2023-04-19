import OOP.BTVN.BTVN1.HinhChuNhat;
import entity.News;
import handle.NewsHandle;

import java.util.Scanner;

public class MainNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewsHandle newsHandle = new NewsHandle();
        News news = newsHandle.inputNews(scanner);
        news.display();
    }
}
