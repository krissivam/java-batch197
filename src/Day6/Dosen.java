package Day6;

import Day6.Materi.Orang;

public class Dosen extends Orang {
	
	public String nik;
	public String spesialis;
	public int gaji;
	public String jabatan;
	public Orang fakultas; // Aggregation
	
	public void cetakData() {
		super.cetakData();
		System.out.println("NIK \t\t: " + nik);
		System.out.println("Spesialis \t: " + spesialis);
		System.out.println("Gaji \t\t: " + gaji);
		System.out.println("Jabatan \t: " + jabatan);
		System.out.println("Fakultas \t: " + fakultas);
	}

}
