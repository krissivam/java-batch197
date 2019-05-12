package Day6;

import Day5.StudyCase.Orang;

public class MainOOP {

	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa();
		mhs.id = 1;
		mhs.nama = "Joni";
		mhs.alamat = "Bojong Soang";
		mhs.jk= "Pria";
		mhs.noTelp= "080989999";
		mhs.nim = "1215031007";
		mhs.jurusan = "Teknik Nuklir";
		mhs.fakultas = "Teknik";
		mhs.angkatan = "2012";
		mhs.ipk = 2.5;
		mhs.cetakData();
		System.out.println();

		Dosen dsn = new Dosen();
		dsn.id = 2;
		dsn.nama = "Bambang Widodo";
		dsn.alamat = "Jepara";
		dsn.jk = "Pria";
		dsn.noTelp = "072176767676";
		dsn.nik = "DSN0001";
		dsn.spesialis = "Teknik Elektro";
		dsn.gaji = 9000000;
		dsn.jabatan = "Kepala Lab. Elektronika";
		Day6.Materi.Orang org01 = new Day6.Materi.Orang();
		dsn.fakultas = org01;
		dsn.cetakData();
		System.out.println();
		
		
		Staff stf = new Staff();
		stf.id = 3;
		stf.nama = "Marteen";
		stf.alamat = "Kuningan";
		stf.jk = "Pria";
		stf.noTelp = "09877890098";
		stf.nik = "STF00001";
		stf.jabatan = "OB";
		stf.gaji = 7000000;
		stf.departemen = "Tata Usaha";
		Day6.Materi.Orang org02 = new Day6.Materi.Orang();
		stf.atasan = org02;
		stf.cetakData();

	}

}
