package Day2.StudyCase.Ulang01;

import java.util.Scanner;

public class Soal04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input N1: ");
		int n1 = input.nextInt();
		System.out.println("Input N2: ");
		int n2 = input.nextInt();
		System.out.println();
		
		int[] array = new int[n1];
		int hasil = 0;
		int sum, awal = 1;
		
		//cetak deret 1
		for (int i = 0; i < n1; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		//cetak deret 2
		for (int i = 0; i < n1; i++) {
			array[i] = awal;
			if (i % 2 == 0) {
				System.out.print(awal + "\t");
				awal++;
			}else {
				if (awal == 2) {
					sum = (awal-1) *n2;
					array[i] = sum;
					System.out.print(sum + "\t");
				}else {
					sum = (awal-1) *n2;
					array[i] = sum;
					System.out.print(sum + "\t");
				}
			}
		}
		System.out.println();
		
		//cetak perhitungan
		for (int j = 0; j < n1; j++) {
			if (j % 2 ==1) {
				System.out.print(array[j] + " + ");
				hasil += array[j];
			}
		}
		System.out.print(" = " + hasil);
		input.close();
		
	}

}
