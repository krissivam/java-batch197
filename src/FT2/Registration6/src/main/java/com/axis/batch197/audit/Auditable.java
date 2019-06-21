//package com.axis.batch197.audit;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.EntityListeners;
//import javax.persistence.MappedSuperclass;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.NotNull;
//
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import org.springframework.format.annotation.DateTimeFormat;
//
//@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
//public class Auditable {
//
//    @NotNull
//	@CreatedBy
//    @Column(name = "created_by", length = 11, nullable = false)
//    private Long createdBy;
//
//    @NotNull
//    @CreatedDate
//    @Column(name = "created_on", length = 11, nullable = false)
//    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date createdOn;
//
//    @Column(name = "modified_by", length = 11, nullable = true)
//    @LastModifiedBy
//    private Long modifiedBy;
//
//    @LastModifiedDate
//    @Column(name = "modified_on", length = 11, nullable = true)
//    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date modifiedOn;
//
//	public Long getCreatedBy() {
//		return createdBy;
//	}
//
//	public void setCreatedBy(Long createdBy) {
//		this.createdBy = createdBy;
//	}
//
//	public Date getCreatedOn() {
//		return createdOn;
//	}
//
//	public void setCreatedOn(Date createdOn) {
//		this.createdOn = createdOn;
//	}
//
//	public Long getModifiedBy() {
//		return modifiedBy;
//	}
//
//	public void setModifiedBy(Long modifiedBy) {
//		this.modifiedBy = modifiedBy;
//	}
//
//	public Date getModifiedOn() {
//		return modifiedOn;
//	}
//
//	public void setModifiedOn(Date modifiedOn) {
//		this.modifiedOn = modifiedOn;
//	}
//    
//	
//
//}