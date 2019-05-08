package Day3.StudyCase;

import java.util.Scanner;

public class Soal02 {
	
	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Input N: ");
		int n = input.nextInt();
		System.out.println("Input M: ");
		int m = input.nextInt();
		System.out.println("Input O: ");
		int o = input.nextInt();
		
		System.out.println();
		
		// Cetak Array Deret Array
		int[] array = deretTiga((n*3), m, o);
		int index = 0;
		//int a = 0;
		
		int array2[][] = new int [n][n];
		
		/*
		// Cetak Array Diagonal Cara #1
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				if (i+j == n-1) {
					array2[i][j] = array[index];
					j++;
					index++;
				}
			}
		}
		*/
		// Cetak Array Diagonal Cara #2
		for (int i = 0; i < n; i++) {
			array2[n-1-i][i] = array[index];
			index++;
		}
		
		// Cetak Array Kanan
		for (int i = 1; i < n; i++) {
			array2[i][n-1] = array[index];
			index++;
		}
		
		// Cetak Array Bawah
		for (int i = n-2; i > 0; i--) {
			array2[n-1][i] = array[index];
			index++;
		}
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		
	}
	
	static int[] deretTiga(int n, int m, int o) {
		int hasil[] = new int[n];
		int angka = o;
		int kali = 1;
		for (int i = 0; i < n; i++) {
			if (i % (m+1) == m ) {
				hasil [i] = (m * kali);
				kali = hasil[i];
			} else {
				hasil[i] = angka;
				angka = angka + m;
			}
			//System.out.print(hasil[i] + " ");
		}
		return hasil;
	}

}
