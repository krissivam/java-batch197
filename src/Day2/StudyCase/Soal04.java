package Day2.StudyCase;

import java.util.Scanner;

public class Soal04 {
	
	protected static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		int sum, temp = 1;
		
		System.out.println("Input N1 : ");
		int n1 = input.nextInt();
		System.out.println("Input N2 : ");
		int n2 = input.nextInt();
		
		int realSum = 0;
		int[] deret = new int [n1];
		
		// Cetak Deret N1
		for (int k = 0; k < n1; k++) {
			System.out.print(k + "\t");
		}
		
		System.out.println();
		
		// Cetak Deret Bawah
		for (int i = 0; i < n1; i++) {
			if (i % 2 == 0) {
				System.out.print(temp + "\t");
				temp++;
			} else {
				if (temp == 2) {
					sum = (temp-1) * n2;
					deret[i] = sum;
					System.out.print(sum + "\t");
				} else {
					sum = (temp-1) * n2;
					deret[i] = sum;
					System.out.print(sum + "\t");
				}
			}
		}
		
		System.out.println();
		
		// Perhitungan
		for (int j = 0; j < n1; j++) {
			if (j % 2 == 1) {
				System.out.print(deret[j] + " + ");
				realSum += deret[j];
			}
		}
		
		// Cetak Hasil
		System.out.println(" = " + realSum);

	}

}
