package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * ChannelGroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "channel_group")
public class ChannelGroup{

	private Long channelGroupId;
	private String channelGroupName;
	private Long channelConfig;
	private Long channelId1;
	private Long pri1;
	private Long channelId2;
	private Long pri2;
	private Long channelId3;
	private Long pri3;
	private Long terminalId;

	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CHANNEL_GROUP_ID", unique = true, nullable = false, precision = 20)
	public Long getChannelGroupId() {
		return this.channelGroupId;
	}

	public void setChannelGroupId(Long channelGroupId) {
		this.channelGroupId = channelGroupId;
	}

	@Column(name = "CHANNEL_GROUP_NAME", nullable = false, length = 64)
	public String getChannelGroupName() {
		return this.channelGroupName;
	}

	public void setChannelGroupName(String channelGroupName) {
		this.channelGroupName = channelGroupName;
	}

	@Column(name = "CHANNEL_CONFIG", precision = 10)
	public Long getChannelConfig() {
		return this.channelConfig;
	}

	public void setChannelConfig(Long channelConfig) {
		this.channelConfig = channelConfig;
	}

	@Column(name = "CHANNEL_ID1", precision = 20)
	public Long getChannelId1() {
		return this.channelId1;
	}

	public void setChannelId1(Long channelId1) {
		this.channelId1 = channelId1;
	}

	@Column(name = "PRI1", precision = 10)
	public Long getPri1() {
		return this.pri1;
	}

	public void setPri1(Long pri1) {
		this.pri1 = pri1;
	}

	@Column(name = "CHANNEL_ID2", precision = 20)
	public Long getChannelId2() {
		return this.channelId2;
	}

	public void setChannelId2(Long channelId2) {
		this.channelId2 = channelId2;
	}

	@Column(name = "PRI2", precision = 10)
	public Long getPri2() {
		return this.pri2;
	}

	public void setPri2(Long pri2) {
		this.pri2 = pri2;
	}

	@Column(name = "CHANNEL_ID3", precision = 20)
	public Long getChannelId3() {
		return this.channelId3;
	}

	public void setChannelId3(Long channelId3) {
		this.channelId3 = channelId3;
	}

	@Column(name = "PRI3", precision = 10)
	public Long getPri3() {
		return this.pri3;
	}

	public void setPri3(Long pri3) {
		this.pri3 = pri3;
	}

	@Column(name = "TERMINAL_ID", precision = 20)
	public Long getTerminalId() {
		return this.terminalId;
	}

	public void setTerminalId(Long terminalId) {
		this.terminalId = terminalId;
	}
	

}