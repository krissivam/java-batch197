package Day2.StudyCase;

import java.util.Scanner;

public class Soal05 {
	
	protected static Scanner input;

	public static void main(String[] args) {
		
		System.out.println("Masukkan kalimat : ");
		input = new Scanner(System.in);
		String kalimat = input.nextLine();
		StringBuilder ubahKalimat = new StringBuilder();
		
		//Pecah kalimat menjadi kata
		for (String word : kalimat.split(" ")) {
			ubahKalimat.append(replaceAll(word, '*')); // masukkan kata pengganti ke method replaceAll
			ubahKalimat.append(" ");
		}
		
		System.out.println(ubahKalimat);

	}
	
	public static String replaceAll(String word, char replacer) {
		//masukkan per kata
		StringBuilder ret = new StringBuilder();  //temporari string(return) //stringBuilder pembangunan string biar bisa dimodif (di split contohnya)
		// karena huruf diganti hanya bila kata lebih dari 2
		if (word.length()>2) {
			//Huruf Pertama tetap
			ret.append(word.charAt(0));
			//Ganti isi kata
			for (int i = 1; i < word.length() - 1; i++) {
				ret.append(replacer);
			}
			/*
			for (int i = 0; i < 3; i++) {	//Ganti * jadi 3buah *
				ret.append(replacer);
			}
			 */
			//Huruf terakhir kata tetap
			ret.append(word.charAt(word.length() - 1));
			return ret.toString();
			
		}
		return word;
	}

}
