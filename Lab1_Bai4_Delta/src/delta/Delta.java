package delta;
import java.util.Scanner;

public class Delta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a;
		do {
			System.out.print("Nhap a: ");
			a = scanner.nextDouble();
		} while (a==0);
		
		System.out.print("Nhap b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhap c: ");
		double c = scanner.nextDouble();
		
		double d = b*b - 4*a*c;
		
		if (d>=0) {
			System.out.println("Can Delta: " + Math.sqrt(d));
		} else {
			System.out.print("Delta am");
		}
		
		scanner.close();

	}
}
