package Day6.Materi;

public class Orang {
	public int id;
	public String nama;
	public String alamat;
	public String jk;
	public String noTelp;
	
	public Orang() {
		
	}
	
	public Orang(int id, String nama, String alamat, String jk, String noTelp) {
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.jk = jk;
		this.noTelp = noTelp;
	}
	
	public int perhitungan(int a, int b, int c) {
		return a+b+c;
	
	}
	
	public String inputData(int id, String nama, String alamat, String jk, String noTelp) {
		return nama;
	
	}
	
	public void cetakData() {
		System.out.println("ID \t\t"+id);
		System.out.println("Nama \t\t"+nama);
		System.out.println("Alamat \t\t"+alamat);
		System.out.println("Jenis Kelamin \t"+jk);
		System.out.println("Nomor Telpon \t"+noTelp);
	}
}