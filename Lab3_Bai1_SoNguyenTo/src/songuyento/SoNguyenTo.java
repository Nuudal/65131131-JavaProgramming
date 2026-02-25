package songuyento;
import java.util.Scanner;

public class SoNguyenTo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = -1;
		do {
			System.out.print("Nhap so: ");
			n = scanner.nextInt();
		}
		while (n<1);
		
		int flag=0;
		for (int i=2;i<n-1;i++)
			if (n%i==0)
			{
				flag=1;
				break;
			}
		
		if (flag==0)
			System.out.print("Day la so nguyen to");
		else
			System.out.print("Day khong phai so nguyen to");
		scanner.close();

	}

}
