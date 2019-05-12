package Day1.StudyCase.Ulang02;

import java.util.Scanner;

public class Logic01Soal10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input N: ");
		int n = input.nextInt();
		int awal = 3;
		for (int i = 1; i <= n; i++) {
			if (i == 4) {
				System.out.print("XXX" + "\t");
			}else {
				System.out.print(awal + "\t");
			}
			awal *= 3;
		}
		input.close();
		
	}

}
