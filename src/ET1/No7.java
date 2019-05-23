package ET1;

import java.util.Scanner;

public class No7 {

	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Kata: ");
		String kalimat = scanner.nextLine();
		
		String[] tempArray;//variable untuk menampung hasil string yg dipisah
		String pemisah = ""; //sebagai pemisah string
		tempArray = kalimat.split(pemisah);//proses pemisahan
		int n = tempArray.length;
		//proses looping untuk memisahkan huruf per huruf secara decrement/ dari belakang
		/*
		for (int i = (n-1) ; i >= 0 ; i--) {
			for(int a = 0; a < (n/2); a++){
				System.out.print("*"); //mencetak ** pada setengah pertama
			}
			System.out.print(tempArray[i]);  //cetak nilai array yg di simpan di [i]
			for(int a = 0; a < (n/2); a++){
				System.out.print("*");  //mencetak ** pada setengah kedua
			}
			System.out.println();
		}
		*/
		int awal = 0;
		for (int i = (n-1) ; i >= 0 ; i--) {
			for(int a = 0; a < (n/2); a++){
				System.out.print("*"); //mencetak ** pada setengah pertama
			}
			System.out.print(tempArray[awal]);  //cetak nilai array yg di simpan di [i]
			System.out.println();
		}	
	}

}
