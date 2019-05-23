package com.axis.batch197.siakad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="dosen")
public class DosenModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "dosen_seq")
    @TableGenerator(name = "dosen_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
    @Column(name = "id")
    private int id;
	
	@Column(name ="kd_dosen", length = 10)
	private String kdDosen;
	
	@Column(name ="nm_dosen", length = 50)
	private String nmDosen;
	
	@Column(name ="jk", length = 10)
	private String jk;
	
	@Column(name ="alamat", length = 100)
	private String alamat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKdDosen() {
		return kdDosen;
	}

	public void setKdDosen(String kdDosen) {
		this.kdDosen = kdDosen;
	}

	public String getNmDosen() {
		return nmDosen;
	}

	public void setNmDosen(String nmDosen) {
		this.nmDosen = nmDosen;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

}
