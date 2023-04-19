package interfacee.entity;

import interfacee.service.Polygon;

public class Square implements Polygon {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void calArea() {
        System.out.println("Chu vi hình vuông là:"+(4*side));
        System.out.println("diện tích hình vuông là:+(side*side)");
    }
}
