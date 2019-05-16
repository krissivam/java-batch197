package Day2.StudyCase.Ulang01;

import java.util.Scanner;

public class Soal06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String text = input.next();
		int a = text.length();
		int b = 0;
		
		for (int i = 0; i < a; i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				b++;
			}
		}
		System.out.println(text);
		System.out.println("Jumlah Kata : " + b);
		input.close();
		
	}

}
