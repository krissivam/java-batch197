package Day2.StudyCase;

import java.util.Scanner;

public class soal3ulang {
	
	protected static Scanner input;

	public static void main(String[] args) {
		// Input keyboard scanner
		input = new Scanner(System.in);
		
		System.out.println("Input N1 : ");
		int n1 = input.nextInt();
		System.out.println("Input N2 : ");
		int n2 = input.nextInt();
		System.out.println("Input N3 : ");
		int n3 = input.nextInt();
		
		// Membuat Array
		int [] deret = new int [n1];
		int awal = n2;
		int tengah = (n2+1)/2;
		for (int i = 0; i < n1; i++) {
			deret[i] = awal;
		}
		

	}

}
