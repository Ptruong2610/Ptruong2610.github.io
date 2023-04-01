package OOP;

public class Car {
    String name;
    double price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //hàm khởi tạo có tham số
    public Car() {
        this.checkThis();
    }

    //Ham khởi tạo không tham số
    //phím tắt contructor: Alt insert
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void checkThis(){


    }

}