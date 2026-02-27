package sanpham;
import java.util.Scanner;

public class SanPham {
	
	String tenSp;
	double donGia;
	double giamGia;
	
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp=tenSp;
		this.donGia=donGia;
		this.giamGia=giamGia;
	}
	
	public SanPham(String tenSp, double donGia) {
		this(tenSp, donGia, 0);
	}
	
	
	private double getThueNhapKhau() {
        return donGia * 0.1;
    }
	
	public void xuat()	{
		System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
	}
	
	public static void main(String[] args) {
		SanPham sp1 = new SanPham("Banh Mi", 20000, 2000);
		SanPham sp2 = new SanPham("Mi Tom", 5000);
		System.out.println("\nThông tin sản phẩm 1:");
        sp1.xuat();
        System.out.println("\nThông tin sản phẩm 2:");
        sp2.xuat();
	}
	

}
