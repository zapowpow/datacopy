package com.lzp.mysql.source.tmrSource.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lzp.mysql.source.unit.DateTimeSerializer;
import com.lzp.mysql.source.unit.TimestampDeserializer;
/**
 * InstantaneousValues entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "INSTANTANEOUS_VALUES")
public class InstantaneousValues{
	private Long ivId;
	private String ivName;
	private Short ivType;
	private Integer ivAddr;
	private Long meterId;
	private Integer isLimitValid;
	private Integer limitValidInterval;
	private Double lowLimit;
	private Double upLimit;
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp limitValidTimeTag;

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



	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IV_ID", unique = true, nullable = false)
	public Long getIvId() {
		return this.ivId;
	}

	public void setIvId(Long ivId) {
		this.ivId = ivId;
	}

	@Column(name = "IV_NAME", nullable = false, length = 64)
	public String getIvName() {
		return this.ivName;
	}

	public void setIvName(String ivName) {
		this.ivName = ivName;
	}

	@Column(name = "IV_TYPE")
	public Short getIvType() {
		return this.ivType;
	}

	public void setIvType(Short ivType) {
		this.ivType = ivType;
	}

	@Column(name = "IV_ADDR", nullable = false)
	public Integer getIvAddr() {
		return this.ivAddr;
	}

	public void setIvAddr(Integer ivAddr) {
		this.ivAddr = ivAddr;
	}

	@Column(name = "METER_ID", nullable = false)
	public Long getMeterId() {
		return this.meterId;
	}

	public void setMeterId(Long meterId) {
		this.meterId = meterId;
	}
}