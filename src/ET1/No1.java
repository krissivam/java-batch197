package ET1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No1 {

	public static void main(String[] args) {
		
		int uangAndi = 20;
		int[] kacamata = {10,20,30};
		int[] baju = {10,20,30};
//		System.out.println(getMoneySpent(kacamata,baju,uangAndi));
		List<Integer> a= new ArrayList<Integer>();  //deklarasi variabel arrayList
		for (int i = 0; i < kacamata.length; i++) {  //proses looping array1 dan array2 untuk menghitung total harga
			for (int j = 0; j < baju.length; j++) {  
				if (kacamata[i] + baju[j] <= uangAndi) { //jika jumlah elemen array1 dan array2 <= jumlah uang yg miliki maka akan di tambahkan ke List
					a.add(kacamata[i] + baju[j]);  // add jumlah ke List a
				}
			}
		}
		if (a.size() == 0) {  //jika tidak ada nilai yg di simpan di dalam List 
			System.out.println("Dana tidak mencukupi");
		} else {
			System.out.print("Jumlah uang yang dibelanjakan Andi: ");
			System.out.println(Collections.max(a));  //menggunakan fungsi Collections untuk mengambil nilai terbesar dalam List
		}
	}
}

		/*
		// Cases
		System.out.println(uangDibelanjakanAndi(new int[] { 34, 26, 44 }, new int[] { 21, 39, 33 }, 70));
		System.out.println();
		System.out.println(uangDibelanjakanAndi(new int[] { 13, 15, 20 }, new int[] { 5, 6, 7 }, 15));
		*/

	//}

	/*
	//Method 
	static int uangDibelanjakanAndi(int[] kacamata, int[] baju, int b) {
		int jumlah = 0;
		List<Integer> a = new ArrayList<Integer>(); //deklarasi variabel arrayList
		for (int i = 0; i < kacamata.length; i++) { //proses looping array1 dan array2 untuk menghitung total harga
			for (int j = 0; j < baju.length; j++) {
				if (kacamata[i] + baju[j] <= b) {   //jika jumlah elemen array1 dan array2 <= jumlah uang yg miliki maka akan di tambahkan ke List
					a.add(kacamata[i] + baju[j]);   // add jumlah ke List a
				}
			}
		}
		if (a.size() == 0) {  //jika tidak ada nilai yg di simpan di dalam List 
			System.out.println("Dana tidak mencukupi");
		} else {
			jumlah = Collections.max(a); //menggunakan fungsi Collections untuk mengambil nilai terbesar dalam List
			System.out.print("Jumlah uang yang dibelanjakan Andi: ");
		}
		return jumlah;
	}
	*/

//}
