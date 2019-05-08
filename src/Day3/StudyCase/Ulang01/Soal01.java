package Day3.StudyCase.Ulang01;

import java.util.Scanner;

public class Soal01 {
	
	protected static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("Input Nilai N: ");
		int n = input.nextInt();
		
		// Membuat Array
		int[] deret1 = new int[n];
		int[] deret2 = new int[n];
		int awal1 = 1;
		int awal2 = 2;
		
		// Deret 1
		for (int i = 0; i < deret1.length; i++) {
			deret1[i] = awal1;
			awal1 = awal1 + (i + 2);
			//System.out.print(deret1[i] + "\t");
		}
		System.out.println();
		
		// Deret 2
		for (int j = 0; j < deret2.length; j++) {
			deret2[j] = awal2;
			deret2[j] = awal2 + ((j + 1) * 2);
			//System.out.print(deret2[j] + "\t");
			
		}
		
		// Cetak Deret Dalam Array
		int[][] array = new int [n][n];
		for (int i = 0; i < deret1.length; i++) {
			for (int j = 0; j < deret2.length; j++) {
				if (i == j) {
					array[i][j] = deret1[i];
				} else if (i+j == n-1) {
					array[i][j] = deret2[j];
				}
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
