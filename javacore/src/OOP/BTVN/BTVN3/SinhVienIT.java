package OOP.BTVN.BTVN3;

public class SinhVienIT extends SinhVienTechMaster{
    private double markJava;
    private double markHtml;
    private double markCss;


    public SinhVienIT(String name, String majors, double markJava, double markHtml, double markCss) {
        super(name, majors);
        this.markJava = markJava;
        this.markHtml = markHtml;
        this.markCss = markCss;
    }



    @Override
    public double getDiem() {
        return (2*markJava+markHtml+markCss)/4;
    }
}
