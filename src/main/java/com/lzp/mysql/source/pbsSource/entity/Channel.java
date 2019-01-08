package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * Channel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "channel")
public class Channel{

	private Long channelId;
	private Long protocolId;
	private String channelName;
	private Long channelNo;
	private Long channelStatus;
	private Long channelType;
	private Long phoneNum;
	private String portParam;
	private String modemParam1;
	private String phoneCode1;
	private Long maxBaud1;
	private Long tryTimes1;
	private Long commParamId1;
	private String modemParam2;
	private String phoneCode2;
	private Long maxBaud2;
	private Long tryTimes2;
	private Long commParamId2;
	private String modemParam3;
	private String phoneCode3;
	private Long maxBaud3;
	private Long tryTimes3;
	private Long commParamId3;
	private Long netType;
	private Long ipAddrNum;
	private String ipAddress1;
	private Long ipPort1;
	private String ipAddress2;
	private Long ipPort2;
	private String ipAddress3;
	private Long ipPort3;
	private Long ddnPortNo;
	private String ddnParam;
	private Long commParamId;
	private String tsIpAddress1;
	private String tsIpAddress2;
	private Long devFailTimes;
	private Long failLimit;
	private Long tsId;
	private Long tsPortNo;
	private Long commTimeTag;
	private Long maxCommDelay;


	
	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CHANNEL_ID", unique = true, nullable = false, precision = 20)
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

	@Column(name = "CHANNEL_NO", nullable = false, precision = 20)
	public Long getChannelNo() {
		return this.channelNo;
	}

	public void setChannelNo(Long channelNo) {
		this.channelNo = channelNo;
	}

	@Column(name = "CHANNEL_STATUS", precision = 20)
	public Long getChannelStatus() {
		return this.channelStatus;
	}

	public void setChannelStatus(Long channelStatus) {
		this.channelStatus = channelStatus;
	}

	@Column(name = "CHANNEL_TYPE", precision = 10)
	public Long getChannelType() {
		return this.channelType;
	}

	public void setChannelType(Long channelType) {
		this.channelType = channelType;
	}

	@Column(name = "PHONE_NUM", precision = 10)
	public Long getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Column(name = "PORT_PARAM", length = 64)
	public String getPortParam() {
		return this.portParam;
	}

	public void setPortParam(String portParam) {
		this.portParam = portParam;
	}

	@Column(name = "MODEM_PARAM1", length = 64)
	public String getModemParam1() {
		return this.modemParam1;
	}

	public void setModemParam1(String modemParam1) {
		this.modemParam1 = modemParam1;
	}

	@Column(name = "PHONE_CODE1", length = 64)
	public String getPhoneCode1() {
		return this.phoneCode1;
	}

	public void setPhoneCode1(String phoneCode1) {
		this.phoneCode1 = phoneCode1;
	}

	@Column(name = "MAX_BAUD1", precision = 10)
	public Long getMaxBaud1() {
		return this.maxBaud1;
	}

	public void setMaxBaud1(Long maxBaud1) {
		this.maxBaud1 = maxBaud1;
	}

	@Column(name = "TRY_TIMES1", precision = 10)
	public Long getTryTimes1() {
		return this.tryTimes1;
	}

	public void setTryTimes1(Long tryTimes1) {
		this.tryTimes1 = tryTimes1;
	}

	@Column(name = "COMM_PARAM_ID1", precision = 20)
	public Long getCommParamId1() {
		return this.commParamId1;
	}

	public void setCommParamId1(Long commParamId1) {
		this.commParamId1 = commParamId1;
	}

	@Column(name = "MODEM_PARAM2", length = 64)
	public String getModemParam2() {
		return this.modemParam2;
	}

	public void setModemParam2(String modemParam2) {
		this.modemParam2 = modemParam2;
	}

	@Column(name = "PHONE_CODE2", length = 64)
	public String getPhoneCode2() {
		return this.phoneCode2;
	}

	public void setPhoneCode2(String phoneCode2) {
		this.phoneCode2 = phoneCode2;
	}

	@Column(name = "MAX_BAUD2", precision = 10)
	public Long getMaxBaud2() {
		return this.maxBaud2;
	}

	public void setMaxBaud2(Long maxBaud2) {
		this.maxBaud2 = maxBaud2;
	}

	@Column(name = "TRY_TIMES2", precision = 10)
	public Long getTryTimes2() {
		return this.tryTimes2;
	}

	public void setTryTimes2(Long tryTimes2) {
		this.tryTimes2 = tryTimes2;
	}

	@Column(name = "COMM_PARAM_ID2", precision = 20)
	public Long getCommParamId2() {
		return this.commParamId2;
	}

	public void setCommParamId2(Long commParamId2) {
		this.commParamId2 = commParamId2;
	}

	@Column(name = "MODEM_PARAM3", length = 64)
	public String getModemParam3() {
		return this.modemParam3;
	}

	public void setModemParam3(String modemParam3) {
		this.modemParam3 = modemParam3;
	}

	@Column(name = "PHONE_CODE3", length = 64)
	public String getPhoneCode3() {
		return this.phoneCode3;
	}

	public void setPhoneCode3(String phoneCode3) {
		this.phoneCode3 = phoneCode3;
	}

	@Column(name = "MAX_BAUD3", precision = 10)
	public Long getMaxBaud3() {
		return this.maxBaud3;
	}

	public void setMaxBaud3(Long maxBaud3) {
		this.maxBaud3 = maxBaud3;
	}

	@Column(name = "TRY_TIMES3", precision = 10)
	public Long getTryTimes3() {
		return this.tryTimes3;
	}

	public void setTryTimes3(Long tryTimes3) {
		this.tryTimes3 = tryTimes3;
	}

	@Column(name = "COMM_PARAM_ID3", precision = 20)
	public Long getCommParamId3() {
		return this.commParamId3;
	}

	public void setCommParamId3(Long commParamId3) {
		this.commParamId3 = commParamId3;
	}

	@Column(name = "NET_TYPE", precision = 10)
	public Long getNetType() {
		return this.netType;
	}

	public void setNetType(Long netType) {
		this.netType = netType;
	}

	@Column(name = "IP_ADDR_NUM", precision = 10)
	public Long getIpAddrNum() {
		return this.ipAddrNum;
	}

	public void setIpAddrNum(Long ipAddrNum) {
		this.ipAddrNum = ipAddrNum;
	}

	@Column(name = "IP_ADDRESS1", length = 20)
	public String getIpAddress1() {
		return this.ipAddress1;
	}

	public void setIpAddress1(String ipAddress1) {
		this.ipAddress1 = ipAddress1;
	}

	@Column(name = "IP_PORT1", precision = 10)
	public Long getIpPort1() {
		return this.ipPort1;
	}

	public void setIpPort1(Long ipPort1) {
		this.ipPort1 = ipPort1;
	}

	@Column(name = "IP_ADDRESS2", length = 20)
	public String getIpAddress2() {
		return this.ipAddress2;
	}

	public void setIpAddress2(String ipAddress2) {
		this.ipAddress2 = ipAddress2;
	}

	@Column(name = "IP_PORT2", precision = 10)
	public Long getIpPort2() {
		return this.ipPort2;
	}

	public void setIpPort2(Long ipPort2) {
		this.ipPort2 = ipPort2;
	}

	@Column(name = "IP_ADDRESS3", length = 20)
	public String getIpAddress3() {
		return this.ipAddress3;
	}

	public void setIpAddress3(String ipAddress3) {
		this.ipAddress3 = ipAddress3;
	}

	@Column(name = "IP_PORT3", precision = 10)
	public Long getIpPort3() {
		return this.ipPort3;
	}

	public void setIpPort3(Long ipPort3) {
		this.ipPort3 = ipPort3;
	}

	@Column(name = "DDN_PORT_NO", precision = 10)
	public Long getDdnPortNo() {
		return this.ddnPortNo;
	}

	public void setDdnPortNo(Long ddnPortNo) {
		this.ddnPortNo = ddnPortNo;
	}

	@Column(name = "DDN_PARAM", length = 64)
	public String getDdnParam() {
		return this.ddnParam;
	}

	public void setDdnParam(String ddnParam) {
		this.ddnParam = ddnParam;
	}

	@Column(name = "COMM_PARAM_ID", precision = 20)
	public Long getCommParamId() {
		return this.commParamId;
	}

	public void setCommParamId(Long commParamId) {
		this.commParamId = commParamId;
	}

	@Column(name = "TS_IP_ADDRESS1", length = 20)
	public String getTsIpAddress1() {
		return this.tsIpAddress1;
	}

	public void setTsIpAddress1(String tsIpAddress1) {
		this.tsIpAddress1 = tsIpAddress1;
	}

	@Column(name = "TS_IP_ADDRESS2", length = 20)
	public String getTsIpAddress2() {
		return this.tsIpAddress2;
	}

	public void setTsIpAddress2(String tsIpAddress2) {
		this.tsIpAddress2 = tsIpAddress2;
	}

	@Column(name = "DEV_FAIL_TIMES", precision = 10)
	public Long getDevFailTimes() {
		return this.devFailTimes;
	}

	public void setDevFailTimes(Long devFailTimes) {
		this.devFailTimes = devFailTimes;
	}

	@Column(name = "FAIL_LIMIT", precision = 10)
	public Long getFailLimit() {
		return this.failLimit;
	}

	public void setFailLimit(Long failLimit) {
		this.failLimit = failLimit;
	}

	@Column(name = "TS_ID", precision = 20)
	public Long getTsId() {
		return this.tsId;
	}

	public void setTsId(Long tsId) {
		this.tsId = tsId;
	}

	@Column(name = "TS_PORT_NO", precision = 10)
	public Long getTsPortNo() {
		return this.tsPortNo;
	}

	public void setTsPortNo(Long tsPortNo) {
		this.tsPortNo = tsPortNo;
	}

	@Column(name = "COMM_TIME_TAG", precision = 20)
	public Long getCommTimeTag() {
		return this.commTimeTag;
	}

	public void setCommTimeTag(Long commTimeTag) {
		this.commTimeTag = commTimeTag;
	}

	@Column(name = "MAX_COMM_DELAY", precision = 10)
	public Long getMaxCommDelay() {
		return this.maxCommDelay;
	}

	public void setMaxCommDelay(Long maxCommDelay) {
		this.maxCommDelay = maxCommDelay;
	}
}