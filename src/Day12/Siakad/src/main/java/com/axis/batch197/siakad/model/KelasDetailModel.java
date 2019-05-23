package com.axis.batch197.siakad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="kelas_detail")
public class KelasDetailModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "kelasdetail_seq")
	@TableGenerator(name = "kelasdetail_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "kd_kelas", length = 10, nullable = false)
	private String kdKelas;
	
	@Column(name = "nim", length = 10, nullable = false)
	private String nim;
	
	@Column(name = "nilai", length = 1, nullable = false)
	private String nilai;
	
	@Column(name = "status", length = 10, nullable = false)
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKdKelas() {
		return kdKelas;
	}

	public void setKdKelas(String kdKelas) {
		this.kdKelas = kdKelas;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNilai() {
		return nilai;
	}

	public void setNilai(String nilai) {
		this.nilai = nilai;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
