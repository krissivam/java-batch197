package com.axis.batch197.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = {
		@UniqueConstraint(name = "USERS_UK", columnNames = "users_name")
})
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "users_idx")
	@TableGenerator(name = "users_idx", table = "tbl_index", pkColumnName = "index_id", valueColumnName = "index_value", initialValue = 0, allocationSize = 1)
	@Column(name = "users_id", nullable = false)
	private Long usersId;

	@Column(name = "email", length = 50, nullable = false)
	private String email;

	@Column(name = "nama_lengkap", length = 50, nullable = false)
	private String namaLengkap;

	@Column(name = "password", length = 50, nullable = false)
	private String password;
	
	@Column(name = "Enabled", length = 1, nullable = false)
    private boolean enabled;

	public Long getUsersId() {
		return usersId;
	}

	public void setUsersId(Long usersId) {
		this.usersId = usersId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNamaLengkap() {
		return namaLengkap;
	}

	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}