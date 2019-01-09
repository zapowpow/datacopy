package com.lzp.mysql.source.tmrSource.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lzp.mysql.source.unit.DateTimeSerializer;
import com.lzp.mysql.source.unit.TimestampDeserializer;
@Entity
@Table(name = "meters")
public class Meters {
    private Long meterId;
    private String meterName;
    private String meterAlias;
    private Long measId;
    private Short meterSerial;
    private Integer meterNo;
    private Long acquiredId;
    private String meterAddr;
    private String userName;
    private String password;
    private Long manufactureId;
    private Long modelId;
    private Date manufactureDate;
    private Short isInUse;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp inUseTime;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class1TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class2TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class3TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class4TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class5TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class6TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class7TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class8TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class9TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class10TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class11TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class12TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class13TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class14TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class15TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class16TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class17TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class18TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class19TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class20TimeTag;
    private Long status;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp lastCycleTime;
    private Long cyclePeriod;
    private Long consumerId;
    private String segmentNo;
    private Double limit1;
    private Double limit2;
    private Double limit3;
    private Double limit4;
    private Double limit5;
    private Double limit6;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp lastStatisEnergyTime;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp lastStatisTariffTime;
    private Long statisPeriod;
    private Double ct1;
    private Double ct2;
    private Double pt1;
    private Double pt2;
    private Integer integrationPeriod1;
    private Integer integrationPeriod2;
    private Integer integrationPeriod3;
    private Integer integrationPeriod4;
    private Integer integrationPeriod5;
    private Integer integrationPeriod6;
    private Double precision1;
    private Double precision2;
    private Double precision3;
    private Double precision4;
    private Double precision5;
    private Double precision6;
    private Integer handleMethod;
    private Long pulseConst;
    private Double pulseFact;
    private Long protocolId;
    private Integer timeUpLimit;
    private Integer timeDownLimit;
    private Long record1;
    private Long record2;
    private Long record3;
    private Long record4;
    private Long record5;
    private Long record6;
    private Long record7;
    private Long record8;
    private Long record9;
    private Long record10;
    private String isReverse;
    private String energyPrecision;
    private Short isSmoothValidate;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp smoothValidateTimeTag;
    private Double smoothValidateRatio;
    private Long smoothValidateInterval;
    private Double smoothValidateFactor;
    private Short isLostValidate;
    private Integer lostValidateType;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp lostValidateTimeTag;
    private Short isPowerValidate;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp powerValidateTimeTag;
    private Double powerValidateRatio;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class1DummyTimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class2DummyTimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class3DummyTimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class4DummyTimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class5DummyTimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class6DummyTimeTag;
    private Long meterConfigId;


    @Id
    @Column(name = "METER_ID", unique = true, nullable = false)
    public Long getMeterId() {
        return this.meterId;
    }

    public void setMeterId(Long meterId) {
        this.meterId = meterId;
    }

    @Column(name = "METER_NAME", nullable = false, length = 64)
    public String getMeterName() {
        return this.meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName;
    }

    @Column(name = "METER_ALIAS", length = 64)
    public String getMeterAlias() {
        return this.meterAlias;
    }

    public void setMeterAlias(String meterAlias) {
        this.meterAlias = meterAlias;
    }

    @Column(name = "MEAS_ID")
    public Long getMeasId() {
        return this.measId;
    }

    public void setMeasId(Long measId) {
        this.measId = measId;
    }

    @Column(name = "METER_SERIAL", nullable = false)
    public Short getMeterSerial() {
        return this.meterSerial;
    }

    public void setMeterSerial(Short meterSerial) {
        this.meterSerial = meterSerial;
    }

    @Column(name = "METER_NO", nullable = false)
    public Integer getMeterNo() {
        return this.meterNo;
    }

    public void setMeterNo(Integer meterNo) {
        this.meterNo = meterNo;
    }

    @Column(name = "ACQUIRED_ID")
    public Long getAcquiredId() {
        return this.acquiredId;
    }

    public void setAcquiredId(Long acquiredId) {
        this.acquiredId = acquiredId;
    }

    @Column(name = "METER_ADDR", length = 32)
    public String getMeterAddr() {
        return this.meterAddr;
    }

    public void setMeterAddr(String meterAddr) {
        this.meterAddr = meterAddr;
    }

    @Column(name = "USER_NAME", length = 32)
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "PASSWORD", length = 32)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "MANUFACTURE_ID")
    public Long getManufactureId() {
        return this.manufactureId;
    }

    public void setManufactureId(Long manufactureId) {
        this.manufactureId = manufactureId;
    }

    @Column(name = "MODEL_ID")
    public Long getModelId() {
        return this.modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "MANUFACTURE_DATE", length = 10)
    public Date getManufactureDate() {
        return this.manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Column(name = "IS_IN_USE")
    public Short getIsInUse() {
        return this.isInUse;
    }

    public void setIsInUse(Short isInUse) {
        this.isInUse = isInUse;
    }

    @Column(name = "IN_USE_TIME", length = 19)
    public Timestamp getInUseTime() {
        return this.inUseTime;
    }

    public void setInUseTime(Timestamp inUseTime) {
        this.inUseTime = inUseTime;
    }

    @Column(name = "CLASS1_TIME_TAG", length = 19)
    public Timestamp getClass1TimeTag() {
        return this.class1TimeTag;
    }

    public void setClass1TimeTag(Timestamp class1TimeTag) {
        this.class1TimeTag = class1TimeTag;
    }

    @Column(name = "CLASS2_TIME_TAG", length = 19)
    public Timestamp getClass2TimeTag() {
        return this.class2TimeTag;
    }

    public void setClass2TimeTag(Timestamp class2TimeTag) {
        this.class2TimeTag = class2TimeTag;
    }

    @Column(name = "CLASS3_TIME_TAG", length = 19)
    public Timestamp getClass3TimeTag() {
        return this.class3TimeTag;
    }

    public void setClass3TimeTag(Timestamp class3TimeTag) {
        this.class3TimeTag = class3TimeTag;
    }

    @Column(name = "CLASS4_TIME_TAG", length = 19)
    public Timestamp getClass4TimeTag() {
        return this.class4TimeTag;
    }

    public void setClass4TimeTag(Timestamp class4TimeTag) {
        this.class4TimeTag = class4TimeTag;
    }

    @Column(name = "CLASS5_TIME_TAG", length = 19)
    public Timestamp getClass5TimeTag() {
        return this.class5TimeTag;
    }

    public void setClass5TimeTag(Timestamp class5TimeTag) {
        this.class5TimeTag = class5TimeTag;
    }

    @Column(name = "CLASS6_TIME_TAG", length = 19)
    public Timestamp getClass6TimeTag() {
        return this.class6TimeTag;
    }

    public void setClass6TimeTag(Timestamp class6TimeTag) {
        this.class6TimeTag = class6TimeTag;
    }

    @Column(name = "CLASS7_TIME_TAG", length = 19)
    public Timestamp getClass7TimeTag() {
        return this.class7TimeTag;
    }

    public void setClass7TimeTag(Timestamp class7TimeTag) {
        this.class7TimeTag = class7TimeTag;
    }

    @Column(name = "CLASS8_TIME_TAG", length = 19)
    public Timestamp getClass8TimeTag() {
        return this.class8TimeTag;
    }

    public void setClass8TimeTag(Timestamp class8TimeTag) {
        this.class8TimeTag = class8TimeTag;
    }

    @Column(name = "CLASS9_TIME_TAG", length = 19)
    public Timestamp getClass9TimeTag() {
        return this.class9TimeTag;
    }

    public void setClass9TimeTag(Timestamp class9TimeTag) {
        this.class9TimeTag = class9TimeTag;
    }

    @Column(name = "CLASS10_TIME_TAG", length = 19)
    public Timestamp getClass10TimeTag() {
        return this.class10TimeTag;
    }

    public void setClass10TimeTag(Timestamp class10TimeTag) {
        this.class10TimeTag = class10TimeTag;
    }

    @Column(
            name = "CLASS11_TIME_TAG",
            length = 19
    )
    public Timestamp getClass11TimeTag() {
        return this.class11TimeTag;
    }

    public void setClass11TimeTag(Timestamp class11TimeTag) {
        this.class11TimeTag = class11TimeTag;
    }

    @Column(
            name = "CLASS12_TIME_TAG",
            length = 19
    )
    public Timestamp getClass12TimeTag() {
        return this.class12TimeTag;
    }

    public void setClass12TimeTag(Timestamp class12TimeTag) {
        this.class12TimeTag = class12TimeTag;
    }

    @Column(
            name = "CLASS13_TIME_TAG",
            length = 19
    )
    public Timestamp getClass13TimeTag() {
        return this.class13TimeTag;
    }

    public void setClass13TimeTag(Timestamp class13TimeTag) {
        this.class13TimeTag = class13TimeTag;
    }

    @Column(
            name = "CLASS14_TIME_TAG",
            length = 19
    )
    public Timestamp getClass14TimeTag() {
        return this.class14TimeTag;
    }

    public void setClass14TimeTag(Timestamp class14TimeTag) {
        this.class14TimeTag = class14TimeTag;
    }

    @Column(
            name = "CLASS15_TIME_TAG",
            length = 19
    )
    public Timestamp getClass15TimeTag() {
        return this.class15TimeTag;
    }

    public void setClass15TimeTag(Timestamp class15TimeTag) {
        this.class15TimeTag = class15TimeTag;
    }

    @Column(
            name = "CLASS16_TIME_TAG",
            length = 19
    )
    public Timestamp getClass16TimeTag() {
        return this.class16TimeTag;
    }

    public void setClass16TimeTag(Timestamp class16TimeTag) {
        this.class16TimeTag = class16TimeTag;
    }

    @Column(
            name = "CLASS17_TIME_TAG",
            length = 19
    )
    public Timestamp getClass17TimeTag() {
        return this.class17TimeTag;
    }

    public void setClass17TimeTag(Timestamp class17TimeTag) {
        this.class17TimeTag = class17TimeTag;
    }

    @Column(
            name = "CLASS18_TIME_TAG",
            length = 19
    )
    public Timestamp getClass18TimeTag() {
        return this.class18TimeTag;
    }

    public void setClass18TimeTag(Timestamp class18TimeTag) {
        this.class18TimeTag = class18TimeTag;
    }

    @Column(
            name = "CLASS19_TIME_TAG",
            length = 19
    )
    public Timestamp getClass19TimeTag() {
        return this.class19TimeTag;
    }

    public void setClass19TimeTag(Timestamp class19TimeTag) {
        this.class19TimeTag = class19TimeTag;
    }

    @Column(
            name = "CLASS20_TIME_TAG",
            length = 19
    )
    public Timestamp getClass20TimeTag() {
        return this.class20TimeTag;
    }

    public void setClass20TimeTag(Timestamp class20TimeTag) {
        this.class20TimeTag = class20TimeTag;
    }

    @Column(
            name = "STATUS"
    )
    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Column(
            name = "LAST_CYCLE_TIME",
            length = 19
    )
    public Timestamp getLastCycleTime() {
        return this.lastCycleTime;
    }

    public void setLastCycleTime(Timestamp lastCycleTime) {
        this.lastCycleTime = lastCycleTime;
    }

    @Column(
            name = "CYCLE_PERIOD"
    )
    public Long getCyclePeriod() {
        return this.cyclePeriod;
    }

    public void setCyclePeriod(Long cyclePeriod) {
        this.cyclePeriod = cyclePeriod;
    }

    @Column(
            name = "CONSUMER_ID"
    )
    public Long getConsumerId() {
        return this.consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }

    @Column(
            name = "SEGMENT_NO",
            length = 32
    )
    public String getSegmentNo() {
        return this.segmentNo;
    }

    public void setSegmentNo(String segmentNo) {
        this.segmentNo = segmentNo;
    }

    @Column(
            name = "LIMIT1",
            precision = 22,
            scale = 0
    )
    public Double getLimit1() {
        return this.limit1;
    }

    public void setLimit1(Double limit1) {
        this.limit1 = limit1;
    }

    @Column(
            name = "LIMIT2",
            precision = 22,
            scale = 0
    )
    public Double getLimit2() {
        return this.limit2;
    }

    public void setLimit2(Double limit2) {
        this.limit2 = limit2;
    }

    @Column(
            name = "LIMIT3",
            precision = 22,
            scale = 0
    )
    public Double getLimit3() {
        return this.limit3;
    }

    public void setLimit3(Double limit3) {
        this.limit3 = limit3;
    }

    @Column(
            name = "LIMIT4",
            precision = 22,
            scale = 0
    )
    public Double getLimit4() {
        return this.limit4;
    }

    public void setLimit4(Double limit4) {
        this.limit4 = limit4;
    }

    @Column(
            name = "LIMIT5",
            precision = 22,
            scale = 0
    )
    public Double getLimit5() {
        return this.limit5;
    }

    public void setLimit5(Double limit5) {
        this.limit5 = limit5;
    }

    @Column(
            name = "LIMIT6",
            precision = 22,
            scale = 0
    )
    public Double getLimit6() {
        return this.limit6;
    }

    public void setLimit6(Double limit6) {
        this.limit6 = limit6;
    }

    @Column(
            name = "LAST_STATIS_ENERGY_TIME",
            length = 19
    )
    public Timestamp getLastStatisEnergyTime() {
        return this.lastStatisEnergyTime;
    }

    public void setLastStatisEnergyTime(Timestamp lastStatisEnergyTime) {
        this.lastStatisEnergyTime = lastStatisEnergyTime;
    }

    @Column(
            name = "LAST_STATIS_TARIFF_TIME",
            length = 19
    )
    public Timestamp getLastStatisTariffTime() {
        return this.lastStatisTariffTime;
    }

    public void setLastStatisTariffTime(Timestamp lastStatisTariffTime) {
        this.lastStatisTariffTime = lastStatisTariffTime;
    }

    @Column(
            name = "STATIS_PERIOD"
    )
    public Long getStatisPeriod() {
        return this.statisPeriod;
    }

    public void setStatisPeriod(Long statisPeriod) {
        this.statisPeriod = statisPeriod;
    }

    @Column(
            name = "CT1"
    )
    public Double getCt1() {
        return this.ct1;
    }

    public void setCt1(Double ct1) {
        this.ct1 = ct1;
    }

    @Column(
            name = "CT2"
    )
    public Double getCt2() {
        return this.ct2;
    }

    public void setCt2(Double ct2) {
        this.ct2 = ct2;
    }

    @Column(
            name = "PT1"
    )
    public Double getPt1() {
        return this.pt1;
    }

    public void setPt1(Double pt1) {
        this.pt1 = pt1;
    }

    @Column(
            name = "PT2"
    )
    public Double getPt2() {
        return this.pt2;
    }

    public void setPt2(Double pt2) {
        this.pt2 = pt2;
    }

    @Column(
            name = "INTEGRATION_PERIOD1"
    )
    public Integer getIntegrationPeriod1() {
        return this.integrationPeriod1;
    }

    public void setIntegrationPeriod1(Integer integrationPeriod1) {
        this.integrationPeriod1 = integrationPeriod1;
    }

    @Column(
            name = "INTEGRATION_PERIOD2"
    )
    public Integer getIntegrationPeriod2() {
        return this.integrationPeriod2;
    }

    public void setIntegrationPeriod2(Integer integrationPeriod2) {
        this.integrationPeriod2 = integrationPeriod2;
    }

    @Column(
            name = "INTEGRATION_PERIOD3"
    )
    public Integer getIntegrationPeriod3() {
        return this.integrationPeriod3;
    }

    public void setIntegrationPeriod3(Integer integrationPeriod3) {
        this.integrationPeriod3 = integrationPeriod3;
    }

    @Column(
            name = "INTEGRATION_PERIOD4"
    )
    public Integer getIntegrationPeriod4() {
        return this.integrationPeriod4;
    }

    public void setIntegrationPeriod4(Integer integrationPeriod4) {
        this.integrationPeriod4 = integrationPeriod4;
    }

    @Column(
            name = "INTEGRATION_PERIOD5"
    )
    public Integer getIntegrationPeriod5() {
        return this.integrationPeriod5;
    }

    public void setIntegrationPeriod5(Integer integrationPeriod5) {
        this.integrationPeriod5 = integrationPeriod5;
    }

    @Column(
            name = "INTEGRATION_PERIOD6"
    )
    public Integer getIntegrationPeriod6() {
        return this.integrationPeriod6;
    }

    public void setIntegrationPeriod6(Integer integrationPeriod6) {
        this.integrationPeriod6 = integrationPeriod6;
    }

    @Column(
            name = "PRECISION1",
            precision = 22,
            scale = 0
    )
    public Double getPrecision1() {
        return this.precision1;
    }

    public void setPrecision1(Double precision1) {
        this.precision1 = precision1;
    }

    @Column(
            name = "PRECISION2",
            precision = 22,
            scale = 0
    )
    public Double getPrecision2() {
        return this.precision2;
    }

    public void setPrecision2(Double precision2) {
        this.precision2 = precision2;
    }

    @Column(
            name = "PRECISION3",
            precision = 22,
            scale = 0
    )
    public Double getPrecision3() {
        return this.precision3;
    }

    public void setPrecision3(Double precision3) {
        this.precision3 = precision3;
    }

    @Column(
            name = "PRECISION4",
            precision = 22,
            scale = 0
    )
    public Double getPrecision4() {
        return this.precision4;
    }

    public void setPrecision4(Double precision4) {
        this.precision4 = precision4;
    }

    @Column(
            name = "PRECISION5",
            precision = 22,
            scale = 0
    )
    public Double getPrecision5() {
        return this.precision5;
    }

    public void setPrecision5(Double precision5) {
        this.precision5 = precision5;
    }

    @Column(
            name = "PRECISION6",
            precision = 22,
            scale = 0
    )
    public Double getPrecision6() {
        return this.precision6;
    }

    public void setPrecision6(Double precision6) {
        this.precision6 = precision6;
    }

    @Column(
            name = "HANDLE_METHOD"
    )
    public Integer getHandleMethod() {
        return this.handleMethod;
    }

    public void setHandleMethod(Integer handleMethod) {
        this.handleMethod = handleMethod;
    }

    @Column(
            name = "PULSE_CONST"
    )
    public Long getPulseConst() {
        return this.pulseConst;
    }

    public void setPulseConst(Long pulseConst) {
        this.pulseConst = pulseConst;
    }

    @Column(
            name = "PULSE_FACT"
    )
    public Double getPulseFact() {
        return this.pulseFact;
    }

    public void setPulseFact(Double pulseFact) {
        this.pulseFact = pulseFact;
    }

    @Column(
            name = "PROTOCOL_ID"
    )
    public Long getProtocolId() {
        return this.protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    @Column(
            name = "TIME_UP_LIMIT"
    )
    public Integer getTimeUpLimit() {
        return this.timeUpLimit;
    }

    public void setTimeUpLimit(Integer timeUpLimit) {
        this.timeUpLimit = timeUpLimit;
    }

    @Column(
            name = "TIME_DOWN_LIMIT"
    )
    public Integer getTimeDownLimit() {
        return this.timeDownLimit;
    }

    public void setTimeDownLimit(Integer timeDownLimit) {
        this.timeDownLimit = timeDownLimit;
    }

    @Column(
            name = "RECORD1"
    )
    public Long getRecord1() {
        return this.record1;
    }

    public void setRecord1(Long record1) {
        this.record1 = record1;
    }

    @Column(
            name = "RECORD2"
    )
    public Long getRecord2() {
        return this.record2;
    }

    public void setRecord2(Long record2) {
        this.record2 = record2;
    }

    @Column(
            name = "RECORD3"
    )
    public Long getRecord3() {
        return this.record3;
    }

    public void setRecord3(Long record3) {
        this.record3 = record3;
    }

    @Column(
            name = "RECORD4"
    )
    public Long getRecord4() {
        return this.record4;
    }

    public void setRecord4(Long record4) {
        this.record4 = record4;
    }

    @Column(
            name = "RECORD5"
    )
    public Long getRecord5() {
        return this.record5;
    }

    public void setRecord5(Long record5) {
        this.record5 = record5;
    }

    @Column(
            name = "RECORD6"
    )
    public Long getRecord6() {
        return this.record6;
    }

    public void setRecord6(Long record6) {
        this.record6 = record6;
    }

    @Column(
            name = "IS_SMOOTH_VALIDATE"
    )
    public Short getIsSmoothValidate() {
        return this.isSmoothValidate;
    }

    public void setIsSmoothValidate(Short isSmoothValidate) {
        this.isSmoothValidate = isSmoothValidate;
    }

    @Column(
            name = "SMOOTH_VALIDATE_TIME_TAG"
    )
    public Timestamp getSmoothValidateTimeTag() {
        return this.smoothValidateTimeTag;
    }

    public void setSmoothValidateTimeTag(Timestamp smoothValidateTimeTag) {
        this.smoothValidateTimeTag = smoothValidateTimeTag;
    }

    @Column(
            name = "SMOOTH_VALIDATE_RATIO"
    )
    public Double getSmoothValidateRatio() {
        return this.smoothValidateRatio;
    }

    public void setSmoothValidateRatio(Double smoothValidateRatio) {
        this.smoothValidateRatio = smoothValidateRatio;
    }

    @Column(
            name = "SMOOTH_VALIDATE_INTERVAL"
    )
    public Long getSmoothValidateInterval() {
        return this.smoothValidateInterval;
    }

    public void setSmoothValidateInterval(Long smoothValidateInterval) {
        this.smoothValidateInterval = smoothValidateInterval;
    }

    @Column(
            name = "SMOOTH_VALIDATE_FACTOR"
    )
    public Double getSmoothValidateFactor() {
        return this.smoothValidateFactor;
    }

    public void setSmoothValidateFactor(Double smoothValidateFactor) {
        this.smoothValidateFactor = smoothValidateFactor;
    }

    @Column(
            name = "IS_LOST_VALIDATE"
    )
    public Short getIsLostValidate() {
        return this.isLostValidate;
    }

    public void setIsLostValidate(Short isLostValidate) {
        this.isLostValidate = isLostValidate;
    }

    @Column(
            name = "LOST_VALIDATE_TYPE"
    )
    public Integer getLostValidateType() {
        return this.lostValidateType;
    }

    public void setLostValidateType(Integer lostValidateType) {
        this.lostValidateType = lostValidateType;
    }

    @Column(
            name = "LOST_VALIDATE_TIME_TAG"
    )
    public Timestamp getLostValidateTimeTag() {
        return this.lostValidateTimeTag;
    }

    public void setLostValidateTimeTag(Timestamp lostValidateTimeTag) {
        this.lostValidateTimeTag = lostValidateTimeTag;
    }

    @Column(
            name = "IS_POWER_VALIDATE"
    )
    public Short getIsPowerValidate() {
        return this.isPowerValidate;
    }

    public void setIsPowerValidate(Short isPowerValidate) {
        this.isPowerValidate = isPowerValidate;
    }

    @Column(
            name = "POWER_VALIDATE_TIME_TAG"
    )
    public Timestamp getPowerValidateTimeTag() {
        return this.powerValidateTimeTag;
    }

    public void setPowerValidateTimeTag(Timestamp powerValidateTimeTag) {
        this.powerValidateTimeTag = powerValidateTimeTag;
    }

    @Column(
            name = "POWER_VALIDATE_RATIO"
    )
    public Double getPowerValidateRatio() {
        return this.powerValidateRatio;
    }

    public void setPowerValidateRatio(Double powerValidateRatio) {
        this.powerValidateRatio = powerValidateRatio;
    }

    @Column(
            name = "CLASS1_DUMMY_TIME_TAG"
    )
    public Timestamp getClass1DummyTimeTag() {
        return this.class1DummyTimeTag;
    }

    public void setClass1DummyTimeTag(Timestamp class1DummyTimeTag) {
        this.class1DummyTimeTag = class1DummyTimeTag;
    }

    @Column(
            name = "CLASS2_DUMMY_TIME_TAG"
    )
    public Timestamp getClass2DummyTimeTag() {
        return this.class2DummyTimeTag;
    }

    public void setClass2DummyTimeTag(Timestamp class2DummyTimeTag) {
        this.class2DummyTimeTag = class2DummyTimeTag;
    }

    @Column(
            name = "CLASS3_DUMMY_TIME_TAG"
    )
    public Timestamp getClass3DummyTimeTag() {
        return this.class3DummyTimeTag;
    }

    public void setClass3DummyTimeTag(Timestamp class3DummyTimeTag) {
        this.class3DummyTimeTag = class3DummyTimeTag;
    }

    @Column(
            name = "CLASS4_DUMMY_TIME_TAG"
    )
    public Timestamp getClass4DummyTimeTag() {
        return this.class4DummyTimeTag;
    }

    public void setClass4DummyTimeTag(Timestamp class4DummyTimeTag) {
        this.class4DummyTimeTag = class4DummyTimeTag;
    }

    @Column(
            name = "CLASS5_DUMMY_TIME_TAG"
    )
    public Timestamp getClass5DummyTimeTag() {
        return this.class5DummyTimeTag;
    }

    public void setClass5DummyTimeTag(Timestamp class5DummyTimeTag) {
        this.class5DummyTimeTag = class5DummyTimeTag;
    }

    @Column(
            name = "CLASS6_DUMMY_TIME_TAG"
    )
    public Timestamp getClass6DummyTimeTag() {
        return this.class6DummyTimeTag;
    }

    public void setClass6DummyTimeTag(Timestamp class6DummyTimeTag) {
        this.class6DummyTimeTag = class6DummyTimeTag;
    }

    @Column(
            name = "METER_CONFIG_ID"
    )
    public Long getMeterConfigId() {
        return this.meterConfigId;
    }

    public void setMeterConfigId(Long meterConfigId) {
        this.meterConfigId = meterConfigId;
    }

    public Long getRecord7() {
        return record7;
    }

    public void setRecord7(Long record7) {
        this.record7 = record7;
    }

    public Long getRecord8() {
        return record8;
    }

    public void setRecord8(Long record8) {
        this.record8 = record8;
    }

    public Long getRecord9() {
        return record9;
    }

    public void setRecord9(Long record9) {
        this.record9 = record9;
    }

    public Long getRecord10() {
        return record10;
    }

    public void setRecord10(Long record10) {
        this.record10 = record10;
    }

    public String getIsReverse() {
        return isReverse;
    }

    public void setIsReverse(String isReverse) {
        this.isReverse = isReverse;
    }

    public String getEnergyPrecision() {
        return energyPrecision;
    }

    public void setEnergyPrecision(String energyPrecision) {
        this.energyPrecision = energyPrecision;
    }
/*public Long getId() {
     return this.getMeterId();
 }

 public String getAliasName() {
     return this.getMeterAlias();
 }

 public String getDescription() {
     return this.getMeterName();
 }

 public String getLocalName() {
     String ln = this.getName();
     if(ln != null) {
         String[] str = ln.split("[.]");
         if(str != null && str.length > 0) {
             return str[str.length - 1];
         }
     }

     return this.getMeterName();
 }

 public String geTmrid() {
     return this.getMeterId().toString();
 }

 public String getName() {
     return this.getMeterName();
 }

 public String getPathName() {
     return this.getMeterName();
 }*/

}

