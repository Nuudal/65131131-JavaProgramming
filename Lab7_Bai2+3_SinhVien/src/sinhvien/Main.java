package sinhvien;

public class Main {
    public static void main(String[] args) {

        SinhVienPoly sv1 = new SinhVienIT("Nguyen Hong Duong", 8, 7, 9);
        SinhVienPoly sv2 = new SinhVienBiz("Pham Tan Phat", 9, 8);

        System.out.println("Sinh vien IT");
        sv1.xuat();

        System.out.println("\nSinh vien Biz");
        sv2.xuat();
    }
}