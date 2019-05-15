package Day2.StudyCase.Ulang01;

import java.util.Scanner;

public class Soal05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String kalimat = input.nextLine();
		StringBuilder ubahKalimat = new StringBuilder();
		
		for (String word : kalimat.split(" ")) {
	//		ubahKalimat.append(replaceAll(word, "*"));
			ubahKalimat.append(" ");
		}
		System.out.println(ubahKalimat);
		
	}
	
	//public static String replaceAll(String word, char replacer) {
		//StringBuilder ret
	//}
}
