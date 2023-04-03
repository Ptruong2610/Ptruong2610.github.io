package OOP.BTVN.BTVN1;

public class HinhVuong extends HinhHoc{
    private double side;

    public HinhVuong(){

    }
    public HinhVuong(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double chuVi() {
        return 4*side;
    }

    @Override
    public double dienTich() {
        return side*side;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "side=" + side +
                '}';
    }
}

