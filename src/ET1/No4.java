package ET1;

import java.util.Scanner;

public class No4 {
	
	public static Scanner input;

	public static void main(String[] args) {
		// Case
		System.out.println("Masukkan Nama: ");
		input = new Scanner(System.in);
		String kalimat = input.nextLine();
		StringBuilder ubahKalimat = new StringBuilder();
		
		//Split kalimat menjadi kata
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
			//Ganti isi kata dengan 3 buah *			
			for (int i = 1; i < word.length() - 1; i++) {
				ret.append(replacer);
			}
			
			//Huruf terakhir kata tetap
			ret.append(word.charAt(word.length() - 1));
			return ret.toString();
			
		}
		return word;
	}

}
