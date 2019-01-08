package com.lzp.mysql.source.tmrSource.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lzp.mysql.source.unit.DateTimeSerializer;
import com.lzp.mysql.source.unit.TimestampDeserializer;
/**
 * ReactivePulses entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "REACTIVE_PULSES")
public class ReactivePulses{

	private Long rpId;
	private String rpName;
	private Short rpType;
	private Integer address;
	private Long meterId;
	private Integer isLimitValid;
	private Integer limitValidInterval;
	private Double lowLimit;
	private Double upLimit;
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp limitValidTimeTag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RP_ID", unique = true, nullable = false)
	public Long getRpId() {
		return this.rpId;
	}

	public void setRpId(Long rpId) {
		this.rpId = rpId;
	}

	@Column(name = "RP_NAME", nullable = false, length = 64)
	public String getRpName() {
		return this.rpName;
	}

	public void setRpName(String rpName) {
		this.rpName = rpName;
	}

	@Column(name = "RP_TYPE")
	public Short getRpType() {
		return this.rpType;
	}

	public void setRpType(Short rpType) {
		this.rpType = rpType;
	}

	@Column(name = "ADDRESS", nullable = false)
	public Integer getAddress() {
		return this.address;
	}

	public void setAddress(Integer address) {
		this.address = address;
	}

	@Column(name = "METER_ID", nullable = false)
	public Long getMeterId() {
		return this.meterId;
	}

	public void setMeterId(Long meterId) {
		this.meterId = meterId;
	}

	@Column(name = "IS_LIMIT_VALID")
	public Integer getIsLimitValid() {
		return this.isLimitValid;
	}

	public void setIsLimitValid(Integer isLimitValid) {
		this.isLimitValid = isLimitValid;
	}

	@Column(name = "LIMIT_VALID_INTERVAL")
	public Integer getLimitValidInterval() {
		return this.limitValidInterval;
	}

	public void setLimitValidInterval(Integer limitValidInterval) {
		this.limitValidInterval = limitValidInterval;
	}

	@Column(name = "LOW_LIMIT")
	public Double getLowLimit() {
		return this.lowLimit;
	}

	public void setLowLimit(Double lowLimit) {
		this.lowLimit = lowLimit;
	}

	@Column(name = "UP_LIMIT")
	public Double getUpLimit() {
		return this.upLimit;
	}

	public void setUpLimit(Double upLimit) {
		this.upLimit = upLimit;
	}

	@Column(name = "LIMIT_VALID_TIME_TAG")
	public Timestamp getLimitValidTimeTag() {
		return limitValidTimeTag;
	}

	public void setLimitValidTimeTag(Timestamp limitValidTimeTag) {
		this.limitValidTimeTag = limitValidTimeTag;
	}
}