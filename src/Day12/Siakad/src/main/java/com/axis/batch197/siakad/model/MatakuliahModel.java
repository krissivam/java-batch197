package com.axis.batch197.siakad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "mata_kuliah")
public class MatakuliahModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "matakuliah_seq")
	@TableGenerator(name = "matakuliah_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "kd_matakuliah", length = 10, nullable = false)
	private String kdMatakuliah;
	
	@Column(name = "nm_matakuliah", length = 100, nullable = false)
	private String nmMatakuliah;
	
	@Column(name = "sks")
	private int sks;
	
	@Column(name = "kd_jurusan", length = 10, nullable = false)
	private String kdJurusan;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKdMatakuliah() {
		return kdMatakuliah;
	}

	public void setKdMatakuliah(String kdMatakuliah) {
		this.kdMatakuliah = kdMatakuliah;
	}

	public String getNmMatakuliah() {
		return nmMatakuliah;
	}

	public void setNmMatakuliah(String nmMatakuliah) {
		this.nmMatakuliah = nmMatakuliah;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}

	public String getKdJurusan() {
		return kdJurusan;
	}

	public void setKdJurusan(String kdJurusan) {
		this.kdJurusan = kdJurusan;
	}

	

}
