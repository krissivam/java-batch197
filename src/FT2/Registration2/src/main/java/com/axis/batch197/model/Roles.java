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
@Table(name = "roles", uniqueConstraints = {
		@UniqueConstraint(name = "ROLES_UK", columnNames = "roles_name")
})
public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "roles_idx")
	@TableGenerator(name = "roles_idx", table = "tbl_index", pkColumnName = "index_id", valueColumnName = "index_value", initialValue = 0, allocationSize = 1)
	@Column(name = "roles_id", nullable=false)
	private Long rolesId;

	@Column(name = "roles_name", length = 100, nullable = false)
	private String rolesName;

	public Long getRolesId() {
		return rolesId;
	}

	public void setRolesId(Long rolesId) {
		this.rolesId = rolesId;
	}

	public String getRolesName() {
		return rolesName;
	}

	public void setRolesName(String rolesName) {
		this.rolesName = rolesName;
	}

}