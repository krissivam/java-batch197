package Day3.StudyCase;

import java.util.Scanner;

public class Soal04 {
	
	protected static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("Input N : ");
		int n = input.nextInt();
		System.out.println("Input M : ");
		int m = input.nextInt();
		
		System.out.println();
		
		// Cetak Deret Awal
		int[] deret = deretAwal(n, m);
		for (int i = 0; i < n; i++) {
			System.out.print(deret[i] + "\t");
		}
		for (int i = 1; i <= m ; i++) {
			System.out.println("");
			System.out.println("Geser ke " + i);
			int temp = deret[n - 1];
			for (int j = n-1; j > 0; j--) {
				deret[j] = deret [j - 1];
			}
			deret[0] = temp;
			for (int k = 0; k < n; k++) {
				System.out.print(deret[k] + "\t");
			}
		}
		
	}
	
	// Method cetak deret
	static int[] deretAwal(int n, int m) {
		int[] hasil = new int[n];
		int awal = 1;
		int tambah = 2;
		for (int i = 0; i < n; i++) {
			hasil[i] = awal;
			awal = awal + tambah;
			tambah = tambah + 1;
		}
		return hasil;
	}


}
