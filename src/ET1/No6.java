package ET1;

import java.util.Arrays;

public class No6 {

	public static void main(String[] args) {
		// nilai Min dan Max Sum untuk 4 komponen array saja
		int[] arraryInput = new int[] { 1, 10, 2, 20, 3 };
		Arrays.sort(arraryInput);  //mengurutkan array
		miniMaxSum(arraryInput);  //memanggil method
	}

	static void miniMaxSum(int[] array) {
		
		long sumMin = 0;   //menggunakan long agar input bisa banyak
		long sumMax = 0;

		int n = 4;
		for (int i = 0; i < n; i++) {
			sumMin += array[i];  //menambahkan jumlah angka 4 komponen dari yg terkecil
			sumMax += array[array.length - 1 - i];   //menambahkan jumlah angka 4 komponen dari yg terbesar dimulai dari 4 komponen sebelum terakhir
		}
		System.out.println("Nilai minimal: " + sumMin + "\t" + "Nilai Maksimal: " + sumMax);
	}

}
