package Day1.StudyCase.Ulang03;

import java.util.Scanner;

public class Logic01Soal02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input N : ");
		int n = input.nextInt();
		int awal = 2;
		for (int i = 0; i < n; i++) {
			System.out.print(awal + "\t");
			awal += 2;
		}
		input.close();

	}

}
