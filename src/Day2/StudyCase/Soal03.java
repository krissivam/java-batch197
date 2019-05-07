package Day2.StudyCase;

import java.util.Scanner;

public class Soal03 {
	
	// DERET ANGKA 3 6 12 24 12 6 3
	
	protected static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
				
		System.out.println("Input N1: ");
		int n1 = input.nextInt();
		System.out.println("Input N2: ");
		int n2 = input.nextInt();
		System.out.println("Input N3: ");
		int n3 = input.nextInt();
		
		int [] deret = new int [n1];
		int awal = n2;
		int nilaiTengah = n1/2;
		for (int i = 0; i < n1; i++) {
			deret [i] = awal;
			if (i < nilaiTengah) {
				awal = awal * n3;
			} else {
				awal = awal / n3;
			}
			
			System.out.print(deret[i] + "\t");
		}
		System.out.println();
		System.out.print("Perhitungan : "+ deret[nilaiTengah]);
		int hasil = deret[nilaiTengah];
		for (int i = nilaiTengah + 1; i < nilaiTengah + 3; i++) {
			hasil = hasil-deret[i];
			System.out.print(" - " + deret[i]);
		}
		System.out.print(" = "+ hasil);
	}
}
