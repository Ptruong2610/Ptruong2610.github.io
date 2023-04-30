package entity;

public abstract class NVHanhChinh  {
    protected static int autoMaNV;
    protected int maNV;
    protected String hoTen;
    protected double luong;

    public NVHanhChinh(String hoTen, double luong) {
        this.maNV = ++autoMaNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public abstract double tinhThuNhap();
    public  double tinhThue(){
        return tinhThuNhap()<11000?0: 0.1*(tinhThuNhap()-11000);
    }
}
