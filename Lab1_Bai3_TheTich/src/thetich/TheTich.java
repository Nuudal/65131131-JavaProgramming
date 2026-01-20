package thetich;
import java.util.Scanner;

public class TheTich {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double a;

        do {
            System.out.print("Nhap canh khoi lap phuong: ");
            a = scanner.nextDouble();
        } while (a <= 0);

        double v=a*a*a;
        System.out.println("The tich khoi lap phuong: " + v);

        scanner.close();
	}
}
