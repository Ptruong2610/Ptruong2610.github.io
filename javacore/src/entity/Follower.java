package entity;

public class Follower extends Person {
    private static int autoID;
    private int id;
    private  int numberOfLike;

    public Follower(String name, String email, int numberOfLike) {
        super(name, email);
        this.id = ++autoID;
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + id +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
