package Day5.Materi;

public class Orang {
	
	public int id;
	public String nama;
	public String alamat;
	public String jk;
	public String noTelp;
	
	public int perhitungan(int a, int b, int c) {
		return a+b+c;
	}
	
	public void cetakData() {
		System.out.println("ID		: " + id);
		System.out.println("Nama		: " + nama);
		System.out.println("Alamat		: " + alamat);
		System.out.println("Jenis Kelamin	: " + jk);
		System.out.println("No Telepon	: " + noTelp);
	}

}
