package entity;

public class KhachHang {
    private String hoTen;
    private String soNha;
    private int maSoCongTo;

    public KhachHang(String hoTen, String soNha, int maSoCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", soNha='" + soNha + '\'' +
                ", maSoCongTo=" + maSoCongTo +
                '}';
    }
}
