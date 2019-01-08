package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * Factory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "factory")
public class Factory {
	private Long facId;
	private Long areaId;
	private String facName;
	private Integer facType;
	private Long facNo;
	private Integer highVolType;
	private Long emsId;
	private String emsName;
	private Short isInUse;
	private Long userDefinedNo;
	private String userDefinedAlTmr;

	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FAC_ID", unique = true, nullable = false, precision = 20)
	public Long getFacId() {
		return this.facId;
	}

	public void setFacId(Long facId) {
		this.facId = facId;
	}

	@Column(name = "AREA_ID", nullable = false, precision = 20)
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	@Column(name = "FAC_NAME", nullable = false, length = 64)
	public String getFacName() {
		return this.facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	@Column(name = "FAC_TYPE", nullable = false, precision = 10)
	public Integer getFacType() {
		return this.facType;
	}

	public void setFacType(Integer facType) {
		this.facType = facType;
	}

	@Column(name = "FAC_NO", nullable = false, precision = 10)
	public Long getFacNo() {
		return this.facNo;
	}

	public void setFacNo(Long facNo) {
		this.facNo = facNo;
	}

	@Column(name = "HIGH_VOL_TYPE", precision = 10)
	public Integer getHighVolType() {
		return this.highVolType;
	}

	public void setHighVolType(Integer highVolType) {
		this.highVolType = highVolType;
	}

	@Column(name = "EMS_ID", precision = 20)
	public Long getEmsId() {
		return this.emsId;
	}

	public void setEmsId(Long emsId) {
		this.emsId = emsId;
	}

	@Column(name = "EMS_NAME", length = 64)
	public String getEmsName() {
		return this.emsName;
	}

	public void setEmsName(String emsName) {
		this.emsName = emsName;
	}

	@Column(name = "IS_IN_USE", precision = 3)
	public Short getIsInUse() {
		return this.isInUse;
	}

	public void setIsInUse(Short isInUse) {
		this.isInUse = isInUse;
	}

	@Column(name = "USER_DEFINED_NO", precision = 10)
	public Long getUserDefinedNo() {
		return this.userDefinedNo;
	}

	public void setUserDefinedNo(Long userDefinedNo) {
		this.userDefinedNo = userDefinedNo;
	}

	@Column(name = "USER_DEFINED_ALTmr", length = 64)
	public String getUserDefinedAlTmr() {
		return this.userDefinedAlTmr;
	}

	public void setUserDefinedAlTmr(String userDefinedAlTmr) {
		this.userDefinedAlTmr = userDefinedAlTmr;
	}

}