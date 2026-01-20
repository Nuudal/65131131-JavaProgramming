package tiil.edu;
import java.util.Scanner;



public class DTB{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap Ho va Ten: ");
		String a = scanner.nextLine();
		System.out.print("Nhap diem trung binh: ");
		Double b = scanner.nextDouble();
		
		System.out.printf("Ho va ten: " + a);
		System.out.print("Diem trung binh: " + b);
	}
}
