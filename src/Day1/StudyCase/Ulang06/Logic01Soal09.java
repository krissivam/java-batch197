package Day1.StudyCase.Ulang06;

import java.util.Scanner;

public class Logic01Soal09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input N: ");
		int n = input.nextInt();
		int awal = 4;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print("*" + "\t");
			} else {
				System.out.print(awal + "\t");
				awal *= 4;
			}
		}
		input.close();

	}

}
