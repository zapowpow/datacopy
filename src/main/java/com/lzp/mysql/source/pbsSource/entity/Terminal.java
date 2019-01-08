package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * Terminal entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "terminal")
public class Terminal{

	private Long terminalId;
	private String terminalName;
	private Long facId;
	private Long taskConfigId;
	private Long curStatus;
	private Integer saveData;
	private Long eventSampleTime;
	private Integer invalidStatus;
	private Integer remoteAddress;
	private Integer address;
	private Integer unitType;
	private Integer pri;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TERMINAL_ID", unique = true, nullable = false, precision = 20)
	public Long getTerminalId() {
		return this.terminalId;
	}

	public void setTerminalId(Long terminalId) {
		this.terminalId = terminalId;
	}

	@Column(name = "FAC_ID")
	public Long getFacId() {
		return facId;
	}

	public void setFacId(Long facId) {
		this.facId = facId;
	}

	@Column(name = "TASK_CONFIG_ID")
	public Long getTaskConfigId() {
		return this.taskConfigId;
	}

	public void setTaskConfigId(Long taskConfigId) {
		this.taskConfigId = taskConfigId;
	}

	@Column(name = "TERMINAL_NAME", nullable = false, length = 64)
	public String getTerminalName() {
		return this.terminalName;
	}

	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

	@Column(name = "CUR_STATUS", precision = 20)
	public Long getCurStatus() {
		return this.curStatus;
	}

	public void setCurStatus(Long curStatus) {
		this.curStatus = curStatus;
	}

	@Column(name = "SAVE_DATA", precision = 10)
	public Integer getSaveData() {
		return this.saveData;
	}

	public void setSaveData(Integer saveData) {
		this.saveData = saveData;
	}

	@Column(name = "EVENT_SAMPLE_TIME", precision = 20)
	public Long getEventSampleTime() {
		return this.eventSampleTime;
	}

	public void setEventSampleTime(Long eventSampleTime) {
		this.eventSampleTime = eventSampleTime;
	}

	@Column(name = "INVALID_STATUS", precision = 10)
	public Integer getInvalidStatus() {
		return this.invalidStatus;
	}

	public void setInvalidStatus(Integer invalidStatus) {
		this.invalidStatus = invalidStatus;
	}

	@Column(name = "REMOTE_ADDRESS", precision = 10)
	public Integer getRemoteAddress() {
		return this.remoteAddress;
	}

	public void setRemoteAddress(Integer remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

	@Column(name = "ADDRESS", nullable = false, precision = 10)
	public Integer getAddress() {
		return this.address;
	}

	public void setAddress(Integer address) {
		this.address = address;
	}

	@Column(name = "UNIT_TYPE", precision = 10)
	public Integer getUnitType() {
		return this.unitType;
	}

	public void setUnitType(Integer unitType) {
		this.unitType = unitType;
	}

	@Column(name = "PRI", precision = 10)
	public Integer getPri() {
		return this.pri;
	}

	public void setPri(Integer pri) {
		this.pri = pri;
	}

	// @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy =
	// "terminal")
	// public Set<Termdevice> getTermdevices() {
	// return this.termdevices;
	// }
	//
	// public void setTermdevices(Set<Termdevice> termdevices) {
	// this.termdevices = termdevices;
	// }

}