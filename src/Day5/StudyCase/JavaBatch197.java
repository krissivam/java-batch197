package Day5.StudyCase;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaBatch197 {
	
	protected static Scanner input;
	
	public static int n;

	public static void main(String[] args) {
		// Input dan cetak data dengan input n
		input = new Scanner(System.in);
		System.out.println("Jumlah data yang ingin Anda masukkan: ");
		int jumlahInput = input.nextInt();
		
		n = jumlahInput;
		
		Orang org = new Orang();
		
		for (int i = 0; i < jumlahInput; i++) {
			System.out.println("ID orang ke-" + (i+1) + " : ");
			org.listId[i] = input.nextInt();
			
			System.out.println("Nama: ");
			org.listNama[i] = input.next();
			
			System.out.println("Alamat: ");
			org.listAlamat[i] = input.next();
			
			System.out.println("Jenis Kelamin: ");
			org.listJenisKelamin[i] = input.next();
			
			System.out.println("Nomor Telepon: ");
			org.listNoTelepon[i] = input.next();
			
			System.out.println(" ");
		}
		
		for (int j = 0; j < n; j++) {
			System.out.println("\nData diri orang ke-" + (j+1));
			System.out.println("ID \t\t: " + org.listId[j]);
			System.out.println("Nama \t\t: " + org.listNama[j]);
			System.out.println("Alamat \t\t: " + org.listAlamat[j]);
			System.out.println("Jenis Kelamin \t: " + org.listJenisKelamin[j]);
			System.out.println("Nomor Telepon \t: " + org.listNoTelepon[j]);
			
		}

	}

}
