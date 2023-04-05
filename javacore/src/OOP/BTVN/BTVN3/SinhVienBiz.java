package OOP.BTVN.BTVN3;

public class SinhVienBiz extends SinhVienTechMaster{
    private double markMarketing;
    private double markSales;


    public SinhVienBiz(String name, String majors, double markMarketing, double markSales) {
        super(name, majors);
        this.markMarketing = markMarketing;
        this.markSales = markSales;
    }


    @Override
    public double getDiem() {
        return (2*markMarketing+markSales)/3;
    }
}
