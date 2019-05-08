package Day3.StudyCase;

import java.util.Scanner;

public class Soal06 {
	
	protected static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("Input N : ");
		int n = input.nextInt();
		System.out.println("Input M : ");
		int m = input.nextInt();
		
		System.out.println();
		
		// Cetak Deret Awal
		int[] deret = deretAngka(n, m);
		for (int i = 0; i < n; i++) {
			System.out.print(deret[i] + "\t");
		}
		for (int i = 1; i <= m; i++) {
			System.out.println(" ");
			System.out.println("Geser ke " + i);
			int temp = deret[0];
			for (int j = 0; j < n-1; j++) {
				deret [j] = deret [j+1];
			}
			// Temp untuk menampung nilai array sebelumnya
			deret[n-1] = temp;
			for (int x = 0; x < n; x++) {
				System.out.print(deret[x] + "\t");
			}
		}
		
	}
	
	// Method Cetak Deret Awal
	static int[] deretAngka(int n, int m) {
		int[] array = new int[n];
		int awal = 2;
		for (int b = 0; b < n; b++) {
			array[b] = awal;
			awal = awal + (2 * (b+1));
		}
		return array;
	}
	

}
