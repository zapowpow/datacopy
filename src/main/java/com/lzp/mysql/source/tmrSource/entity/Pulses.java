package com.lzp.mysql.source.tmrSource.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lzp.mysql.source.unit.DateTimeSerializer;
import com.lzp.mysql.source.unit.TimestampDeserializer;
@Entity
@Table(name = "PULSES")
public class Pulses{
    private Long pulseId;
    private String pulseName;
    private Short pulseType;
    private Integer pulseAddr;
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
    @Column(
            name = "PULSE_ID",
            unique = true,
            nullable = false
    )
    public Long getPulseId() {
        return this.pulseId;
    }

    public void setPulseId(Long pulseId) {
        this.pulseId = pulseId;
    }

    @Column(
            name = "PULSE_NAME",
            nullable = false,
            length = 64
    )
    public String getPulseName() {
        return this.pulseName;
    }

    public void setPulseName(String pulseName) {
        this.pulseName = pulseName;
    }

    @Column(
            name = "PULSE_TYPE"
    )
    public Short getPulseType() {
        return this.pulseType;
    }

    public void setPulseType(Short pulseType) {
        this.pulseType = pulseType;
    }

    @Column(
            name = "PULSE_ADDR",
            nullable = false
    )
    public Integer getPulseAddr() {
        return this.pulseAddr;
    }

    public void setPulseAddr(Integer pulseAddr) {
        this.pulseAddr = pulseAddr;
    }

    @Column(
            name = "METER_ID",
            nullable = false
    )
    public Long getMeterId() {
        return this.meterId;
    }

    public void setMeterId(Long meterId) {
        this.meterId = meterId;
    }

    @Column(
        name = "IS_LIMIT_VALID"
    )
    public Integer getIsLimitValid() {
        return this.isLimitValid;
    }

    public void setIsLimitValid(Integer isLimitValid) {
        this.isLimitValid = isLimitValid;
    }

    @Column(
        name = "LIMIT_VALID_INTERVAL"
    )
    public Integer getLimitValidInterval() {
        return this.limitValidInterval;
    }

    public void setLimitValidInterval(Integer limitValidInterval) {
        this.limitValidInterval = limitValidInterval;
    }

    @Column(
        name = "LOW_LIMIT"
    )
    public Double getLowLimit() {
        return this.lowLimit;
    }

    public void setLowLimit(Double lowLimit) {
        this.lowLimit = lowLimit;
    }

    @Column(
        name = "UP_LIMIT"
    )
    public Double getUpLimit() {
        return this.upLimit;
    }

    public void setUpLimit(Double upLimit) {
        this.upLimit = upLimit;
    }

    @Column(
        name = "LIMIT_VALID_TIME_TAG"
    )
    public Timestamp getLimitValidTimeTag() {
        return this.limitValidTimeTag;
    }

    public void setLimitValidTimeTag(Timestamp limitValidTimeTag) {
        this.limitValidTimeTag = limitValidTimeTag;
    }
}
