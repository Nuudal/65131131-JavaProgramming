package sanpham;
import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia;
    double giamGia;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();

        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();

        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public static void main(String[] args) {
        SanPham sp = new SanPham();
        sp.nhap();
        System.out.println("\nThông tin sản phẩm:");
        sp.xuat();
    }
}
