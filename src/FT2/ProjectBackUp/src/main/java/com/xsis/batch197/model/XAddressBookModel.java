package com.xsis.batch197.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "x_addrbook")
public class XAddressBookModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "x_addrbook_idx")
	@TableGenerator(name = "x_addrbook_idx", table = "tbl_index", pkColumnName = "index_id", valueColumnName = "index_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id" , length = 11)
	private Long id;

//	@NotNull
//	@NotBlank
//	@NotEmpty
	@CreatedBy
	@Column(name = "created_by", length = 11, nullable = false)
	private Long createdBy;

//	@NotNull
//	@NotBlank
//	@NotEmpty
	@CreatedDate
	@Column(name = "created_on", nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdOn;

	@LastModifiedBy
	@Column(name = "modified_by", length = 11, nullable = true)
	private Long modifiedBy;

	@LastModifiedDate
	@Column(name = "modified_on", nullable = true)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date modifiedOn;

	@Column(name = "deleted_by", length = 11, nullable = true)
	private Long deletedBy;

	@Column(name = "deleted_on", nullable = true)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deletedOn;

//	@NotNull
//	@NotBlank
//	@NotEmpty
	@Column(name = "is_delete", nullable = false)
	private Boolean isDelete;

//	@NotNull
//	@NotBlank
//	@NotEmpty
	@Column(name = "is_locked", nullable = false)
	private Boolean isLocked;

	@NotNull
	@NotBlank
	@NotEmpty
	@Column(name = "email", length = 100, nullable = false)
	private String email;

	@NotNull(message="Name is compulsory")
	@NotBlank
	@NotEmpty
	@Column(name = "abuid", length = 50, nullable = false)
	private String abuid;

	@NotNull(message="Password is compulsory")
	@NotBlank
	@NotEmpty
	@Length(min=8, message="Password should be at least 8 characters")
	@Column(name = "abpwd", length = 50, nullable = false)
	private String abpwd;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "x_userrole", joinColumns = @JoinColumn(name = "addrbook_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<XRoleModel> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Long getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(Long deletedBy) {
		this.deletedBy = deletedBy;
	}

	public Date getDeletedOn() {
		return deletedOn;
	}

	public void setDeletedOn(Date deletedOn) {
		this.deletedOn = deletedOn;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbuid() {
		return abuid;
	}

	public void setAbuid(String abuid) {
		this.abuid = abuid;
	}

	public String getAbpwd() {
		return abpwd;
	}

	public void setAbpwd(String abpwd) {
		this.abpwd = abpwd;
	}

	public Set<XRoleModel> getRoles() {
		return roles;
	}

	public void setRoles(Set<XRoleModel> roles) {
		this.roles = roles;
	}

}
