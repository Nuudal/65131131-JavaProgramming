package tiendien;
import java.util.Scanner;

public class TienDien {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so dien su dung: ");
        int soDien = scanner.nextInt();
        
        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.printf("Tien dien phai tra: %,d VND",tien);

		
		scanner.close();

	}

}
