package dtb;
import java.util.Scanner;

public class DTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap Ho va Ten: ");
        String a = scanner.nextLine();
        double b=0;
        do{
        	System.out.print("Nhap diem trung binh: ");
            b = scanner.nextDouble();
        }
        while (b<0 || b>10);
        
        System.out.printf("%s: %.2f điểm", a, b);

        scanner.close();
    }
}
