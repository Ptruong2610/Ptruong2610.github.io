package entity;

public class Student1 {
    private static int autoID;
    private int id;
    private String name;
    private double score;

    public Student1( String name, double score) {
        this.id = ++autoID;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "autoID=" + autoID +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
