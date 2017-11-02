package com.revature.entity;
// Generated Nov 2, 2017 9:19:06 AM by Hibernate Tools 5.2.5.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TfClient generated by hbm2java
 */
@Entity
@Table(name = "TF_CLIENT", schema = "ADMIN")
public class TfClient implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1189336735420927002L;
	private BigDecimal tfClientId;
	private String tfClientName;
	private Set<TfPlacement> tfPlacements = new HashSet<TfPlacement>(0);
	private Set<TfInterview> tfInterviews = new HashSet<TfInterview>(0);
	private Set<TfBatch> tfBatches = new HashSet<TfBatch>(0);

	public TfClient() {
	}

	public TfClient(BigDecimal tfClientId) {
		this.tfClientId = tfClientId;
	}

	public TfClient(BigDecimal tfClientId, String tfClientName, Set<TfPlacement> tfPlacements,
			Set<TfInterview> tfInterviews, Set<TfBatch> tfBatches) {
		this.tfClientId = tfClientId;
		this.tfClientName = tfClientName;
		this.tfPlacements = tfPlacements;
		this.tfInterviews = tfInterviews;
		this.tfBatches = tfBatches;
	}

	@Id

	@Column(name = "TF_CLIENT_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getTfClientId() {
		return this.tfClientId;
	}

	public void setTfClientId(BigDecimal tfClientId) {
		this.tfClientId = tfClientId;
	}

	@Column(name = "TF_CLIENT_NAME", length = 30)
	public String getTfClientName() {
		return this.tfClientName;
	}

	public void setTfClientName(String tfClientName) {
		this.tfClientName = tfClientName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tfClient")
	public Set<TfPlacement> getTfPlacements() {
		return this.tfPlacements;
	}

	public void setTfPlacements(Set<TfPlacement> tfPlacements) {
		this.tfPlacements = tfPlacements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tfClient")
	public Set<TfInterview> getTfInterviews() {
		return this.tfInterviews;
	}

	public void setTfInterviews(Set<TfInterview> tfInterviews) {
		this.tfInterviews = tfInterviews;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tfClient")
	public Set<TfBatch> getTfBatches() {
		return this.tfBatches;
	}

	public void setTfBatches(Set<TfBatch> tfBatches) {
		this.tfBatches = tfBatches;
	}

}