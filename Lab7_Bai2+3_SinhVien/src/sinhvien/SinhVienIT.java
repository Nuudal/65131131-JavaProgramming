package sinhvien;

public class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiem() {
        return (2*diemJava+diemHtml+diemCss)/4;
    }
}