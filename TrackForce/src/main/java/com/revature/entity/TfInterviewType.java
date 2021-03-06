package com.revature.entity;
// Generated Nov 7, 2017 9:24:46 PM by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TfInterviewType generated by hbm2java
 */
@Entity
@Table(name = "TF_INTERVIEW_TYPE", schema = "ADMIN")
public class TfInterviewType implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4949282863102956521L;
	private Integer tfInterviewTypeId;
	private String tfInterviewTypeName;
	private Set<TfInterview> tfInterviews = new HashSet<TfInterview>(0);

	public TfInterviewType() {
	}

	public TfInterviewType(Integer tfInterviewTypeId) {
		this.tfInterviewTypeId = tfInterviewTypeId;
	}

	public TfInterviewType(Integer tfInterviewTypeId, String tfInterviewTypeName, Set<TfInterview> tfInterviews) {
		this.tfInterviewTypeId = tfInterviewTypeId;
		this.tfInterviewTypeName = tfInterviewTypeName;
		this.tfInterviews = tfInterviews;
	}

	@Id
	@Column(name = "TF_INTERVIEW_TYPE_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public Integer getTfInterviewTypeId() {
		return this.tfInterviewTypeId;
	}

	public void setTfInterviewTypeId(Integer tfInterviewTypeId) {
		this.tfInterviewTypeId = tfInterviewTypeId;
	}

	@Column(name = "TF_INTERVIEW_TYPE_NAME", length = 30)
	public String getTfInterviewTypeName() {
		return this.tfInterviewTypeName;
	}

	public void setTfInterviewTypeName(String tfInterviewTypeName) {
		this.tfInterviewTypeName = tfInterviewTypeName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tfInterviewType")
	public Set<TfInterview> getTfInterviews() {
		return this.tfInterviews;
	}

	public void setTfInterviews(Set<TfInterview> tfInterviews) {
		this.tfInterviews = tfInterviews;
	}

}
