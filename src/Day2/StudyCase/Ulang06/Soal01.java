package Day2.StudyCase.Ulang06;

import java.util.Scanner;

public class Soal01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input N1: ");
		int n1 = input.nextInt();
		System.out.println("Input N2: ");
		int n2 = input.nextInt();
		System.out.println();
		
		int[] array = new int[n1];
		int hasil = 0;
		int awal = 1;
		
		// Cetak Deret 1
		for (int i = 0; i < n1; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		// Cetak Deret 2
		for (int i = 0; i < n1; i++) {
			if (i == 0) {
				System.out.print(awal + "\t");
				array[i] = 1;
				hasil = awal;
			}else {
				awal *= 3;
				array[i] = awal;
				System.out.print(awal + "\t");
			}
		}
		System.out.println();
		
		// Cetak Perhitungan
		for (int j = 1; j <= n2; j++) {
			if (j < n2) {
				System.out.print(array[j-1] + "+");
				hasil = 1 + array[j-1];
			}else if (j == n2) {
				System.out.print(array[j-1]);
				hasil += array[j-1];
			}
		}
		System.out.print(" = " + hasil);
		input.close();

	}

}
