package ET1;

import java.util.Scanner;

public class No3 {
	
	public static Scanner input;

	public static void main(String[] args) {
		// Input Case
		input = new Scanner(System.in);
		System.out.printf("Input: ");
		String n = input.nextLine();
		
		String[] arrayString = n.split(" ");  //menggunakan arrayString agar masukan array berupa string agar panjang arraynya dinamis
		int[] arrayInput = new int[arrayString.length];
		
		for (int i = 0; i < arrayString.length; i++) {
			
			arrayInput[i] = Integer.parseInt(arrayString[i]);  //string - integer
		}
		
		manualSort(arrayInput);

	}
	// Method untuk manualSort
	static void manualSort(int[] array) {
		int n = array.length;
		int temp = 0; //deklarasi temp untuk nilai awal
		
		// proses looping untuk pengecekan nilai urutan
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n-1; j++) {   //loop pembanding
				if (array[j] > array[j+1]) {   //if array[before] > array[after] , TRUE maka lanjut
					temp = array[j+1];           //simpan arr[before] ke temp
					array[j+1] = array[j];     //berikan nilai sementara kepada arr[after]
					array[j+1] = temp;         
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
