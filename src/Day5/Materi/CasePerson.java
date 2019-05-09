package Day5.Materi;

import java.util.Scanner;

public class CasePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Person[] arrayPerson = new Person[3];
		Person tempPerson = new Person();
		int i;
		*/
		
		/*
		// Input data Person
		Person prs1 = new Person(001, "Parto", "Jakarta", "Pria", "080989999");
		Person prs2 = new Person(002, "Sule", "Jakarta", "Pria", "080989998");
		Person prs3 = new Person(003, "Nunung", "Jakarta", "Wanita", "080989997");
		*/
		
		// Input data Person
		Scanner input = new Scanner(System.in);
		System.out.print("Jumlah yang ingin di-input : ");
		int n = input.nextInt();
		System.out.println();
		
		Person arrayPerson[] = new Person[n];
		for (int i = 0; i < arrayPerson.length; i++) {
			System.out.print("ID " + "orang ke" + (i+1) + ": ");
			int id = input.nextInt();
			
			System.out.println("Nama " + "orang ke" + (i+1) + ": ");
			String nama = input.nextLine();
			
			System.out.println("Alamat " + "orang ke" + (i+1) + ": ");
			String alamat = input.nextLine();
			
			System.out.println("Jenis Kelamin " + "orang ke" + (i+1) + ": ");
			String jk = input.nextLine();
			
			System.out.println("No Telepon " + "orang ke" + (i+1) + ": ");
			String noTelp = input.nextLine();
			
			System.out.println();
		}
		/*
		// Menampilkan data Person ke dalam Array
		arrayPerson[0] = prs1;
		arrayPerson[1] = prs2;
		arrayPerson[2] = prs3;
		*/
		
		/*
		// Menampilkan data Person
		for (i = 0; i < 3; i++) {
			tempPerson = arrayPerson[i];
			System.out.println("ID " + "\t \t" + " :" +tempPerson.getId());
			System.out.println("Nama " + "\t \t" + " :" +tempPerson.getNama());
			System.out.println("Alamat " + "\t \t" + " :" +tempPerson.getAlamat());
			System.out.println("Jenis Kelamin " + "\t" + " :" +tempPerson.getJk());
			System.out.println("No Telepon " + "\t" + " :" +tempPerson.getNoTelp());
			
			System.out.println();
		}
		*/
		for (int i = 0; i < arrayPerson.length; i++) {
			System.out.println("ID " + "\t \t" + arrayPerson[i].getId());
			System.out.println("Nama " + "\t \t" + arrayPerson[i].getNama());
			System.out.println("Alamat " + "\t \t" + arrayPerson[i].getAlamat());
			System.out.println("Jenis Kelamin " + "\t" + arrayPerson[i].getJk());
			System.out.println("No Telepon " + "\t" + arrayPerson[i].getNoTelp());
			
			System.out.println();
		}

	}

}
