package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/12/27 18:18
 * @Description:
 */
@Entity
@Table(name = "day_data")
public class DayData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DATA_ID")
    private Long dataId;


    @Column(name = "OCCUR_TIME")
    private Long occurTime;
    @Column(name = "DEV_ID")
    private Integer devId;
    @Column(name = "METER_SERIAL")
    private Short meterSerial;
    @Column(name = "METER_RAW_STATUS_VALUE")
    private Integer meterRawStatusValue;
    @Column(name = "METER_RAW_STATUS_STATUS")
    private Short meterRawStatusStatus;
    @Column(name = "PAP_BASE_RAW_VALUE")
    private double papBaseRawValue;
    @Column(name = "PAP_BASE_RAW_STATUS")
    private Short papBaseRawStatus;
    @Column(name = "PAP_BASE_VALUE")
    private double papBaseValue;
    @Column(name = "PAP_BASE_STATUS")
    private Integer papBaseStatus;
    @Column(name = "PAP_NEED_RAW_VALUE")
    private double papNeedRawValue;
    @Column(name = "PAP_NEED_RAW_STATUS")
    private Short papNeedRawStatus;
    @Column(name = "PAP_NEED_VALUE")
    private double papNeedValue;
    @Column(name = "PAP_NEED_STATUS")
    private Integer papNeedStatus;
    @Column(name = "PAP_NEED_TIME_VALUE")
    private Long papNeedTimeValue;
    @Column(name = "PAP_NEED_TIME_STATUS")
    private Short papNeedTimeStatus;
    @Column(name = "RAP_BASE_RAW_VALUE")
    private double rapBaseRawValue;
    @Column(name = "RAP_BASE_RAW_STATUS")
    private Short rapBaseRawStatus;
    @Column(name = "RAP_BASE_VALUE")
    private double rapBaseValue;
    @Column(name = "RAP_BASE_STATUS")
    private Integer rapBaseStatus;
    @Column(name = "RAP_NEED_RAW_VALUE")
    private double rapNeedRawValue;
    @Column(name = "RAP_NEED_RAW_STATUS")
    private Short rapNeedRawStatus;
    @Column(name = "RAP_NEED_VALUE")
    private double rapNeedValue;
    @Column(name = "RAP_NEED_STATUS")
    private Integer rapNeedStatus;
    @Column(name = "RAP_NEED_TIME_VALUE")
    private Long rapNeedTimeValue;
    @Column(name = "RAP_NEED_TIME_STATUS")
    private Short rapNeedTimeStatus;
    @Column(name = "PRP_BASE_RAW_VALUE")
    private double prpBaseRawValue;
    @Column(name = "PRP_BASE_RAW_STATUS")
    private Short prpBaseRawStatus;
    @Column(name = "PRP_BASE_VALUE")
    private double prpBaseValue;
    @Column(name = "PRP_BASE_STATUS")
    private Integer prpBaseStatus;
    @Column(name = "PRP_NEED_RAW_VALUE")
    private double prpNeedRawValue;
    @Column(name = "PRP_NEED_RAW_STATUS")
    private Short prpNeedRawStatus;
    @Column(name = "PRP_NEED_VALUE")
    private double prpNeedValue;
    @Column(name = "PRP_NEED_STATUS")
    private Integer prpNeedStatus;
    @Column(name = "PRP_NEED_TIME_VALUE")
    private Long prpNeedTimeValue;
    @Column(name = "PRP_NEED_TIME_STATUS")
    private Short prpNeedTimeStatus;
    @Column(name = "RRP_BASE_RAW_VALUE")
    private double rrpBaseRawValue;
    @Column(name = "RRP_BASE_RAW_STATUS")
    private Short rrpBaseRawStatus;
    @Column(name = "RRP_BASE_VALUE")
    private double rrpBaseValue;
    @Column(name = "RRP_BASE_STATUS")
    private Integer rrpBaseStatus;
    @Column(name = "RRP_NEED_RAW_VALUE")
    private double rrpNeedRawValue;
    @Column(name = "RRP_NEED_RAW_STATUS")
    private Short rrpNeedRawStatus;
    @Column(name = "RRP_NEED_VALUE")
    private double rrpNeedValue;
    @Column(name = "RRP_NEED_STATUS")
    private Integer rrpNeedStatus;
    @Column(name = "RRP_NEED_TIME_VALUE")
    private Long rrpNeedTimeValue;
    @Column(name = "RRP_NEED_TIME_STATUS")
    private Short rrpNeedTimeStatus;


    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public Long getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Long occurTime) {
        this.occurTime = occurTime;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public Short getMeterSerial() {
        return meterSerial;
    }

    public void setMeterSerial(Short meterSerial) {
        this.meterSerial = meterSerial;
    }

    public Integer getMeterRawStatusValue() {
        return meterRawStatusValue;
    }

    public void setMeterRawStatusValue(Integer meterRawStatusValue) {
        this.meterRawStatusValue = meterRawStatusValue;
    }

    public Short getMeterRawStatusStatus() {
        return meterRawStatusStatus;
    }

    public void setMeterRawStatusStatus(Short meterRawStatusStatus) {
        this.meterRawStatusStatus = meterRawStatusStatus;
    }

    public double getPapBaseRawValue() {
        return papBaseRawValue;
    }

    public void setPapBaseRawValue(double papBaseRawValue) {
        this.papBaseRawValue = papBaseRawValue;
    }

    public Short getPapBaseRawStatus() {
        return papBaseRawStatus;
    }

    public void setPapBaseRawStatus(Short papBaseRawStatus) {
        this.papBaseRawStatus = papBaseRawStatus;
    }

    public double getPapBaseValue() {
        return papBaseValue;
    }

    public void setPapBaseValue(double papBaseValue) {
        this.papBaseValue = papBaseValue;
    }

    public Integer getPapBaseStatus() {
        return papBaseStatus;
    }

    public void setPapBaseStatus(Integer papBaseStatus) {
        this.papBaseStatus = papBaseStatus;
    }

    public double getPapNeedRawValue() {
        return papNeedRawValue;
    }

    public void setPapNeedRawValue(double papNeedRawValue) {
        this.papNeedRawValue = papNeedRawValue;
    }

    public Short getPapNeedRawStatus() {
        return papNeedRawStatus;
    }

    public void setPapNeedRawStatus(Short papNeedRawStatus) {
        this.papNeedRawStatus = papNeedRawStatus;
    }

    public double getPapNeedValue() {
        return papNeedValue;
    }

    public void setPapNeedValue(double papNeedValue) {
        this.papNeedValue = papNeedValue;
    }

    public Integer getPapNeedStatus() {
        return papNeedStatus;
    }

    public void setPapNeedStatus(Integer papNeedStatus) {
        this.papNeedStatus = papNeedStatus;
    }

    public Long getPapNeedTimeValue() {
        return papNeedTimeValue;
    }

    public void setPapNeedTimeValue(Long papNeedTimeValue) {
        this.papNeedTimeValue = papNeedTimeValue;
    }

    public Short getPapNeedTimeStatus() {
        return papNeedTimeStatus;
    }

    public void setPapNeedTimeStatus(Short papNeedTimeStatus) {
        this.papNeedTimeStatus = papNeedTimeStatus;
    }

    public double getRapBaseRawValue() {
        return rapBaseRawValue;
    }

    public void setRapBaseRawValue(double rapBaseRawValue) {
        this.rapBaseRawValue = rapBaseRawValue;
    }

    public Short getRapBaseRawStatus() {
        return rapBaseRawStatus;
    }

    public void setRapBaseRawStatus(Short rapBaseRawStatus) {
        this.rapBaseRawStatus = rapBaseRawStatus;
    }

    public double getRapBaseValue() {
        return rapBaseValue;
    }

    public void setRapBaseValue(double rapBaseValue) {
        this.rapBaseValue = rapBaseValue;
    }

    public Integer getRapBaseStatus() {
        return rapBaseStatus;
    }

    public void setRapBaseStatus(Integer rapBaseStatus) {
        this.rapBaseStatus = rapBaseStatus;
    }

    public double getRapNeedRawValue() {
        return rapNeedRawValue;
    }

    public void setRapNeedRawValue(double rapNeedRawValue) {
        this.rapNeedRawValue = rapNeedRawValue;
    }

    public Short getRapNeedRawStatus() {
        return rapNeedRawStatus;
    }

    public void setRapNeedRawStatus(Short rapNeedRawStatus) {
        this.rapNeedRawStatus = rapNeedRawStatus;
    }

    public double getRapNeedValue() {
        return rapNeedValue;
    }

    public void setRapNeedValue(double rapNeedValue) {
        this.rapNeedValue = rapNeedValue;
    }

    public Integer getRapNeedStatus() {
        return rapNeedStatus;
    }

    public void setRapNeedStatus(Integer rapNeedStatus) {
        this.rapNeedStatus = rapNeedStatus;
    }

    public Long getRapNeedTimeValue() {
        return rapNeedTimeValue;
    }

    public void setRapNeedTimeValue(Long rapNeedTimeValue) {
        this.rapNeedTimeValue = rapNeedTimeValue;
    }

    public Short getRapNeedTimeStatus() {
        return rapNeedTimeStatus;
    }

    public void setRapNeedTimeStatus(Short rapNeedTimeStatus) {
        this.rapNeedTimeStatus = rapNeedTimeStatus;
    }

    public double getPrpBaseRawValue() {
        return prpBaseRawValue;
    }

    public void setPrpBaseRawValue(double prpBaseRawValue) {
        this.prpBaseRawValue = prpBaseRawValue;
    }

    public Short getPrpBaseRawStatus() {
        return prpBaseRawStatus;
    }

    public void setPrpBaseRawStatus(Short prpBaseRawStatus) {
        this.prpBaseRawStatus = prpBaseRawStatus;
    }

    public double getPrpBaseValue() {
        return prpBaseValue;
    }

    public void setPrpBaseValue(double prpBaseValue) {
        this.prpBaseValue = prpBaseValue;
    }

    public Integer getPrpBaseStatus() {
        return prpBaseStatus;
    }

    public void setPrpBaseStatus(Integer prpBaseStatus) {
        this.prpBaseStatus = prpBaseStatus;
    }

    public double getPrpNeedRawValue() {
        return prpNeedRawValue;
    }

    public void setPrpNeedRawValue(double prpNeedRawValue) {
        this.prpNeedRawValue = prpNeedRawValue;
    }

    public Short getPrpNeedRawStatus() {
        return prpNeedRawStatus;
    }

    public void setPrpNeedRawStatus(Short prpNeedRawStatus) {
        this.prpNeedRawStatus = prpNeedRawStatus;
    }

    public double getPrpNeedValue() {
        return prpNeedValue;
    }

    public void setPrpNeedValue(double prpNeedValue) {
        this.prpNeedValue = prpNeedValue;
    }

    public Integer getPrpNeedStatus() {
        return prpNeedStatus;
    }

    public void setPrpNeedStatus(Integer prpNeedStatus) {
        this.prpNeedStatus = prpNeedStatus;
    }

    public Long getPrpNeedTimeValue() {
        return prpNeedTimeValue;
    }

    public void setPrpNeedTimeValue(Long prpNeedTimeValue) {
        this.prpNeedTimeValue = prpNeedTimeValue;
    }

    public Short getPrpNeedTimeStatus() {
        return prpNeedTimeStatus;
    }

    public void setPrpNeedTimeStatus(Short prpNeedTimeStatus) {
        this.prpNeedTimeStatus = prpNeedTimeStatus;
    }

    public double getRrpBaseRawValue() {
        return rrpBaseRawValue;
    }

    public void setRrpBaseRawValue(double rrpBaseRawValue) {
        this.rrpBaseRawValue = rrpBaseRawValue;
    }

    public Short getRrpBaseRawStatus() {
        return rrpBaseRawStatus;
    }

    public void setRrpBaseRawStatus(Short rrpBaseRawStatus) {
        this.rrpBaseRawStatus = rrpBaseRawStatus;
    }

    public double getRrpBaseValue() {
        return rrpBaseValue;
    }

    public void setRrpBaseValue(double rrpBaseValue) {
        this.rrpBaseValue = rrpBaseValue;
    }

    public Integer getRrpBaseStatus() {
        return rrpBaseStatus;
    }

    public void setRrpBaseStatus(Integer rrpBaseStatus) {
        this.rrpBaseStatus = rrpBaseStatus;
    }

    public double getRrpNeedRawValue() {
        return rrpNeedRawValue;
    }

    public void setRrpNeedRawValue(double rrpNeedRawValue) {
        this.rrpNeedRawValue = rrpNeedRawValue;
    }

    public Short getRrpNeedRawStatus() {
        return rrpNeedRawStatus;
    }

    public void setRrpNeedRawStatus(Short rrpNeedRawStatus) {
        this.rrpNeedRawStatus = rrpNeedRawStatus;
    }

    public double getRrpNeedValue() {
        return rrpNeedValue;
    }

    public void setRrpNeedValue(double rrpNeedValue) {
        this.rrpNeedValue = rrpNeedValue;
    }

    public Integer getRrpNeedStatus() {
        return rrpNeedStatus;
    }

    public void setRrpNeedStatus(Integer rrpNeedStatus) {
        this.rrpNeedStatus = rrpNeedStatus;
    }

    public Long getRrpNeedTimeValue() {
        return rrpNeedTimeValue;
    }

    public void setRrpNeedTimeValue(Long rrpNeedTimeValue) {
        this.rrpNeedTimeValue = rrpNeedTimeValue;
    }

    public Short getRrpNeedTimeStatus() {
        return rrpNeedTimeStatus;
    }

    public void setRrpNeedTimeStatus(Short rrpNeedTimeStatus) {
        this.rrpNeedTimeStatus = rrpNeedTimeStatus;
    }
}