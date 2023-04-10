package entity;

public class Product {
    private static int autoID;
    private int id;
    private String name;
    private String detailed;
    private int number;
    private double price;
    private String calculationUnit;

    public Product() {
    }

    public Product(String name, String detailed, int number, double price, String calculationUnit) {
        this.id= ++autoID;
        this.name = name;
        this.detailed = detailed;
        this.number = number;
        this.price = price;
        this.calculationUnit = calculationUnit;
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

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCalculationUnit() {
        return calculationUnit;
    }

    public void setCalculationUnit(String calculationUnit) {
        this.calculationUnit = calculationUnit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", detailed='" + detailed + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", calculationUnit='" + calculationUnit + '\'' +
                '}';
    }


}
