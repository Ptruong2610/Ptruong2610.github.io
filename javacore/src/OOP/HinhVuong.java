package OOP;

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

    public void tinhChuViHV(){
        System.out.println("Chu vi hình vuông là: "+super.chuviHV(side));
    }
    public void tinhDienTichHV(){
        System.out.println("Chu vi hình vuông là: "+super.dienTichHV(side));
    }
}

