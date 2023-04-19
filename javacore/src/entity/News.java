package entity;

import service.INews;

public class News implements INews {
    private String title;
    private String author;
    private String publicDate;
    private double rate;

    public News(String title, String author, String publicDate, double rate) {
        this.title = title;
        this.author = author;
        this.publicDate = publicDate;
        this.rate = rate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicDate='" + publicDate + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public void display() {
        System.out.println("Nhập title:"+title+"-author:");
        toString();

    }
}
