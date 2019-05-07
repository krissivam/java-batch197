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
		
		int[] array = new int[n];
		int awal = 1;
		
		//Membuat Deret 1
		for (int i = 0; i < n; i++) {
			array[i] = awal;
			awal = awal + (i+2);
		}
		
		
		}

	

}
