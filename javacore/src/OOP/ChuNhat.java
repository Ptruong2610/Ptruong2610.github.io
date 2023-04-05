package OOP;

public  class ChuNhat extends Shape {
    private double dai;
    private double rong;

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    @Override
    public double getChuVi() {
        return (dai+rong)*2;
    }

    @Override
    public double getdienTich() {
        return dai*rong;
    }

    @Override
    public void xuat() {
        System.out.println(+getRong());
        System.out.println(+getDai());
        System.out.println(+getChuVi());
        System.out.println(+getdienTich());
    }
}
