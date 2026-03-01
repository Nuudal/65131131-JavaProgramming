package hinh;

public class Vuong extends ChuNhat {
	public Vuong(double canh) {
		super(canh,canh);
	}
	
	public void xuat() {
		System.out.println("Chieu dai: " + getDai());
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Dien tich: " + getDienTich() + "\n");
	}
}
