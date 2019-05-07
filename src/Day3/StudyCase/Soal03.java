package Day3.StudyCase;

import java.util.Scanner;

public class Soal03 {
	
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
		
		// Membuat array 2 Dimensi
		int[][] array = new int [n][n];
		
		int[] arr = deretTiga(n * 4, m, o);
		int index = 0;
		for (int i = 0; i < n; i++) {
			array[0][i] = arr[index];
			index++;
		}
		
		// Cetak Array Kolom 7 (0,6)-(6,6)
		for (int i = 1; i < array.length; i++) {
			array[i][n-1] = arr[index];
			index++;
		}
		
		// Cetak Array Baris 7 (6,6)-(6,0)
		for (int i = (n-2); i >= 0; i--) {
			array[n-1][i] = arr[index];
			index++;
		}
		
		// Cetak Arrat Kolom 1 (6,0)-(0,0)
		for (int i = (n-2); i >= 1; i--) {
			array[i][0] = arr[index];
			index++;
		}
		
		
		// Cetak Array Baris 1 (0,0)-(0,6)
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		
		
			
	}
	
	static int[] deretTiga(int n, int m, int o) {
		int arr [] = new int [n];
		//arr [0] = o;
		int angka = o;
		for (int i = 0; i < n; i++) {
			
			if (i % (m+1) == m ) {
				arr [i] = m;
			} else {
				arr[i] = angka;
				angka += m;
			}
		}
		return arr;
	}

}
