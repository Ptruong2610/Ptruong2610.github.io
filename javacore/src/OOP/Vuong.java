package OOP;

public class Vuong extends Shape{
    private  double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getChuVi() {
        return side*4;
    }

    @Override
    public double getdienTich() {
        return  side*side;
    }

    @Override
    public void xuat() {
        System.out.println(+getSide());
        System.out.println(+getChuVi());
        System.out.println(+getdienTich());
    }
}
