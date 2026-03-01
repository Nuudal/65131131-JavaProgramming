package hinh;

public class ChuNhat {
	private double dai;
	private double rong;
	
	
	public ChuNhat(double dai, double rong) {
		this.dai=dai;
		this.rong=rong;
	}
	
	public double getChuVi() {
		return (dai+rong)*2;
	}
	
	public double getDienTich() {
		return dai*rong;
	}
	
	public void xuat() {
        System.out.println("Chieu dai: " + dai);
        System.out.println("Chieu rong: " + rong);
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Dien tich: " + getDienTich() + "\n");
	}
	
	public double getDai() {
		return dai;
	}
	
	public double getRong() {
		return rong;
	}
}


