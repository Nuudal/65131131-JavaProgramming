package mang;
import java.util.Scanner;
import java.util.Arrays;


public class Mang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=0;
		do {
			System.out.print("Nhap so luong phan tu: ");
			n=scanner.nextInt();
		}
		while(n<=0);
		
		int[] A = new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.print("Nhap phan tu thu " +(i+1) + ": ");
			A[i]=scanner.nextInt();
		}
		
		Arrays.sort(A);
		
		System.out.print("Mang sau khi sap xep: ");
		for (int i=0;i<n;i++)
			System.out.print(A[i] + " ");
		
		System.out.print("\nPhan tu nho nhat: " +A[0]);
		
		double TB=0;
		int c=0;
		for (int i=0;i<n;i++)
		{
			if (A[i]%3==0) {
				c++;
				TB=TB+A[i];
			}
		}
		
		
		System.out.print("\nTrung binh cong cac so chia het cho 3: " + (TB/c));
		
		scanner.close();

	}

}
