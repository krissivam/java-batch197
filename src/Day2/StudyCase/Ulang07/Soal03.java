package Day2.StudyCase.Ulang07;

import java.util.Scanner;

public class Soal03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input N1: ");
		int n1 = input.nextInt();
		System.out.println("Input N2: ");
		int n2 = input.nextInt();
		System.out.println("Input N3: ");
		int n3 = input.nextInt();
		System.out.println();
		
		int[] array = new int[n1];
		int awal = n2;
		int med = n1/2;
		
		//cetak deret 1
		for (int i = 0; i < n1; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		//cetak deret 2
		for (int i = 0; i < n1; i++) {
			array[i] = awal;
			if (i < med) {
				awal *= n3;
			}else {
				awal /= n3;
			}
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		
		//cetak perhitungan
		System.out.print(array[med]);
		int hasil = array[med];
		for (int i = med +1; i < med +3; i++) {
			hasil -= array[i];
			System.out.print("-" + array[i]);
		}
		System.out.print(" = " + hasil);
		input.close();
		
	}
}
