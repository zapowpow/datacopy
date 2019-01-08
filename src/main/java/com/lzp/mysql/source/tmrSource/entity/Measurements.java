package com.lzp.mysql.source.tmrSource.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lzp.mysql.source.unit.DateTimeSerializer;
import com.lzp.mysql.source.unit.TimestampDeserializer;
/**
 * Measurements entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "measurements")
public class Measurements{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MEAS_ID", unique = true, nullable = false)
	private Long measId;
	@Column(name = "MEAS_NAME", nullable = false, length = 64)
	private String measName;
	@Column(name = "ALTmr_NAME", length = 64)
	private String alTmrName;
	@Column(name = "DEV_ID", nullable = false)
	private Long devId;
	@Column(name = "DEV_TYPE", nullable = false)
	private Short devType;
	@Column(name = "GATEWAY_ID")
	private Long gatewayId;
	@Column(name = "TARIFF_ID", nullable = false)
	private Long tariffId;
	@Column(name = "INTEGRATION_PERIOD")
	private Integer integrationPeriod;
	@Column(name = "IS_IN_USE")
	private Short isInUse;
	@Column(name = "STATIS_TYPE")
	private Short statisType;
	@Column(name = "STATIS_MODE")
	private Short statisMode;
	@Column(name = "PRICE_METHOD")
	private Short priceMethod;
	@Column(name = "IS_COMPUTE_PRICE")
	private Short isComputePrice;
	@Column(name = "MAIN_VICE_RATOR", precision = 22, scale = 0)
	private Double mainViceRator;
	@Column(name = "IS_MV_VALID")
	private Short isMvValid;
	@Column(name = "MV_VALID_INTERVAL")
	private Long mvValidInterval;
	@Column(name = "MV_VALID_TIME_TAG", length = 19)
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp mvValidTimeTag;
	@Column(name = "PLD_TIME_TAG", length = 19)
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp pldTimeTag;
	@Column(name = "IS_IN_COMPUTE_BALANCE")
	private Short isInComputeBalance;
	@Column(name = "VLLE_ID", nullable = false)
	private Long vlleId;
	@Column(name = "CLASS1_TIME_TAG", length = 19)
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class1TimeTag;
	@Column(name = "CLASS2_TIME_TAG", length = 19)
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class2TimeTag;
	@Column(name = "CLASS3_TIME_TAG", length = 19)
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class3TimeTag;
	@Column(name = "CLASS4_TIME_TAG", length = 19)
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class4TimeTag;
	@Column(name = "CLASS5_TIME_TAG", length = 19)
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class5TimeTag;
	@Column(name = "REPLACE_METHOD")
	private Integer replaceMethod;
	@Column(name = "BYPATH", nullable = false)
	private Short bypath;
	@Column(name = "SETTLE_DAY")
	private Integer settleDay;

	@Transient
	private Set<Meters> meters;


	public Long getMeasId() {
		return this.measId;
	}
	public void setMeasId(Long measId) {
		this.measId = measId;
	}


	public String getMeasName() {
		return this.measName;
	}
	public void setMeasName(String measName) {
		this.measName = measName;
	}

	public String getAlTmrName() {
		return this.alTmrName;
	}
	public void setAlTmrName(String alTmrName) {
		this.alTmrName = alTmrName;
	}

	public Long getDevId() {
		return this.devId;
	}
	public void setDevId(Long devId) {
		this.devId = devId;
	}

	public Short getDevType() {
		return this.devType;
	}
	public void setDevType(Short devType) {
		this.devType = devType;
	}

	public Long getGatewayId() {
		return this.gatewayId;
	}
	public void setGatewayId(Long gatewayId) {
		this.gatewayId = gatewayId;
	}

	public Long getTariffId() {
		return this.tariffId;
	}
	public void setTariffId(Long tariffId) {
		this.tariffId = tariffId;
	}

	public Integer getIntegrationPeriod() {
		return this.integrationPeriod;
	}
	public void setIntegrationPeriod(Integer integrationPeriod) {
		this.integrationPeriod = integrationPeriod;
	}

	public Short getIsInUse() {
		return this.isInUse;
	}
	public void setIsInUse(Short isInUse) {
		this.isInUse = isInUse;
	}

	public Short getStatisType() {
		return this.statisType;
	}
	public void setStatisType(Short statisType) {
		this.statisType = statisType;
	}

	public Short getStatisMode() {
		return this.statisMode;
	}
	public void setStatisMode(Short statisMode) {
		this.statisMode = statisMode;
	}

	public Short getPriceMethod() {
		return this.priceMethod;
	}
	public void setPriceMethod(Short priceMethod) {
		this.priceMethod = priceMethod;
	}

	public Short getIsComputePrice() {
		return this.isComputePrice;
	}
	public void setIsComputePrice(Short isComputePrice) {
		this.isComputePrice = isComputePrice;
	}

	public Double getMainViceRator() {
		return this.mainViceRator;
	}
	public void setMainViceRator(Double mainViceRator) {
		this.mainViceRator = mainViceRator;
	}

	public Short getIsMvValid() {
		return this.isMvValid;
	}
	public void setIsMvValid(Short isMvValid) {
		this.isMvValid = isMvValid;
	}

	public Long getMvValidInterval() {
		return this.mvValidInterval;
	}
	public void setMvValidInterval(Long mvValidInterval) {
		this.mvValidInterval = mvValidInterval;
	}

	public Timestamp getMvValidTimeTag() {
		return this.mvValidTimeTag;
	}

	public void setMvValidTimeTag(Timestamp mvValidTimeTag) {
		this.mvValidTimeTag = mvValidTimeTag;
	}

	public Timestamp getPldTimeTag() {
		return this.pldTimeTag;
	}
	public void setPldTimeTag(Timestamp pldTimeTag) {
		this.pldTimeTag = pldTimeTag;
	}

	public Short getIsInComputeBalance() {
		return this.isInComputeBalance;
	}
	public void setIsInComputeBalance(Short isInComputeBalance) {
		this.isInComputeBalance = isInComputeBalance;
	}

	public Long getVlleId() {
		return this.vlleId;
	}
	public void setVlleId(Long vlleId) {
		this.vlleId = vlleId;
	}

	public Timestamp getClass1TimeTag() {
		return this.class1TimeTag;
	}
	public void setClass1TimeTag(Timestamp class1TimeTag) {
		this.class1TimeTag = class1TimeTag;
	}

	public Timestamp getClass2TimeTag() {
		return this.class2TimeTag;
	}
	public void setClass2TimeTag(Timestamp class2TimeTag) {
		this.class2TimeTag = class2TimeTag;
	}

	public Timestamp getClass3TimeTag() {
		return this.class3TimeTag;
	}
	public void setClass3TimeTag(Timestamp class3TimeTag) {
		this.class3TimeTag = class3TimeTag;
	}

	public Timestamp getClass4TimeTag() {
		return this.class4TimeTag;
	}
	public void setClass4TimeTag(Timestamp class4TimeTag) {
		this.class4TimeTag = class4TimeTag;
	}

	public Timestamp getClass5TimeTag() {
		return this.class5TimeTag;
	}
	public void setClass5TimeTag(Timestamp class5TimeTag) {
		this.class5TimeTag = class5TimeTag;
	}

	public Integer getReplaceMethod() {
		return this.replaceMethod;
	}
	public void setReplaceMethod(Integer replaceMethod) {
		this.replaceMethod = replaceMethod;
	}

	public Short getBypath() {
		return this.bypath;
	}
	public void setBypath(Short bypath) {
		this.bypath = bypath;
	}

	public Integer getSettleDay() {
		return this.settleDay;
	}
	public void setSettleDay(Integer settleDay) {
		this.settleDay = settleDay;
	}


	public Set<Meters> getMeters() {
		return meters;
	}
	public void setMeters(Set<Meters> meters) {
		this.meters = meters;
	}

}