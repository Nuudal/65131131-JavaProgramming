package hinh;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hinh chu nhat 1 :");
		System.out.print("Chieu dai: ");
		double a=scanner.nextDouble();
		System.out.print("Chieu rong: ");
		double b=scanner.nextDouble();
		ChuNhat cn1 = new ChuNhat(a,b);
		
		System.out.println("Hinh chu nhat 2 :");
		System.out.print("Chieu dai: ");
		a=scanner.nextDouble();
		System.out.print("Chieu rong: ");
		b=scanner.nextDouble();
		ChuNhat cn2 = new ChuNhat(a,b);
		
		System.out.println("Hinh vuong:");
		System.out.print("Chieu dai canh: ");
		a=scanner.nextDouble();
		Vuong v = new Vuong(a);
		
		System.out.println("Hinh chu nhat 1 :");
		cn1.xuat();
		System.out.println("Hinh chu nhat 2 :");
		cn2.xuat();
		System.out.println("Hinh vuong:");
		v.xuat();
		
		
		scanner.close();
		
	}

}
