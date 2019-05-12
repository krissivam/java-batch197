package Day1.StudyCase.Ulang02;

import java.util.Scanner;

public class Logic01Soal08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input N: ");
		int n = input.nextInt();
		int awal = 3;
		for (int i = 0; i < n; i++) {
			System.out.print(awal + "\t");
			awal *= 3;
		}
		input.close();
		

	}

}
