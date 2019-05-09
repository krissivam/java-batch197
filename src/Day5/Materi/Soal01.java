package Day5.Materi;

public class Soal01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int namaVariable;
		Orang org01 = new Orang(); // Orang adalah sebuah tipe data
		org01.id = 001;
		org01.nama = "Parto";
		org01.alamat = "Jakarta";
		org01.jk = "Pria";
		org01.noTelp = "080989999";
		
		System.out.println("ID		: " + org01.id);
		System.out.println("Nama		: " + org01.nama);
		System.out.println("Alamat		: " + org01.alamat);
		System.out.println("Jenis Kelamin	: " + org01.jk);
		System.out.println("No Telepon	: " + org01.noTelp);
		
		System.out.println();
				
		Orang org02 = new Orang();
		org02.id = 002;
		org02.nama = "Sule";
		org02.alamat = "Jakarta";
		org02.jk = "Pria";
		org02.noTelp = "080989998";
		
		System.out.println("ID		: " + org02.id);
		System.out.println("Nama		: " + org02.nama);
		System.out.println("Alamat		: " + org02.alamat);
		System.out.println("Jenis Kelamin	: " + org02.jk);
		System.out.println("No Telepon	: " + org02.noTelp);
		
		System.out.println();
		
		Orang org03 = new Orang();
		org03.id = 003;
		org03.nama = "Nunung";
		org03.alamat = "Jakarta";
		org03.jk = "Wanita";
		org03.noTelp = "080989997";
		
		
		
		System.out.println("ID		: " + org03.id);
		System.out.println("Nama		: " + org03.nama);
		System.out.println("Alamat		: " + org03.alamat);
		System.out.println("Jenis Kelamin	: " + org03.jk);
		System.out.println("No Telepon	: " + org03.noTelp);
		
		System.out.println();
		
		org03.cetakData();
		
		int hasil = org03.perhitungan(5, 6, 7);
		System.out.println("Perhitungan	: " + hasil);
		
		Orang org = new Orang(); 
		
		
		
	}

}
