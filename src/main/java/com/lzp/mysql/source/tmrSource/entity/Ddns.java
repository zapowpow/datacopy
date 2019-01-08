package com.lzp.mysql.source.tmrSource.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lzp.mysql.source.unit.DateTimeSerializer;
import com.lzp.mysql.source.unit.TimestampDeserializer;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ddns")
public class Ddns{
	private Long channelId;
	private Long protocolId;
	private String channelName;
	private Long acquiredId;
	private Long commParamId;
	private Long tsId;
	private Long status;
	private Integer port;
	private String param;
	private Integer tryTimes;
	private final ThreadLocal<Timestamp> commTimeTag = new ThreadLocal<>();
	private Integer maxCommDelay;
	private Short isInUse;
	private Long serviceId;
	private Long pri;
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp lastSuccessTimeTag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CHANNEL_ID", unique = true, nullable = false)
	public Long getChannelId() {
		return this.channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	@Column(name = "PROTOCOL_ID")
	public Long getProtocolId() {
		return this.protocolId;
	}

	public void setProtocolId(Long protocolId) {
		this.protocolId = protocolId;
	}

	@Column(name = "CHANNEL_NAME", nullable = false, length = 64)
	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	@Column(name = "ACQUIRED_ID", nullable = false)
	public Long getAcquiredId() {
		return this.acquiredId;
	}

	public void setAcquiredId(Long acquiredId) {
		this.acquiredId = acquiredId;
	}

	@Column(name = "COMM_PARAM_ID")
	public Long getCommParamId() {
		return this.commParamId;
	}

	public void setCommParamId(Long commParamId) {
		this.commParamId = commParamId;
	}
	
	@Column(name = "TS_ID")
	public Long getTsId() {
		return this.tsId;
	}

	public void setTsId(Long tsId) {
		this.tsId = tsId;
	}

	@Column(name = "STATUS")
	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	@Column(name = "PORT")
	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	@Column(name = "PARAM", length = 64)
	public String getParam() {
		return this.param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	@Column(name = "TRY_TIMES")
	public Integer getTryTimes() {
		return this.tryTimes;
	}

	public void setTryTimes(Integer tryTimes) {
		this.tryTimes = tryTimes;
	}

	@Column(name = "COMM_TIME_TAG", length = 19)
	public Timestamp getCommTimeTag() {
		return this.commTimeTag.get();
	}

	public void setCommTimeTag(Timestamp commTimeTag) {
		this.commTimeTag.set(commTimeTag);
	}

	@Column(name = "MAX_COMM_DELAY")
	public Integer getMaxCommDelay() {
		return this.maxCommDelay;
	}

	public void setMaxCommDelay(Integer maxCommDelay) {
		this.maxCommDelay = maxCommDelay;
	}

	@Column(name = "IS_IN_USE")
	public Short getIsInUse() {
		return this.isInUse;
	}

	public void setIsInUse(Short isInUse) {
		this.isInUse = isInUse;
	}

	@Column(name = "SERVICE_ID")
	public Long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	@Column(name = "PRI")
	public Long getPri() {
		return this.pri;
	}

	public void setPri(Long pri) {
		this.pri = pri;
	}

	@Column(name = "LAST_SUCCESS_TIME_TAG", length = 19)
	public Timestamp getLastSuccessTimeTag() {
		return lastSuccessTimeTag;
	}

	public void setLastSuccessTimeTag(Timestamp lastSuccessTimeTag) {
		this.lastSuccessTimeTag = lastSuccessTimeTag;
	}

}