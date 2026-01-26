package ptbacnhat;
import java.util.Scanner;

public class PTBacNhat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a: ");
		double a =scanner.nextDouble();
		System.out.print("Nhap b: ");
		double b = scanner.nextDouble();
		
		if(a==0)
			if(b==0)
				System.out.println("Vo so nghiem");
			else
				System.out.println("Vo nghiem");
		else {
			double x = (-b)/a;
			if(b==0)
				System.out.printf("Ket qua: %.2f",-x);
			else	
				System.out.printf("Ket qua: %.2f",x);
		}
			
		
		scanner.close();
	}

}
