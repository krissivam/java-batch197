package Day3.StudyCase;

import java.util.Scanner;

public class Soal01 {
	
	protected static Scanner input; 
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Input N :");
		int n = input.nextInt();
		
		//membuat array
		int [][] arr = new int [n][n];
		int deret[] = new int [n];
		int deret2[] = new int [n];
		int awal1 = 1;
		int awal2 = 2;
		//int hasil = 0;
		
		//Deret 1
		for (int i = 0; i < deret.length; i++) {
			deret[i] = awal1;
			awal1 = awal1 + (i + 2);
			//System.out.print(deret[i]+ "\t");
		}
	
		System.out.println();
		
		//Deret 2
		for (int j = 0; j < deret2.length; j++) {
			deret2[j] = awal2;
			awal2 = awal2 + ((j+1) * 2);
			//System.out.print(deret[j]+ "\t");
		}
		System.out.println();
		System.out.println();
		
		//Mengisi Baris & Kolom
		for (int i = 0; i < deret.length; i++) {
			for (int j = 0; j < deret2.length; j++) {
				if (i==j) {
					arr[i][j] = deret[i];
				} else if (i+j==n-1) {
					arr[i][j] = deret2[j];
				}
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
			
			
		}
		

	}

}
