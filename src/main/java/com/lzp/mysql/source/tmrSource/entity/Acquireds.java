package com.lzp.mysql.source.tmrSource.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lzp.mysql.source.unit.DateTimeSerializer;
import com.lzp.mysql.source.unit.TimestampDeserializer;

/**
 * Acquireds entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "acquireds")
public class Acquireds implements java.io.Serializable {

	private Long acquiredId;
	private String acquiredName;
	private Long groupId;
	private Long parentId;
	private Long taskId;
	private Integer acquireInterval;
	private Integer initialDelay;
	private String regionCode;
	private Long curStatus;// default_value: 0
	private Integer address;
	private Integer pri;
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp lastAcquireTime;
	private Long commMode;// default_value: 1
	private Integer intervalType;// default_value: 0
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp initialTime;
	private Integer intervalUnit;
	private Long serviceId;


	@Id
	@Column(name = "ACQUIRED_ID", unique = true, nullable = false)
	public Long getAcquiredId() {
		return this.acquiredId;
	}

	public void setAcquiredId(Long acquiredId) {
		this.acquiredId = acquiredId;
	}

	@Column(name = "ACQUIRED_NAME",  length = 64)
	public String getAcquiredName() {
		return this.acquiredName;
	}

	public void setAcquiredName(String acquiredName) {
		this.acquiredName = acquiredName;
	}

	@Column(name = "GROUP_ID")
	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	@Column(name = "PARENT_ID")
	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@Column(name = "TASK_ID")
	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	@Column(name = "ACQUIRE_INTERVAL", nullable = false)
	public Integer getAcquireInterval() {
		return this.acquireInterval;
	}

	public void setAcquireInterval(Integer acquireInterval) {
		this.acquireInterval = acquireInterval;
	}

	@Column(name = "INITIAL_DELAY", nullable = false)
	public Integer getInitialDelay() {
		return this.initialDelay;
	}

	public void setInitialDelay(Integer initialDelay) {
		this.initialDelay = initialDelay;
	}

	@Column(name = "REGION_CODE", length = 32)
	public String getRegionCode() {
		return this.regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	@Column(name = "CUR_STATUS")
	public Long getCurStatus() {
		return this.curStatus;
	}

	public void setCurStatus(Long curStatus) {
		this.curStatus = curStatus;
	}

	@Column(name = "ADDRESS")
	public Integer getAddress() {
		return this.address;
	}

	public void setAddress(Integer address) {
		this.address = address;
	}

	@Column(name = "PRI")
	public Integer getPri() {
		return this.pri;
	}

	public void setPri(Integer pri) {
		this.pri = pri;
	}

	@Column(name = "LAST_ACQUIRE_TIME")
	public Timestamp getLastAcquireTime() {
		return this.lastAcquireTime;
	}

	public void setLastAcquireTime(Timestamp lastAcquireTime) {
		this.lastAcquireTime = lastAcquireTime;
	}

	@Column(name = "COMM_MODE")
	public Long getCommMode() {
		return this.commMode;
	}

	public void setCommMode(Long commMode) {
		this.commMode = commMode;
	}

	@Column(name = "INTERVAL_TYPE")
	public Integer getIntervalType() {
		return intervalType;
	}

	public void setIntervalType(Integer intervalType) {
		this.intervalType = intervalType;
	}

	@Column(name = "INITIAL_TIME")
	public Timestamp getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(Timestamp initialTime) {
		this.initialTime = initialTime;
	}

	@Column(name = "INTERVAL_UNIT")
	public Integer getIntervalUnit() {
		return intervalUnit;
	}

	public void setIntervalUnit(Integer intervalUnit) {
		this.intervalUnit = intervalUnit;
	}

	@Column(name = "SERVICE_ID")
	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

}