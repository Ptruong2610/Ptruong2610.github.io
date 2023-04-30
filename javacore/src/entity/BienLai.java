package entity;

import java.util.ArrayList;

public class BienLai {
    private KhachHang khachHang;
    private double chiSoCu;
    private double chiSoMoi;
    private double soTienPhaiTra;

    public BienLai(KhachHang khachHang, double chiSoCu, double chiSoMoi) {
        this.khachHang = khachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;

    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public double getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(double chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public double getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(double chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public double getSoTienPhaiTra() {
        return (chiSoMoi-chiSoCu)*750;
    }

    public void setSoTienPhaiTra(double soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "khachHangs=" + khachHang +
                ", chiSoCu=" + chiSoCu +
                ", chiSoMoi=" + chiSoMoi +
                ", soTienPhaiTra=" + soTienPhaiTra +
                '}';
    }
}
