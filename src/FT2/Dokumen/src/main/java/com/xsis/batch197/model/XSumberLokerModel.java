package com.xsis.batch197.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="x_sumber_loker")
public class XSumberLokerModel {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="x_sumber_loker_idx")
	@TableGenerator(name="x_sumber_loker_idx", table="tbl_index", pkColumnName="index_id", valueColumnName="index_value", initialValue=0, allocationSize=1)
	@Column(name="id", length = 11)
	private Long id;
	
	@NotNull
	@NotBlank
	@NotEmpty
	@Column(name="created_by", nullable=false, length = 11)
	private Long createdBy;
	
	@NotNull
	@NotBlank
	@NotEmpty
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="created_on", nullable=false)
	private Date createdOn;
	
	@Column(name="modified_by", nullable=true, length=11)
	private Long modifiedBy;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="modified_on", nullable=true)
	private Date modifiedOn;
	
	@Column(name="deleted_by", nullable=true, length=11)
	private Long deletedBy;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="deleted_on", nullable=true)
	private Date deletedOn;
	
	@NotNull
	@NotBlank
	@NotEmpty
	@Column(name="is_delete", nullable=false)
	private Boolean isDelete;
	
	@NotNull
	@NotBlank
	@NotEmpty
	@Column(name="biodata_id", nullable=false, length=11)
	private Long biodataId;
	
	@Column(name="vacancy_source", nullable=true, length=20)
	private String vacancySource;
	
	@Column(name="candidate_type", nullable=true, length=10)
	private String candidateType;
	
	@Column(name="event_name", nullable=true, length=100)
	private String eventName;
	
	@Column(name="career_center_name", nullable=true, length=100)
	private String careerCenterName;
	
	@Column(name="referrer_name", nullable=true, length=100)
	private String referrerName;
	
	@Column(name="referrer_phone", nullable=true, length=20)
	private String referrerPhone;
	
	@Column(name="referrer_email", nullable=true, length=100)
	private String referrerEmail;
	
	@Column(name="other_source", nullable=true, length=100)
	private String otherSource;
	
	@Column(name="last_income", nullable=true, length=100)
	private String lastIncome;
	
	@Column(name="apply_date", nullable=true, length=100)
	private String applyDate;

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

	public Long getBiodataId() {
		return biodataId;
	}

	public void setBiodataId(Long biodataId) {
		this.biodataId = biodataId;
	}

	public String getVacancySource() {
		return vacancySource;
	}

	public void setVacancySource(String vacancySource) {
		this.vacancySource = vacancySource;
	}

	public String getCandidateType() {
		return candidateType;
	}

	public void setCandidateType(String candidateType) {
		this.candidateType = candidateType;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getCareerCenterName() {
		return careerCenterName;
	}

	public void setCareerCenterName(String careerCenterName) {
		this.careerCenterName = careerCenterName;
	}

	public String getReferrerName() {
		return referrerName;
	}

	public void setReferrerName(String referrerName) {
		this.referrerName = referrerName;
	}

	public String getReferrerPhone() {
		return referrerPhone;
	}

	public void setReferrerPhone(String referrerPhone) {
		this.referrerPhone = referrerPhone;
	}

	public String getReferrerEmail() {
		return referrerEmail;
	}

	public void setReferrerEmail(String referrerEmail) {
		this.referrerEmail = referrerEmail;
	}

	public String getOtherSource() {
		return otherSource;
	}

	public void setOtherSource(String otherSource) {
		this.otherSource = otherSource;
	}

	public String getLastIncome() {
		return lastIncome;
	}

	public void setLastIncome(String lastIncome) {
		this.lastIncome = lastIncome;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	
	
}
