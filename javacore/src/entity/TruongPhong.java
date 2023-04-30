package entity;

public class TruongPhong extends NVHanhChinh{
    private double luongTN;

    public TruongPhong(String hoTen, double luong, double luongTN) {
        super(hoTen, luong);
        this.luongTN = luongTN;
    }

    @Override
    public double tinhThuNhap() {
        return luong+luongTN;
    }

//    @Override
//    public double tinhthue() {
//        return 0;
//    }
}
