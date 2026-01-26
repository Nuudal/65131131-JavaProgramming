package ptbac2;
import java.util.Scanner;

public class PTBac2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a: ");
		double a=scanner.nextDouble();
		System.out.print("Nhap b: ");
		double b=scanner.nextDouble();
		System.out.print("Nhap c: ");
		double c=scanner.nextDouble();
		
		if(a==0) {
			if(b==0)
				if(c==0)
					System.out.println("Vo so nghiem");
				else
					System.out.println("Vo nghiem");
			else {
				double x = -c/b;
				if (x == -0)
					x = 0.0;
				System.out.printf("Ket qua: %.2f",x);
			}
		}
		else {
			double d = b*b - 4*a*c;
			if (d<0)
				System.out.println("Phuong trinh vo nghiem");
			else
				if (d==0) {
					double x = -b/(2*a);
					if (x == -0)
						x = 0.0;
					System.out.printf("Phuong trinh co nghiem kep: %.2f",x);
				}
				else {
					double x1 = (-b+Math.sqrt(d))/(2*a);
					double x2 = (-b-Math.sqrt(d))/(2*a);
					System.out.printf("Phuong trinh co 2 nghiem phan biet:\n%.2f\n%.2f",x1,x2);
				}
				
		}
		
		
		scanner.close();

	}

}
