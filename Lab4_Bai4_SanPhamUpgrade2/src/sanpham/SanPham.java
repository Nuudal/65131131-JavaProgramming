package sanpham;
import java.util.Scanner;

public class SanPham {
	
	private String tenSp;
	private double donGia;
	private double giamGia;
	
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
	
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp=tenSp;
	}
	
	public double getDonGia() {
		return donGia;
	}
	
	public void setDonGia(double donGia) {
		this.donGia=donGia;
	}
	
	public double getGiamGia() {
		return giamGia;
	}
	
	public void setGiamGia(double giamGia) {
		this.giamGia=giamGia;	
	}
	
	public void xuat()	{
		System.out.println("Tên sản phẩm: " + getTenSp());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Giảm giá: " + getGiamGia());
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
	}
	
	public static void main(String[] args) {
		SanPham sp1 = new SanPham("Banh Mi", 20000, 2000);
		SanPham sp2 = new SanPham("Mi Tom", 5000);
		sp2.setTenSp("Mi Goi");
		System.out.println("\nThông tin sản phẩm 1:");
        sp1.xuat();
        System.out.println("\nThông tin sản phẩm 2:");
        sp2.xuat();
	}
	

}
