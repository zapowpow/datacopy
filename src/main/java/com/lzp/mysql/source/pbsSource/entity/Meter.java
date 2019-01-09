package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * Meter entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "meter")
public class Meter{

	private Long meterId;
	private String meterName;
	private Long meterTypeId;
	private Long facId;
	private Long devId;
	private Integer meterSerial;
	private Long terminalId;
	private Integer meterNo;
	private Integer meterAddr;
	private Long manufactureDate;
	private Long manufactureId;
	private Long emid;
	private Long status;
	private Double ct1;
	private Double pt1;
	private Double ct2;
	private Double pt2;
	private Long paramValidTime;
	private Long eventSampleTime;
	private Long dataValidTime;
	private Integer failLimit;
	private Long processTimeTag;
	private Long statisTimeTag;
	private Long statisTimeTagBak;
	private Long baseTimeTag;
	private Long addTimeTag;
	private Long dayBaseTimeTag;
	private Long phaseBaseTimeTag;
	private Long dayNeedTimeTag;
	private Long phaseNeedTimeTag;
	private Long monthNeedTimeTag;
	private Long monthPhaseNeedTimeTag;
	private Long replaceTimeTag;
	private Integer isSend1;
	private Integer isSend2;
	private String otherKey1;
	private String otherKey2;
	private Long sendTimeTag1;
	private Long sendTimeTag2;
	private String notes;
	private Long ycTimeTag;
	private Long ipTimeTag;
	private Long ipBaseTimeTag;
	private Double addBaseRator;
	private String sampleAlias;
	private Long exchangeDataType;
	private Short isInUse;
	private Long inUseTime;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "METER_ID", unique = true, nullable = false, precision = 20)
	public Long getMeterId() {
		return this.meterId;
	}

	public void setMeterId(Long meterId) {
		this.meterId = meterId;
	}

	@Column(name = "FAC_ID")
	public Long getFacId() {
		return facId;
	}

	public void setFacId(Long facId) {
		this.facId = facId;
	}

	@Column(name = "METER_TYPE_ID")
	public Long getMeterTypeId() {
		return this.meterTypeId;
	}

	public void setMeterTypeId(Long meterTypeId) {
		this.meterTypeId = meterTypeId;
	}

	@Column(name = "METER_NAME", nullable = false, length = 64)
	public String getMeterName() {
		return this.meterName;
	}

	public void setMeterName(String meterName) {
		this.meterName = meterName;
	}

	@Column(name = "DEV_ID", nullable = false, precision = 20)
	public Long getDevId() {
		return this.devId;
	}

	public void setDevId(Long devId) {
		this.devId = devId;
	}

	@Column(name = "METER_SERIAL", precision = 10)
	public Integer getMeterSerial() {
		return this.meterSerial;
	}

	public void setMeterSerial(Integer meterSerial) {
		this.meterSerial = meterSerial;
	}

	@Column(name = "TERMINAL_ID", precision = 20)
	public Long getTerminalId() {
		return this.terminalId;
	}

	public void setTerminalId(Long terminalId) {
		this.terminalId = terminalId;
	}

	@Column(name = "METER_NO", nullable = false, precision = 10)
	public Integer getMeterNo() {
		return this.meterNo;
	}

	public void setMeterNo(Integer meterNo) {
		this.meterNo = meterNo;
	}

	@Column(name = "METER_ADDR", precision = 10)
	public Integer getMeterAddr() {
		return this.meterAddr;
	}

	public void setMeterAddr(Integer meterAddr) {
		this.meterAddr = meterAddr;
	}

	@Column(name = "MANUFACTURE_DATE", precision = 20)
	public Long getManufactureDate() {
		return this.manufactureDate;
	}

	public void setManufactureDate(Long manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Column(name = "MANUFACTURE_ID", precision = 20)
	public Long getManufactureId() {
		return this.manufactureId;
	}

	public void setManufactureId(Long manufactureId) {
		this.manufactureId = manufactureId;
	}

	@Column(name = "EMID", precision = 20)
	public Long getEmid() {
		return this.emid;
	}

	public void setEmid(Long emid) {
		this.emid = emid;
	}

	@Column(name = "STATUS", precision = 20)
	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	@Column(name = "CT1", precision = 20, scale = 5)
	public Double getCt1() {
		return this.ct1;
	}

	public void setCt1(Double ct1) {
		this.ct1 = ct1;
	}

	@Column(name = "PT1", precision = 20, scale = 5)
	public Double getPt1() {
		return this.pt1;
	}

	public void setPt1(Double pt1) {
		this.pt1 = pt1;
	}

	@Column(name = "CT2", precision = 20, scale = 5)
	public Double getCt2() {
		return this.ct2;
	}

	public void setCt2(Double ct2) {
		this.ct2 = ct2;
	}

	@Column(name = "PT2", precision = 20, scale = 5)
	public Double getPt2() {
		return this.pt2;
	}

	public void setPt2(Double pt2) {
		this.pt2 = pt2;
	}

	@Column(name = "PARAM_VALID_TIME", precision = 20)
	public Long getParamValidTime() {
		return this.paramValidTime;
	}

	public void setParamValidTime(Long paramValidTime) {
		this.paramValidTime = paramValidTime;
	}

	@Column(name = "EVENT_SAMPLE_TIME", precision = 20)
	public Long getEventSampleTime() {
		return this.eventSampleTime;
	}

	public void setEventSampleTime(Long eventSampleTime) {
		this.eventSampleTime = eventSampleTime;
	}

	@Column(name = "DATA_VALID_TIME", precision = 20)
	public Long getDataValidTime() {
		return this.dataValidTime;
	}

	public void setDataValidTime(Long dataValidTime) {
		this.dataValidTime = dataValidTime;
	}

	@Column(name = "FAIL_LIMIT", precision = 10)
	public Integer getFailLimit() {
		return this.failLimit;
	}

	public void setFailLimit(Integer failLimit) {
		this.failLimit = failLimit;
	}

	@Column(name = "PROCESS_TIME_TAG", precision = 20)
	public Long getProcessTimeTag() {
		return this.processTimeTag;
	}

	public void setProcessTimeTag(Long processTimeTag) {
		this.processTimeTag = processTimeTag;
	}

	@Column(name = "STATIS_TIME_TAG", precision = 20)
	public Long getStatisTimeTag() {
		return this.statisTimeTag;
	}

	public void setStatisTimeTag(Long statisTimeTag) {
		this.statisTimeTag = statisTimeTag;
	}

	@Column(name = "STATIS_TIME_TAG_BAK", precision = 20)
	public Long getStatisTimeTagBak() {
		return this.statisTimeTagBak;
	}

	public void setStatisTimeTagBak(Long statisTimeTagBak) {
		this.statisTimeTagBak = statisTimeTagBak;
	}

	@Column(name = "BASE_TIME_TAG", precision = 20)
	public Long getBaseTimeTag() {
		return this.baseTimeTag;
	}

	public void setBaseTimeTag(Long baseTimeTag) {
		this.baseTimeTag = baseTimeTag;
	}

	@Column(name = "ADD_TIME_TAG", precision = 20)
	public Long getAddTimeTag() {
		return this.addTimeTag;
	}

	public void setAddTimeTag(Long addTimeTag) {
		this.addTimeTag = addTimeTag;
	}

	@Column(name = "DAY_BASE_TIME_TAG", precision = 20)
	public Long getDayBaseTimeTag() {
		return this.dayBaseTimeTag;
	}

	public void setDayBaseTimeTag(Long dayBaseTimeTag) {
		this.dayBaseTimeTag = dayBaseTimeTag;
	}

	@Column(name = "PHASE_BASE_TIME_TAG", precision = 20)
	public Long getPhaseBaseTimeTag() {
		return this.phaseBaseTimeTag;
	}

	public void setPhaseBaseTimeTag(Long phaseBaseTimeTag) {
		this.phaseBaseTimeTag = phaseBaseTimeTag;
	}

	@Column(name = "DAY_NEED_TIME_TAG", precision = 20)
	public Long getDayNeedTimeTag() {
		return this.dayNeedTimeTag;
	}

	public void setDayNeedTimeTag(Long dayNeedTimeTag) {
		this.dayNeedTimeTag = dayNeedTimeTag;
	}

	@Column(name = "PHASE_NEED_TIME_TAG", precision = 20)
	public Long getPhaseNeedTimeTag() {
		return this.phaseNeedTimeTag;
	}

	public void setPhaseNeedTimeTag(Long phaseNeedTimeTag) {
		this.phaseNeedTimeTag = phaseNeedTimeTag;
	}

	@Column(name = "MONTH_NEED_TIME_TAG", precision = 20)
	public Long getMonthNeedTimeTag() {
		return this.monthNeedTimeTag;
	}

	public void setMonthNeedTimeTag(Long monthNeedTimeTag) {
		this.monthNeedTimeTag = monthNeedTimeTag;
	}

	@Column(name = "MONTH_PHASE_NEED_TIME_TAG", precision = 20)
	public Long getMonthPhaseNeedTimeTag() {
		return this.monthPhaseNeedTimeTag;
	}

	public void setMonthPhaseNeedTimeTag(Long monthPhaseNeedTimeTag) {
		this.monthPhaseNeedTimeTag = monthPhaseNeedTimeTag;
	}

	@Column(name = "REPLACE_TIME_TAG", precision = 20)
	public Long getReplaceTimeTag() {
		return this.replaceTimeTag;
	}

	public void setReplaceTimeTag(Long replaceTimeTag) {
		this.replaceTimeTag = replaceTimeTag;
	}

	@Column(name = "IS_SEND1", precision = 10)
	public Integer getIsSend1() {
		return this.isSend1;
	}

	public void setIsSend1(Integer isSend1) {
		this.isSend1 = isSend1;
	}

	@Column(name = "IS_SEND2", precision = 10)
	public Integer getIsSend2() {
		return this.isSend2;
	}

	public void setIsSend2(Integer isSend2) {
		this.isSend2 = isSend2;
	}

	@Column(name = "OTHER_KEY1", length = 32)
	public String getOtherKey1() {
		return this.otherKey1;
	}

	public void setOtherKey1(String otherKey1) {
		this.otherKey1 = otherKey1;
	}

	@Column(name = "OTHER_KEY2", length = 32)
	public String getOtherKey2() {
		return this.otherKey2;
	}

	public void setOtherKey2(String otherKey2) {
		this.otherKey2 = otherKey2;
	}

	@Column(name = "SEND_TIME_TAG1", precision = 20)
	public Long getSendTimeTag1() {
		return this.sendTimeTag1;
	}

	public void setSendTimeTag1(Long sendTimeTag1) {
		this.sendTimeTag1 = sendTimeTag1;
	}

	@Column(name = "SEND_TIME_TAG2", precision = 20)
	public Long getSendTimeTag2() {
		return this.sendTimeTag2;
	}

	public void setSendTimeTag2(Long sendTimeTag2) {
		this.sendTimeTag2 = sendTimeTag2;
	}

	@Column(name = "NOTES", length = 1024)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "YC_TIME_TAG", precision = 20)
	public Long getYcTimeTag() {
		return this.ycTimeTag;
	}

	public void setYcTimeTag(Long ycTimeTag) {
		this.ycTimeTag = ycTimeTag;
	}

	@Column(name = "IP_TIME_TAG", precision = 20)
	public Long getIpTimeTag() {
		return this.ipTimeTag;
	}

	public void setIpTimeTag(Long ipTimeTag) {
		this.ipTimeTag = ipTimeTag;
	}

	@Column(name = "IP_BASE_TIME_TAG", precision = 20)
	public Long getIpBaseTimeTag() {
		return this.ipBaseTimeTag;
	}

	public void setIpBaseTimeTag(Long ipBaseTimeTag) {
		this.ipBaseTimeTag = ipBaseTimeTag;
	}


	@Column(name = "ADD_BASE_RATOR", precision = 20, scale = 5)
	public Double getAddBaseRator() {
		return this.addBaseRator;
	}

	public void setAddBaseRator(Double addBaseRator) {
		this.addBaseRator = addBaseRator;
	}

	@Column(name = "SAMPLE_Alias", length = 32)
	public String getSampleAlias() {
		return this.sampleAlias;
	}

	public void setSampleAlias(String sampleAlias) {
		this.sampleAlias = sampleAlias;
	}

	@Column(name = "EXCHANGE_DATA_TYPE", precision = 10)
	public Long getExchangeDataType() {
		return this.exchangeDataType;
	}

	public void setExchangeDataType(Long exchangeDataType) {
		this.exchangeDataType = exchangeDataType;
	}

	@Column(name = "IS_IN_USE", precision = 3)
	public Short getIsInUse() {
		return this.isInUse;
	}

	public void setIsInUse(Short isInUse) {
		this.isInUse = isInUse;
	}

	@Column(name = "IN_USE_TIME", precision = 20)
	public Long getInUseTime() {
		return this.inUseTime;
	}

	public void setInUseTime(Long inUseTime) {
		this.inUseTime = inUseTime;
	}

}