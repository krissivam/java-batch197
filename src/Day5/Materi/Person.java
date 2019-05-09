package Day5.Materi;

public class Person {
	public int id;
	public String nama;
	public String alamat;
	public String jk;
	public String noTelp;
	
	public Person() {
		this.id = 0;
		this.nama = "";
		this.alamat = "";
		this.jk = "";
		this.noTelp = "";
	}
	
	public Person(int id, String nama, String alamat, String jk, String noTelp) {
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.jk = jk;
		this.noTelp = noTelp;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama() {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat() {
		this.alamat = alamat;
	}
	public String getJk() {
		return jk;
	}
	public void setJk() {
		this.jk = jk;
	}
	public String getNoTelp() {
		return noTelp;
	}
	public void setNoTelp() {
		this.noTelp = noTelp;
	}

}
