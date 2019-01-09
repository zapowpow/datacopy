package com.lzp.mysql.source.tmrSource.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lzp.mysql.source.unit.DateTimeSerializer;
import com.lzp.mysql.source.unit.TimestampDeserializer;
@Entity
@Table(name = "networks")
public class Networks{
	private Long channelId;
	private Long protocolId;
	private String channelName;
	private Long acquiredId;
	private Long status;
	private String ipAddress;
	private Integer ipPort;
	private Short connectMode;
	private String param;
	private Integer tryTimes;
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp commTimeTag;
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

	@Column(name = "ACQUIRED_ID")
	public Long getAcquiredId() {
		return this.acquiredId;
	}

	public void setAcquiredId(Long acquiredId) {
		this.acquiredId = acquiredId;
	}

	@Column(name = "STATUS")
	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	@Column(name = "IP_ADDRESS", length = 20)
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Column(name = "IP_PORT")
	public Integer getIpPort() {
		return this.ipPort;
	}

	public void setIpPort(Integer ipPort) {
		this.ipPort = ipPort;
	}

	@Column(name = "CONNECT_MODE")
	public Short getConnectMode() {
		return this.connectMode;
	}

	public void setConnectMode(Short connectMode) {
		this.connectMode = connectMode;
	}

	/**
	 * @return the param
	 */
	@Column(name = "PARAM", length = 128)
	public String getParam() {
		return param;
	}

	/**
	 * @param param
	 *            the param to set
	 */
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
		return this.commTimeTag;
	}

	public void setCommTimeTag(Timestamp commTimeTag) {
		this.commTimeTag = commTimeTag;
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