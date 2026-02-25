package hocsinh;
import java.util.Scanner;

public class HocSinh {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n=0;
		do {
			System.out.print("Nhap so luong hoc sinh: ");
			n=scanner.nextInt();
		}
		while(n<=0);
		scanner.nextLine();
		
		String HS[] = new String[n];
		double Diem[] = new double[n];
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Hoc sinh " + (i+1) + ":");
			System.out.print("Ho va ten: ");
			HS[i] = scanner.nextLine();
			Diem[i]=-1;
			do {
				System.out.print("Diem: ");
			Diem[i]=scanner.nextDouble();
			}
			while (Diem[i]<0 || Diem[i]>10);
			scanner.nextLine(); 
			
		}
		
		for (int i=0;i<n;i++) {
			System.out.print(HS[i] + " " + Diem[i]);
			if (Diem[i]<5)
				System.out.print(" Yeu\n");
			else
				if (Diem[i]<6.5)
					System.out.print(" Trung binh\n");
				else
					if (Diem[i]<7.5)
						System.out.print(" Kha\n");
					else
						if (Diem[i]<9)
							System.out.print(" Gioi\n");
						else
							System.out.print(" Xuat sac\n");
		}
		
		for (int j=0;j<n-1;j++)
			for (int i=j+1;i<n;i++)
			{
				if (Diem[j]>Diem[i])
				{
					String Ten = HS[i];
					HS[i]=HS[j];
					HS[j]=Ten;
					
					double D = Diem[i];
					Diem[i]=Diem[j];
					Diem[j]=D;
				}
			}
		
		
		System.out.print("Danh sach sinh vien sap xep theo thu tu tang dan: \n");
		for (int i=0;i<n;i++)
			System.out.println(HS[i] + " " + Diem[i]);
		
		
		
		scanner.close();
		

	}

}
