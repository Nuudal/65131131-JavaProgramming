package chuvidt;
import java.util.Scanner;

public class ChuviDT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double d = 0;
		double r = 0;
		do {
		System.out.print("Nhap chieu dai: ");
		d = scanner.nextDouble();
		} while (d<=0);
		do {
		System.out.print("Nhap chieu rong: ");
		r = scanner.nextDouble();
		} while (r<=0);
		double cv = 2*(d+r);
		double dt = d*r;
		double min = d<r?d:r;
		System.out.println("Chu vi: " + cv);
		System.out.println("Dien tich: " + dt);
		System.out.println("Canh nho: " +  min);
		scanner.close();
	}
}
