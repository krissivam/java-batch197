package Day5.Materi;

import java.util.Scanner;

public class StudyCaseOrang {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Deklarasi Variable
		System.out.println("Input N :");
		int n = input.nextInt();
		
		int[] id = new int[n];
		String[] nama = new String[n];
		
		for (int i = 1; i <= n; i++) {
			System.out.print("ID : " + i);
			id[i] = input.nextInt();
			for (int j = 1; j <= n; j++) {
				System.out.print("Nama : " + i);
				nama[i] = input.nextLine();
			}
		}
		System.out.println("\n");
		
		for (int a : id) {
			System.out.println("ID : " + a);
			a++;
			for (String b : nama) {
				System.out.println(b);
			}
		}
		System.out.println("\n");
		
		
		
	}

}
