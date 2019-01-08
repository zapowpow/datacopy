package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * IpFour entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ip_four")
public class IpFour{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IP_ID", unique = true, nullable = false, precision = 20)
	private Long ipId;
	@Column(name = "FAC_ID", precision = 20)
	private Long facId;
	@Column(name = "METER_ID", precision = 20)
	private Long meterId;
	@Column(name = "DEV_ID", precision = 20)
	private Long devId;
	@Column(name = "METER_SERIAL", nullable = false, precision = 10)
	private Integer meterSerial;
	@Column(name = "IP_NAME", nullable = false, length = 64)
	private String ipName;
	@Column(name = "IP_TYPE", precision = 10)
	private Long ipType;
	@Column(name = "IP_NO", precision = 10)
	private Long ipNo;
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

	public Long getIpId() {
		return ipId;
	}

	public void setIpId(Long ipId) {
		this.ipId = ipId;
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

	public String getIpName() {
		return ipName;
	}

	public void setIpName(String ipName) {
		this.ipName = ipName;
	}

	public Long getIpType() {
		return ipType;
	}

	public void setIpType(Long ipType) {
		this.ipType = ipType;
	}

	public Long getIpNo() {
		return ipNo;
	}

	public void setIpNo(Long ipNo) {
		this.ipNo = ipNo;
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