package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * Yc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "yc")
public class Yc{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "YC_ID", unique = true, nullable = false, precision = 20)
	private Long ycId;
	@Column(name = "FAC_ID", precision = 20)
	private Long facId;
	@Column(name = "METER_ID", precision = 20)
	private Long meterId;
	@Column(name = "DEV_ID", precision = 20)
	private Long devId;
	@Column(name = "METER_SERIAL", nullable = false, precision = 10)
	private Integer meterSerial;
	@Column(name = "YC_NAME", nullable = false, length = 64)
	private String ycName;
	@Column(name = "YC_TYPE", precision = 20)
	private Long ycType;
	@Column(name = "YC_NO", precision = 20)
	private Long ycNo;
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

	public Long getYcId() {
		return ycId;
	}

	public void setYcId(Long ycId) {
		this.ycId = ycId;
	}

	public Long getFacId() {
		return facId;
	}

	public void setFacId(Long facId) {
		this.facId = facId;
	}

	public Long getMeterId() {
		return meterId;
	}

	public void setMeterId(Long meterId) {
		this.meterId = meterId;
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

	public String getYcName() {
		return ycName;
	}

	public void setYcName(String ycName) {
		this.ycName = ycName;
	}

	public Long getYcType() {
		return ycType;
	}

	public void setYcType(Long ycType) {
		this.ycType = ycType;
	}

	public Long getYcNo() {
		return ycNo;
	}

	public void setYcNo(Long ycNo) {
		this.ycNo = ycNo;
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