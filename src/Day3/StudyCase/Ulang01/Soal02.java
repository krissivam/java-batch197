package Day3.StudyCase.Ulang01;

import java.util.Scanner;

public class Soal02 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Input N : ");
		int n = input.nextInt();
		System.out.println("Input M : ");
		int m = input.nextInt();
		System.out.println("Input O : ");
		int o = input.nextInt();

		System.out.println();

		// Cetak Deret Array
		int[] array = deretAwal((n * 3), m, o);
		int index = 0;

		int[][] array2 = new int[n][n];

		// Cetak Array Diagonal
		for (int i = 0; i < n; i++) {
			array2[n - 1 - i][i] = array[index];
			index++;
		}

		// Cetak Array Kanan ke Bawah
		for (int i = 1; i < n; i++) {
			array2[i][n - 1] = array[index];
			index++;
		}

		// Cetak Array Bawah ke Kiri
		for (int i = n - 2; i > 0; i--) {
			array2[n - 1][i] = array[index];
			index++;
		}

		// Cetak Array
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + "\t");
			}
			System.out.println("\n");
		}

	}

	static int[] deretAwal(int n, int m, int o) {
		int hasil[] = new int[n];
		int awal = o;
		int kali = 1;

		for (int i = 0; i < n; i++) {
			if (i % (m + 1) == m) {
				hasil[i] = (m * kali);
				kali = hasil[i];
			} else {
				hasil[i] = awal;
				awal = awal + m;
			}
		}
		return hasil;
	}

}
