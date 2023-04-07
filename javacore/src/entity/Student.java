package entity;

public class Student {
    private static int autoID;
    private int id;
    private String name;
    private double scoreMath;
    private double scourePhysic;
    private double scoureChemistry;
    public Student() {

    }

    public Student(String name, double scoreMath, double scourePhysic, double scoureChemistry) {
        this.id = ++autoID;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scourePhysic = scourePhysic;
        this.scoureChemistry = scoureChemistry;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScourePhysic() {
        return scourePhysic;
    }

    public void setScourePhysic(double scourePhysic) {
        this.scourePhysic = scourePhysic;
    }

    public double getScoureChemistry() {
        return scoureChemistry;
    }

    public void setScoureChemistry(double scoureChemistry) {
        this.scoureChemistry = scoureChemistry;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scourePhysic=" + scourePhysic +
                ", scoureChemistry=" + scoureChemistry +
                '}';
    }
}
