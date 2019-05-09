package Day1.StudyCase.Ulang01;

import java.util.Scanner;

public class Logic01Soal01 {
	// create object input from java.util.Scanner
	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Input N : ");
		int n = input.nextInt();

		int awal = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(awal + "\t");
			awal = awal + 2;
		}

	}

}
