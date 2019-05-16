package Day2.StudyCase.Ulang02;

import java.util.Scanner;

public class Soal05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan kalimat : ");
		String kalimat = input.nextLine();
		StringBuilder ubahKalimat = new StringBuilder();

		for (String word : kalimat.split(" ")) {
			ubahKalimat.append(replaceAll(word, '*'));
			ubahKalimat.append(" ");
		}

		System.out.println(ubahKalimat);
		input.close();

	}

	public static String replaceAll(String word, char replacer) {
		StringBuilder ret = new StringBuilder();
		// karena huruf diganti hanya bila kata lebih dari 2
		if (word.length() > 2) {
			// Huruf Pertama tetap
			ret.append(word.charAt(0));
			// Ganti isi kata
			for (int i = 1; i < word.length() - 1; i++) {
				ret.append(replacer);
			}
			// Huruf terakhir kata tetap
			ret.append(word.charAt(word.length() - 1));
			return ret.toString();

		}
		return word;
	}
}
