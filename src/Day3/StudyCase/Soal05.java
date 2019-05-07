package Day3.StudyCase;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Soal05 {
	
	protected static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Input N : ");
		int n = input.nextInt();
		
		// Cetak Array
		int [][] arr = new int [n][n];
		//int awal = 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr [i][j] = input.nextInt();
				System.out.print(arr[i][j]+"\t");
			}
		}
		System.out.println();

	}

}
