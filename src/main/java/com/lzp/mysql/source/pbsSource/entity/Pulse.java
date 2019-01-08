package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * Pulse entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pulse")
public class Pulse{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PULSE_ID", unique = true, nullable = false, precision = 20)
	private Long pulseId;
	@Column(name = "METER_ID", precision = 20)
	private Long meterId;
	@Column(name = "FAC_ID", precision = 20)
	private Long facId;
	@Column(name = "DEV_ID", precision = 20)
	private Long devId;
	@Column(name = "METER_SERIAL", nullable = false, precision = 10)
	private Integer meterSerial;
	@Column(name = "PULSE_NAME", nullable = false, length = 64)
	private String pulseName;
	@Column(name = "PULSE_TYPE", precision = 20)
	private Long pulseType;
	@Column(name = "PULSE_NO", nullable = false, precision = 20)
	private Long pulseNo;
	@Column(name = "IS_LIMIT_VALID", nullable = false, precision = 10)
	private Integer isLimitValid;
	@Column(name = "UP_LIMIT", nullable = false, precision = 10)
	private Integer upLimit;
	@Column(name = "LOW_LIMIT", nullable = false, precision = 10)
	private Integer lowLimit;
	@Column(name = "LIMIT_VALID_INTERVAL", nullable = false, precision = 10)
	private Integer limitValidInterval;
	@Column(name = "LIMIT_VALID_TIME_TAG", precision = 20)
	private Long limitValidTimeTag;

	// Property accessors

	public Long getPulseId() {
		return pulseId;
	}

	public void setPulseId(Long pulseId) {
		this.pulseId = pulseId;
	}

	public Long getMeterId() {
		return meterId;
	}

	public void setMeterId(Long meterId) {
		this.meterId = meterId;
	}

	public Long getFacId() {
		return facId;
	}

	public void setFacId(Long facId) {
		this.facId = facId;
	}

	public Long getDevId() {
		return devId;
	}

	public void setDevId(Long devId) {
		this.devId = devId;
	}

	public Integer getMeterSerial() {
		return meterSerial;
	}

	public void setMeterSerial(Integer meterSerial) {
		this.meterSerial = meterSerial;
	}

	public String getPulseName() {
		return pulseName;
	}

	public void setPulseName(String pulseName) {
		this.pulseName = pulseName;
	}

	public Long getPulseType() {
		return pulseType;
	}

	public void setPulseType(Long pulseType) {
		this.pulseType = pulseType;
	}

	public Long getPulseNo() {
		return pulseNo;
	}

	public void setPulseNo(Long pulseNo) {
		this.pulseNo = pulseNo;
	}

	public Integer getIsLimitValid() {
		return isLimitValid;
	}

	public void setIsLimitValid(Integer isLimitValid) {
		this.isLimitValid = isLimitValid;
	}

	public Integer getUpLimit() {
		return upLimit;
	}

	public void setUpLimit(Integer upLimit) {
		this.upLimit = upLimit;
	}

	public Integer getLowLimit() {
		return lowLimit;
	}

	public void setLowLimit(Integer lowLimit) {
		this.lowLimit = lowLimit;
	}

	public Integer getLimitValidInterval() {
		return limitValidInterval;
	}

	public void setLimitValidInterval(Integer limitValidInterval) {
		this.limitValidInterval = limitValidInterval;
	}

	public Long getLimitValidTimeTag() {
		return limitValidTimeTag;
	}

	public void setLimitValidTimeTag(Long limitValidTimeTag) {
		this.limitValidTimeTag = limitValidTimeTag;
	}

}