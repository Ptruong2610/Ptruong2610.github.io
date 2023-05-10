package entity;

public class Product {
    private static int autoID;
    private int id;
    private String name;
    private String nameBrand;
    private   int number;
    private int price;

    public Product(String name, String nameBrand, int number, int price) {
        this.id = ++autoID;
        this.name = name;
        this.nameBrand = nameBrand;
        this.number = number;
        this.price = price;
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

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nameBrand='" + nameBrand + '\'' +
                ", number=" + number +
                ", price=" + price +'$'+
                '}';
    }
}
