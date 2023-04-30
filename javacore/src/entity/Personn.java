package entity;

public class Personn {
    private String maNV;
    private String hoTen;
    private double luong;

    public Personn(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Personn{" +
                "maNV='" + maNV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", luong=" + luong +
                '}';
    }
}
