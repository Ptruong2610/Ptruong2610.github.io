package OOP.BTVN.BTVN1;

public class HinhChuNhat extends HinhHoc{

    private double length;
    private double width;

    public HinhChuNhat(){

    }
    public HinhChuNhat(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double chuVi() {
        return (length+width)*2;
    }

    @Override
    public double dienTich() {
        return length*width;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
