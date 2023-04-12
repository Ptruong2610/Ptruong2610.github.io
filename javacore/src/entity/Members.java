package entity;

public class Members {
    private static int autoID;
    private int id;
    private  String name;
    private String dob;
    private String job;

    public Members(String name, String dob, String job) {
        this.id = ++autoID;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Members{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
