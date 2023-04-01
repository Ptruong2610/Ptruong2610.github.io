package OOP;

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

    public void tinhChuViHCN(){
//        super.chuViHCN(length,width);
        System.out.println("Chu vi HCN là:" +super.chuViHCN(length,width));
    }
    public void tinhDienTichHCN(){
        System.out.println("Diện tích hình chữ nhật là:" +super.dienTichHCN(length,width));
    }

}
