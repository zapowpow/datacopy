package com.lzp.mysql.source.tmrSource.entity;


import javax.persistence.*;

/**
 * Substation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "substation")
public class Substation{
	private Long subareaId;
	private Long bvId;
	private Short type;
	private Long stNo;
	private Long status;
	private String rdfId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SUBAREA_ID", nullable = false)
	public Long getSubareaId() {
		return this.subareaId;
	}

	public void setSubareaId(Long subareaId) {
		this.subareaId = subareaId;
	}

	@Column(name = "BV_ID")
	public Long getBvId() {
		return this.bvId;
	}

	public void setBvId(Long bvId) {
		this.bvId = bvId;
	}

	@Column(name = "TYPE")
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	@Column(name = "ST_NO")
	public Long getStNo() {
		return this.stNo;
	}

	public void setStNo(Long stNo) {
		this.stNo = stNo;
	}

	@Column(name = "STATUS")
	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	@Column(name = "RDF_ID", length = 256)
	public String getRdfId() {
		return this.rdfId;
	}

	public void setRdfId(String rdfId) {
		this.rdfId = rdfId;
	}
}