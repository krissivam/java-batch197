package Day1.StudyCase.Ulang01;

import java.util.Scanner;

public class Logic01Soal04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input N: ");
		int n = input.nextInt();
		input.close();
		int awal = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(awal + "\t");
			awal += 3;
		}

	}

}
