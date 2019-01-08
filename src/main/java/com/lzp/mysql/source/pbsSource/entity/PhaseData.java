package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/12/27 18:14
 * @Description:
 */
@Entity
@Table(name = "phase_data")
public class PhaseData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DATA_ID")
    private Long dataId;


    @Column(name = "OCCUR_TIME")
    private Long occurTime;
    @Column(name = "DEV_ID")
    private Long devId;
    @Column(name = "METER_SERIAL")
    private Integer meterSerial;
    @Column(name = "METER_RAW_STATUS_VALUE")
    private Integer meterRawStatusValue;
    @Column(name = "METER_RAW_STATUS_STATUS")
    private Short meterRawStatusStatus;
    @Column(name = "PAP_BASE_VALUE1")
    private double papBaseValue1;
    @Column(name = "PAP_BASE_STATUS1")
    private Integer papBaseStatus1;
    @Column(name = "PAP_BASE_RAW_VALUE1")
    private double papBaseRawValue1;
    @Column(name = "PAP_BASE_RAW_STATUS1")
    private Integer papBaseRawStatus1;
    @Column(name = "PAP_NEED_VALUE1")
    private double papNeedValue1;
    @Column(name = "PAP_NEED_STATUS1")
    private Integer papNeedStatus1;
    @Column(name = "PAP_NEED_RAW_VALUE1")
    private double papNeedRawValue1;
    @Column(name = "PAP_NEED_RAW_STATUS1")
    private Integer papNeedRawStatus1;
    @Column(name = "PAP_NEED_TIME1")
    private Long papNeedTime1;
    @Column(name = "PAP_BASE_VALUE2")
    private double papBaseValue2;
    @Column(name = "PAP_BASE_STATUS2")
    private Integer papBaseStatus2;
    @Column(name = "PAP_BASE_RAW_VALUE2")
    private double papBaseRawValue2;
    @Column(name = "PAP_BASE_RAW_STATUS2")
    private Integer papBaseRawStatus2;
    @Column(name = "PAP_NEED_VALUE2")
    private double papNeedValue2;
    @Column(name = "PAP_NEED_STATUS2")
    private Integer papNeedStatus2;
    @Column(name = "PAP_NEED_RAW_VALUE2")
    private double papNeedRawValue2;
    @Column(name = "PAP_NEED_RAW_STATUS2")
    private Integer papNeedRawStatus2;
    @Column(name = "PAP_NEED_TIME2")
    private Long papNeedTime2;
    @Column(name = "PAP_BASE_VALUE3")
    private double papBaseValue3;
    @Column(name = "PAP_BASE_STATUS3")
    private Integer papBaseStatus3;
    @Column(name = "PAP_BASE_RAW_VALUE3")
    private double papBaseRawValue3;
    @Column(name = "PAP_BASE_RAW_STATUS3")
    private Integer papBaseRawStatus3;
    @Column(name = "PAP_NEED_VALUE3")
    private double papNeedValue3;
    @Column(name = "PAP_NEED_STATUS3")
    private Integer papNeedStatus3;
    @Column(name = "PAP_NEED_RAW_VALUE3")
    private double papNeedRawValue3;
    @Column(name = "PAP_NEED_RAW_STATUS3")
    private Integer papNeedRawStatus3;
    @Column(name = "PAP_NEED_TIME3")
    private Long papNeedTime3;
    @Column(name = "PAP_BASE_VALUE4")
    private double papBaseValue4;
    @Column(name = "PAP_BASE_STATUS4")
    private Integer papBaseStatus4;
    @Column(name = "PAP_BASE_RAW_VALUE4")
    private double papBaseRawValue4;
    @Column(name = "PAP_BASE_RAW_STATUS4")
    private Integer papBaseRawStatus4;
    @Column(name = "PAP_NEED_VALUE4")
    private double papNeedValue4;
    @Column(name = "PAP_NEED_STATUS4")
    private Integer papNeedStatus4;
    @Column(name = "PAP_NEED_RAW_VALUE4")
    private double papNeedRawValue4;
    @Column(name = "PAP_NEED_RAW_STATUS4")
    private Integer papNeedRawStatus4;
    @Column(name = "PAP_NEED_TIME4")
    private Long papNeedTime4;
    @Column(name = "PAP_BASE_VALUE5")
    private double papBaseValue5;
    @Column(name = "PAP_BASE_STATUS5")
    private Integer papBaseStatus5;
    @Column(name = "PAP_BASE_RAW_VALUE5")
    private double papBaseRawValue5;
    @Column(name = "PAP_BASE_RAW_STATUS5")
    private Integer papBaseRawStatus5;
    @Column(name = "PAP_NEED_VALUE5")
    private double papNeedValue5;
    @Column(name = "PAP_NEED_STATUS5")
    private Integer papNeedStatus5;
    @Column(name = "PAP_NEED_RAW_VALUE5")
    private double papNeedRawValue5;
    @Column(name = "PAP_NEED_RAW_STATUS5")
    private Integer papNeedRawStatus5;
    @Column(name = "PAP_NEED_TIME5")
    private Long papNeedTime5;
    @Column(name = "RAP_BASE_VALUE1")
    private double rapBaseValue1;
    @Column(name = "RAP_BASE_STATUS1")
    private Integer rapBaseStatus1;
    @Column(name = "RAP_BASE_RAW_VALUE1")
    private double rapBaseRawValue1;
    @Column(name = "RAP_BASE_RAW_STATUS1")
    private Integer rapBaseRawStatus1;
    @Column(name = "RAP_NEED_VALUE1")
    private double rapNeedValue1;
    @Column(name = "RAP_NEED_STATUS1")
    private Integer rapNeedStatus1;
    @Column(name = "RAP_NEED_RAW_VALUE1")
    private double rapNeedRawValue1;
    @Column(name = "RAP_NEED_RAW_STATUS1")
    private Integer rapNeedRawStatus1;
    @Column(name = "RAP_NEED_TIME1")
    private Long rapNeedTime1;
    @Column(name = "RAP_BASE_VALUE2")
    private double rapBaseValue2;
    @Column(name = "RAP_BASE_STATUS2")
    private Integer rapBaseStatus2;
    @Column(name = "RAP_BASE_RAW_VALUE2")
    private double rapBaseRawValue2;
    @Column(name = "RAP_BASE_RAW_STATUS2")
    private Integer rapBaseRawStatus2;
    @Column(name = "RAP_NEED_VALUE2")
    private double rapNeedValue2;
    @Column(name = "RAP_NEED_STATUS2")
    private Integer rapNeedStatus2;
    @Column(name = "RAP_NEED_RAW_VALUE2")
    private double rapNeedRawValue2;
    @Column(name = "RAP_NEED_RAW_STATUS2")
    private Integer rapNeedRawStatus2;
    @Column(name = "RAP_NEED_TIME2")
    private Long rapNeedTime2;
    @Column(name = "RAP_BASE_VALUE3")
    private double rapBaseValue3;
    @Column(name = "RAP_BASE_STATUS3")
    private Integer rapBaseStatus3;
    @Column(name = "RAP_BASE_RAW_VALUE3")
    private double rapBaseRawValue3;
    @Column(name = "RAP_BASE_RAW_STATUS3")
    private Integer rapBaseRawStatus3;
    @Column(name = "RAP_NEED_VALUE3")
    private double rapNeedValue3;
    @Column(name = "RAP_NEED_STATUS3")
    private Integer rapNeedStatus3;
    @Column(name = "RAP_NEED_RAW_VALUE3")
    private double rapNeedRawValue3;
    @Column(name = "RAP_NEED_RAW_STATUS3")
    private Integer rapNeedRawStatus3;
    @Column(name = "RAP_NEED_TIME3")
    private Long rapNeedTime3;
    @Column(name = "RAP_BASE_VALUE4")
    private double rapBaseValue4;
    @Column(name = "RAP_BASE_STATUS4")
    private Integer rapBaseStatus4;
    @Column(name = "RAP_BASE_RAW_VALUE4")
    private double rapBaseRawValue4;
    @Column(name = "RAP_BASE_RAW_STATUS4")
    private Integer rapBaseRawStatus4;
    @Column(name = "RAP_NEED_VALUE4")
    private double rapNeedValue4;
    @Column(name = "RAP_NEED_STATUS4")
    private Integer rapNeedStatus4;
    @Column(name = "RAP_NEED_RAW_VALUE4")
    private double rapNeedRawValue4;
    @Column(name = "RAP_NEED_RAW_STATUS4")
    private Integer rapNeedRawStatus4;
    @Column(name = "RAP_NEED_TIME4")
    private Long rapNeedTime4;
    @Column(name = "RAP_BASE_VALUE5")
    private double rapBaseValue5;
    @Column(name = "RAP_BASE_STATUS5")
    private Integer rapBaseStatus5;
    @Column(name = "RAP_BASE_RAW_VALUE5")
    private double rapBaseRawValue5;
    @Column(name = "RAP_BASE_RAW_STATUS5")
    private Integer rapBaseRawStatus5;
    @Column(name = "RAP_NEED_VALUE5")
    private double rapNeedValue5;
    @Column(name = "RAP_NEED_STATUS5")
    private Integer rapNeedStatus5;
    @Column(name = "RAP_NEED_RAW_VALUE5")
    private double rapNeedRawValue5;
    @Column(name = "RAP_NEED_RAW_STATUS5")
    private Integer rapNeedRawStatus5;
    @Column(name = "RAP_NEED_TIME5")
    private Long rapNeedTime5;
    @Column(name = "PRP_BASE_VALUE1")
    private double prpBaseValue1;
    @Column(name = "PRP_BASE_STATUS1")
    private Integer prpBaseStatus1;
    @Column(name = "PRP_BASE_RAW_VALUE1")
    private double prpBaseRawValue1;
    @Column(name = "PRP_BASE_RAW_STATUS1")
    private Integer prpBaseRawStatus1;
    @Column(name = "PRP_NEED_VALUE1")
    private double prpNeedValue1;
    @Column(name = "PRP_NEED_STATUS1")
    private Integer prpNeedStatus1;
    @Column(name = "PRP_NEED_RAW_VALUE1")
    private double prpNeedRawValue1;
    @Column(name = "PRP_NEED_RAW_STATUS1")
    private Integer prpNeedRawStatus1;
    @Column(name = "PRP_NEED_TIME1")
    private Long prpNeedTime1;
    @Column(name = "PRP_BASE_VALUE2")
    private double prpBaseValue2;
    @Column(name = "PRP_BASE_STATUS2")
    private Integer prpBaseStatus2;
    @Column(name = "PRP_BASE_RAW_VALUE2")
    private double prpBaseRawValue2;
    @Column(name = "PRP_BASE_RAW_STATUS2")
    private Integer prpBaseRawStatus2;
    @Column(name = "PRP_NEED_VALUE2")
    private double prpNeedValue2;
    @Column(name = "PRP_NEED_STATUS2")
    private Integer prpNeedStatus2;
    @Column(name = "PRP_NEED_RAW_VALUE2")
    private double prpNeedRawValue2;
    @Column(name = "PRP_NEED_RAW_STATUS2")
    private Integer prpNeedRawStatus2;
    @Column(name = "PRP_NEED_TIME2")
    private Long prpNeedTime2;
    @Column(name = "PRP_BASE_VALUE3")
    private double prpBaseValue3;
    @Column(name = "PRP_BASE_STATUS3")
    private Integer prpBaseStatus3;
    @Column(name = "PRP_BASE_RAW_VALUE3")
    private double prpBaseRawValue3;
    @Column(name = "PRP_BASE_RAW_STATUS3")
    private Integer prpBaseRawStatus3;
    @Column(name = "PRP_NEED_VALUE3")
    private double prpNeedValue3;
    @Column(name = "PRP_NEED_STATUS3")
    private Integer prpNeedStatus3;
    @Column(name = "PRP_NEED_RAW_VALUE3")
    private double prpNeedRawValue3;
    @Column(name = "PRP_NEED_RAW_STATUS3")
    private Integer prpNeedRawStatus3;
    @Column(name = "PRP_NEED_TIME3")
    private Long prpNeedTime3;
    @Column(name = "PRP_BASE_VALUE4")
    private double prpBaseValue4;
    @Column(name = "PRP_BASE_STATUS4")
    private Integer prpBaseStatus4;
    @Column(name = "PRP_BASE_RAW_VALUE4")
    private double prpBaseRawValue4;
    @Column(name = "PRP_BASE_RAW_STATUS4")
    private Integer prpBaseRawStatus4;
    @Column(name = "PRP_NEED_VALUE4")
    private double prpNeedValue4;
    @Column(name = "PRP_NEED_STATUS4")
    private Integer prpNeedStatus4;
    @Column(name = "PRP_NEED_RAW_VALUE4")
    private double prpNeedRawValue4;
    @Column(name = "PRP_NEED_RAW_STATUS4")
    private Integer prpNeedRawStatus4;
    @Column(name = "PRP_NEED_TIME4")
    private Long prpNeedTime4;
    @Column(name = "PRP_BASE_VALUE5")
    private double prpBaseValue5;
    @Column(name = "PRP_BASE_STATUS5")
    private Integer prpBaseStatus5;
    @Column(name = "PRP_BASE_RAW_VALUE5")
    private double prpBaseRawValue5;
    @Column(name = "PRP_BASE_RAW_STATUS5")
    private Integer prpBaseRawStatus5;
    @Column(name = "PRP_NEED_VALUE5")
    private double prpNeedValue5;
    @Column(name = "PRP_NEED_STATUS5")
    private Integer prpNeedStatus5;
    @Column(name = "PRP_NEED_RAW_VALUE5")
    private double prpNeedRawValue5;
    @Column(name = "PRP_NEED_RAW_STATUS5")
    private Integer prpNeedRawStatus5;
    @Column(name = "PRP_NEED_TIME5")
    private Long prpNeedTime5;
    @Column(name = "RRP_BASE_VALUE1")
    private double rrpBaseValue1;
    @Column(name = "RRP_BASE_STATUS1")
    private Integer rrpBaseStatus1;
    @Column(name = "RRP_BASE_RAW_VALUE1")
    private double rrpBaseRawValue1;
    @Column(name = "RRP_BASE_RAW_STATUS1")
    private Integer rrpBaseRawStatus1;
    @Column(name = "RRP_NEED_VALUE1")
    private double rrpNeedValue1;
    @Column(name = "RRP_NEED_STATUS1")
    private Integer rrpNeedStatus1;
    @Column(name = "RRP_NEED_RAW_VALUE1")
    private double rrpNeedRawValue1;
    @Column(name = "RRP_NEED_RAW_STATUS1")
    private Integer rrpNeedRawStatus1;
    @Column(name = "RRP_NEED_TIME1")
    private Long rrpNeedTime1;
    @Column(name = "RRP_BASE_VALUE2")
    private double rrpBaseValue2;
    @Column(name = "RRP_BASE_STATUS2")
    private Integer rrpBaseStatus2;
    @Column(name = "RRP_BASE_RAW_VALUE2")
    private double rrpBaseRawValue2;
    @Column(name = "RRP_BASE_RAW_STATUS2")
    private Integer rrpBaseRawStatus2;
    @Column(name = "RRP_NEED_VALUE2")
    private double rrpNeedValue2;
    @Column(name = "RRP_NEED_STATUS2")
    private Integer rrpNeedStatus2;
    @Column(name = "RRP_NEED_RAW_VALUE2")
    private double rrpNeedRawValue2;
    @Column(name = "RRP_NEED_RAW_STATUS2")
    private Integer rrpNeedRawStatus2;
    @Column(name = "RRP_NEED_TIME2")
    private Long rrpNeedTime2;
    @Column(name = "RRP_BASE_VALUE3")
    private double rrpBaseValue3;
    @Column(name = "RRP_BASE_STATUS3")
    private Integer rrpBaseStatus3;
    @Column(name = "RRP_BASE_RAW_VALUE3")
    private double rrpBaseRawValue3;
    @Column(name = "RRP_BASE_RAW_STATUS3")
    private Integer rrpBaseRawStatus3;
    @Column(name = "RRP_NEED_VALUE3")
    private double rrpNeedValue3;
    @Column(name = "RRP_NEED_STATUS3")
    private Integer rrpNeedStatus3;
    @Column(name = "RRP_NEED_RAW_VALUE3")
    private double rrpNeedRawValue3;
    @Column(name = "RRP_NEED_RAW_STATUS3")
    private Integer rrpNeedRawStatus3;
    @Column(name = "RRP_NEED_TIME3")
    private Long rrpNeedTime3;
    @Column(name = "RRP_BASE_VALUE4")
    private double rrpBaseValue4;
    @Column(name = "RRP_BASE_STATUS4")
    private Integer rrpBaseStatus4;
    @Column(name = "RRP_BASE_RAW_VALUE4")
    private double rrpBaseRawValue4;
    @Column(name = "RRP_BASE_RAW_STATUS4")
    private Integer rrpBaseRawStatus4;
    @Column(name = "RRP_NEED_VALUE4")
    private double rrpNeedValue4;
    @Column(name = "RRP_NEED_STATUS4")
    private Integer rrpNeedStatus4;
    @Column(name = "RRP_NEED_RAW_VALUE4")
    private double rrpNeedRawValue4;
    @Column(name = "RRP_NEED_RAW_STATUS4")
    private Integer rrpNeedRawStatus4;
    @Column(name = "RRP_NEED_TIME4")
    private Long rrpNeedTime4;
    @Column(name = "RRP_BASE_VALUE5")
    private double rrpBaseValue5;
    @Column(name = "RRP_BASE_STATUS5")
    private Integer rrpBaseStatus5;
    @Column(name = "RRP_BASE_RAW_VALUE5")
    private double rrpBaseRawValue5;
    @Column(name = "RRP_BASE_RAW_STATUS5")
    private Integer rrpBaseRawStatus5;
    @Column(name = "RRP_NEED_VALUE5")
    private double rrpNeedValue5;
    @Column(name = "RRP_NEED_STATUS5")
    private Integer rrpNeedStatus5;
    @Column(name = "RRP_NEED_RAW_VALUE5")
    private double rrpNeedRawValue5;
    @Column(name = "RRP_NEED_RAW_STATUS5")
    private Integer rrpNeedRawStatus5;
    @Column(name = "RRP_NEED_TIME5")
    private Long rrpNeedTime5;


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

    public Long getDevId() {
        return devId;
    }

    public void setDevId(Long devId) {
        this.devId = devId;
    }

    public Integer getMeterSerial() {
        return meterSerial;
    }

    public void setMeterSerial(Integer meterSerial) {
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

    public double getPapBaseValue1() {
        return papBaseValue1;
    }

    public void setPapBaseValue1(double papBaseValue1) {
        this.papBaseValue1 = papBaseValue1;
    }

    public Integer getPapBaseStatus1() {
        return papBaseStatus1;
    }

    public void setPapBaseStatus1(Integer papBaseStatus1) {
        this.papBaseStatus1 = papBaseStatus1;
    }

    public double getPapBaseRawValue1() {
        return papBaseRawValue1;
    }

    public void setPapBaseRawValue1(double papBaseRawValue1) {
        this.papBaseRawValue1 = papBaseRawValue1;
    }

    public Integer getPapBaseRawStatus1() {
        return papBaseRawStatus1;
    }

    public void setPapBaseRawStatus1(Integer papBaseRawStatus1) {
        this.papBaseRawStatus1 = papBaseRawStatus1;
    }

    public double getPapNeedValue1() {
        return papNeedValue1;
    }

    public void setPapNeedValue1(double papNeedValue1) {
        this.papNeedValue1 = papNeedValue1;
    }

    public Integer getPapNeedStatus1() {
        return papNeedStatus1;
    }

    public void setPapNeedStatus1(Integer papNeedStatus1) {
        this.papNeedStatus1 = papNeedStatus1;
    }

    public double getPapNeedRawValue1() {
        return papNeedRawValue1;
    }

    public void setPapNeedRawValue1(double papNeedRawValue1) {
        this.papNeedRawValue1 = papNeedRawValue1;
    }

    public Integer getPapNeedRawStatus1() {
        return papNeedRawStatus1;
    }

    public void setPapNeedRawStatus1(Integer papNeedRawStatus1) {
        this.papNeedRawStatus1 = papNeedRawStatus1;
    }

    public Long getPapNeedTime1() {
        return papNeedTime1;
    }

    public void setPapNeedTime1(Long papNeedTime1) {
        this.papNeedTime1 = papNeedTime1;
    }

    public double getPapBaseValue2() {
        return papBaseValue2;
    }

    public void setPapBaseValue2(double papBaseValue2) {
        this.papBaseValue2 = papBaseValue2;
    }

    public Integer getPapBaseStatus2() {
        return papBaseStatus2;
    }

    public void setPapBaseStatus2(Integer papBaseStatus2) {
        this.papBaseStatus2 = papBaseStatus2;
    }

    public double getPapBaseRawValue2() {
        return papBaseRawValue2;
    }

    public void setPapBaseRawValue2(double papBaseRawValue2) {
        this.papBaseRawValue2 = papBaseRawValue2;
    }

    public Integer getPapBaseRawStatus2() {
        return papBaseRawStatus2;
    }

    public void setPapBaseRawStatus2(Integer papBaseRawStatus2) {
        this.papBaseRawStatus2 = papBaseRawStatus2;
    }

    public double getPapNeedValue2() {
        return papNeedValue2;
    }

    public void setPapNeedValue2(double papNeedValue2) {
        this.papNeedValue2 = papNeedValue2;
    }

    public Integer getPapNeedStatus2() {
        return papNeedStatus2;
    }

    public void setPapNeedStatus2(Integer papNeedStatus2) {
        this.papNeedStatus2 = papNeedStatus2;
    }

    public double getPapNeedRawValue2() {
        return papNeedRawValue2;
    }

    public void setPapNeedRawValue2(double papNeedRawValue2) {
        this.papNeedRawValue2 = papNeedRawValue2;
    }

    public Integer getPapNeedRawStatus2() {
        return papNeedRawStatus2;
    }

    public void setPapNeedRawStatus2(Integer papNeedRawStatus2) {
        this.papNeedRawStatus2 = papNeedRawStatus2;
    }

    public Long getPapNeedTime2() {
        return papNeedTime2;
    }

    public void setPapNeedTime2(Long papNeedTime2) {
        this.papNeedTime2 = papNeedTime2;
    }

    public double getPapBaseValue3() {
        return papBaseValue3;
    }

    public void setPapBaseValue3(double papBaseValue3) {
        this.papBaseValue3 = papBaseValue3;
    }

    public Integer getPapBaseStatus3() {
        return papBaseStatus3;
    }

    public void setPapBaseStatus3(Integer papBaseStatus3) {
        this.papBaseStatus3 = papBaseStatus3;
    }

    public double getPapBaseRawValue3() {
        return papBaseRawValue3;
    }

    public void setPapBaseRawValue3(double papBaseRawValue3) {
        this.papBaseRawValue3 = papBaseRawValue3;
    }

    public Integer getPapBaseRawStatus3() {
        return papBaseRawStatus3;
    }

    public void setPapBaseRawStatus3(Integer papBaseRawStatus3) {
        this.papBaseRawStatus3 = papBaseRawStatus3;
    }

    public double getPapNeedValue3() {
        return papNeedValue3;
    }

    public void setPapNeedValue3(double papNeedValue3) {
        this.papNeedValue3 = papNeedValue3;
    }

    public Integer getPapNeedStatus3() {
        return papNeedStatus3;
    }

    public void setPapNeedStatus3(Integer papNeedStatus3) {
        this.papNeedStatus3 = papNeedStatus3;
    }

    public double getPapNeedRawValue3() {
        return papNeedRawValue3;
    }

    public void setPapNeedRawValue3(double papNeedRawValue3) {
        this.papNeedRawValue3 = papNeedRawValue3;
    }

    public Integer getPapNeedRawStatus3() {
        return papNeedRawStatus3;
    }

    public void setPapNeedRawStatus3(Integer papNeedRawStatus3) {
        this.papNeedRawStatus3 = papNeedRawStatus3;
    }

    public Long getPapNeedTime3() {
        return papNeedTime3;
    }

    public void setPapNeedTime3(Long papNeedTime3) {
        this.papNeedTime3 = papNeedTime3;
    }

    public double getPapBaseValue4() {
        return papBaseValue4;
    }

    public void setPapBaseValue4(double papBaseValue4) {
        this.papBaseValue4 = papBaseValue4;
    }

    public Integer getPapBaseStatus4() {
        return papBaseStatus4;
    }

    public void setPapBaseStatus4(Integer papBaseStatus4) {
        this.papBaseStatus4 = papBaseStatus4;
    }

    public double getPapBaseRawValue4() {
        return papBaseRawValue4;
    }

    public void setPapBaseRawValue4(double papBaseRawValue4) {
        this.papBaseRawValue4 = papBaseRawValue4;
    }

    public Integer getPapBaseRawStatus4() {
        return papBaseRawStatus4;
    }

    public void setPapBaseRawStatus4(Integer papBaseRawStatus4) {
        this.papBaseRawStatus4 = papBaseRawStatus4;
    }

    public double getPapNeedValue4() {
        return papNeedValue4;
    }

    public void setPapNeedValue4(double papNeedValue4) {
        this.papNeedValue4 = papNeedValue4;
    }

    public Integer getPapNeedStatus4() {
        return papNeedStatus4;
    }

    public void setPapNeedStatus4(Integer papNeedStatus4) {
        this.papNeedStatus4 = papNeedStatus4;
    }

    public double getPapNeedRawValue4() {
        return papNeedRawValue4;
    }

    public void setPapNeedRawValue4(double papNeedRawValue4) {
        this.papNeedRawValue4 = papNeedRawValue4;
    }

    public Integer getPapNeedRawStatus4() {
        return papNeedRawStatus4;
    }

    public void setPapNeedRawStatus4(Integer papNeedRawStatus4) {
        this.papNeedRawStatus4 = papNeedRawStatus4;
    }

    public Long getPapNeedTime4() {
        return papNeedTime4;
    }

    public void setPapNeedTime4(Long papNeedTime4) {
        this.papNeedTime4 = papNeedTime4;
    }

    public double getPapBaseValue5() {
        return papBaseValue5;
    }

    public void setPapBaseValue5(double papBaseValue5) {
        this.papBaseValue5 = papBaseValue5;
    }

    public Integer getPapBaseStatus5() {
        return papBaseStatus5;
    }

    public void setPapBaseStatus5(Integer papBaseStatus5) {
        this.papBaseStatus5 = papBaseStatus5;
    }

    public double getPapBaseRawValue5() {
        return papBaseRawValue5;
    }

    public void setPapBaseRawValue5(double papBaseRawValue5) {
        this.papBaseRawValue5 = papBaseRawValue5;
    }

    public Integer getPapBaseRawStatus5() {
        return papBaseRawStatus5;
    }

    public void setPapBaseRawStatus5(Integer papBaseRawStatus5) {
        this.papBaseRawStatus5 = papBaseRawStatus5;
    }

    public double getPapNeedValue5() {
        return papNeedValue5;
    }

    public void setPapNeedValue5(double papNeedValue5) {
        this.papNeedValue5 = papNeedValue5;
    }

    public Integer getPapNeedStatus5() {
        return papNeedStatus5;
    }

    public void setPapNeedStatus5(Integer papNeedStatus5) {
        this.papNeedStatus5 = papNeedStatus5;
    }

    public double getPapNeedRawValue5() {
        return papNeedRawValue5;
    }

    public void setPapNeedRawValue5(double papNeedRawValue5) {
        this.papNeedRawValue5 = papNeedRawValue5;
    }

    public Integer getPapNeedRawStatus5() {
        return papNeedRawStatus5;
    }

    public void setPapNeedRawStatus5(Integer papNeedRawStatus5) {
        this.papNeedRawStatus5 = papNeedRawStatus5;
    }

    public Long getPapNeedTime5() {
        return papNeedTime5;
    }

    public void setPapNeedTime5(Long papNeedTime5) {
        this.papNeedTime5 = papNeedTime5;
    }

    public double getRapBaseValue1() {
        return rapBaseValue1;
    }

    public void setRapBaseValue1(double rapBaseValue1) {
        this.rapBaseValue1 = rapBaseValue1;
    }

    public Integer getRapBaseStatus1() {
        return rapBaseStatus1;
    }

    public void setRapBaseStatus1(Integer rapBaseStatus1) {
        this.rapBaseStatus1 = rapBaseStatus1;
    }

    public double getRapBaseRawValue1() {
        return rapBaseRawValue1;
    }

    public void setRapBaseRawValue1(double rapBaseRawValue1) {
        this.rapBaseRawValue1 = rapBaseRawValue1;
    }

    public Integer getRapBaseRawStatus1() {
        return rapBaseRawStatus1;
    }

    public void setRapBaseRawStatus1(Integer rapBaseRawStatus1) {
        this.rapBaseRawStatus1 = rapBaseRawStatus1;
    }

    public double getRapNeedValue1() {
        return rapNeedValue1;
    }

    public void setRapNeedValue1(double rapNeedValue1) {
        this.rapNeedValue1 = rapNeedValue1;
    }

    public Integer getRapNeedStatus1() {
        return rapNeedStatus1;
    }

    public void setRapNeedStatus1(Integer rapNeedStatus1) {
        this.rapNeedStatus1 = rapNeedStatus1;
    }

    public double getRapNeedRawValue1() {
        return rapNeedRawValue1;
    }

    public void setRapNeedRawValue1(double rapNeedRawValue1) {
        this.rapNeedRawValue1 = rapNeedRawValue1;
    }

    public Integer getRapNeedRawStatus1() {
        return rapNeedRawStatus1;
    }

    public void setRapNeedRawStatus1(Integer rapNeedRawStatus1) {
        this.rapNeedRawStatus1 = rapNeedRawStatus1;
    }

    public Long getRapNeedTime1() {
        return rapNeedTime1;
    }

    public void setRapNeedTime1(Long rapNeedTime1) {
        this.rapNeedTime1 = rapNeedTime1;
    }

    public double getRapBaseValue2() {
        return rapBaseValue2;
    }

    public void setRapBaseValue2(double rapBaseValue2) {
        this.rapBaseValue2 = rapBaseValue2;
    }

    public Integer getRapBaseStatus2() {
        return rapBaseStatus2;
    }

    public void setRapBaseStatus2(Integer rapBaseStatus2) {
        this.rapBaseStatus2 = rapBaseStatus2;
    }

    public double getRapBaseRawValue2() {
        return rapBaseRawValue2;
    }

    public void setRapBaseRawValue2(double rapBaseRawValue2) {
        this.rapBaseRawValue2 = rapBaseRawValue2;
    }

    public Integer getRapBaseRawStatus2() {
        return rapBaseRawStatus2;
    }

    public void setRapBaseRawStatus2(Integer rapBaseRawStatus2) {
        this.rapBaseRawStatus2 = rapBaseRawStatus2;
    }

    public double getRapNeedValue2() {
        return rapNeedValue2;
    }

    public void setRapNeedValue2(double rapNeedValue2) {
        this.rapNeedValue2 = rapNeedValue2;
    }

    public Integer getRapNeedStatus2() {
        return rapNeedStatus2;
    }

    public void setRapNeedStatus2(Integer rapNeedStatus2) {
        this.rapNeedStatus2 = rapNeedStatus2;
    }

    public double getRapNeedRawValue2() {
        return rapNeedRawValue2;
    }

    public void setRapNeedRawValue2(double rapNeedRawValue2) {
        this.rapNeedRawValue2 = rapNeedRawValue2;
    }

    public Integer getRapNeedRawStatus2() {
        return rapNeedRawStatus2;
    }

    public void setRapNeedRawStatus2(Integer rapNeedRawStatus2) {
        this.rapNeedRawStatus2 = rapNeedRawStatus2;
    }

    public Long getRapNeedTime2() {
        return rapNeedTime2;
    }

    public void setRapNeedTime2(Long rapNeedTime2) {
        this.rapNeedTime2 = rapNeedTime2;
    }

    public double getRapBaseValue3() {
        return rapBaseValue3;
    }

    public void setRapBaseValue3(double rapBaseValue3) {
        this.rapBaseValue3 = rapBaseValue3;
    }

    public Integer getRapBaseStatus3() {
        return rapBaseStatus3;
    }

    public void setRapBaseStatus3(Integer rapBaseStatus3) {
        this.rapBaseStatus3 = rapBaseStatus3;
    }

    public double getRapBaseRawValue3() {
        return rapBaseRawValue3;
    }

    public void setRapBaseRawValue3(double rapBaseRawValue3) {
        this.rapBaseRawValue3 = rapBaseRawValue3;
    }

    public Integer getRapBaseRawStatus3() {
        return rapBaseRawStatus3;
    }

    public void setRapBaseRawStatus3(Integer rapBaseRawStatus3) {
        this.rapBaseRawStatus3 = rapBaseRawStatus3;
    }

    public double getRapNeedValue3() {
        return rapNeedValue3;
    }

    public void setRapNeedValue3(double rapNeedValue3) {
        this.rapNeedValue3 = rapNeedValue3;
    }

    public Integer getRapNeedStatus3() {
        return rapNeedStatus3;
    }

    public void setRapNeedStatus3(Integer rapNeedStatus3) {
        this.rapNeedStatus3 = rapNeedStatus3;
    }

    public double getRapNeedRawValue3() {
        return rapNeedRawValue3;
    }

    public void setRapNeedRawValue3(double rapNeedRawValue3) {
        this.rapNeedRawValue3 = rapNeedRawValue3;
    }

    public Integer getRapNeedRawStatus3() {
        return rapNeedRawStatus3;
    }

    public void setRapNeedRawStatus3(Integer rapNeedRawStatus3) {
        this.rapNeedRawStatus3 = rapNeedRawStatus3;
    }

    public Long getRapNeedTime3() {
        return rapNeedTime3;
    }

    public void setRapNeedTime3(Long rapNeedTime3) {
        this.rapNeedTime3 = rapNeedTime3;
    }

    public double getRapBaseValue4() {
        return rapBaseValue4;
    }

    public void setRapBaseValue4(double rapBaseValue4) {
        this.rapBaseValue4 = rapBaseValue4;
    }

    public Integer getRapBaseStatus4() {
        return rapBaseStatus4;
    }

    public void setRapBaseStatus4(Integer rapBaseStatus4) {
        this.rapBaseStatus4 = rapBaseStatus4;
    }

    public double getRapBaseRawValue4() {
        return rapBaseRawValue4;
    }

    public void setRapBaseRawValue4(double rapBaseRawValue4) {
        this.rapBaseRawValue4 = rapBaseRawValue4;
    }

    public Integer getRapBaseRawStatus4() {
        return rapBaseRawStatus4;
    }

    public void setRapBaseRawStatus4(Integer rapBaseRawStatus4) {
        this.rapBaseRawStatus4 = rapBaseRawStatus4;
    }

    public double getRapNeedValue4() {
        return rapNeedValue4;
    }

    public void setRapNeedValue4(double rapNeedValue4) {
        this.rapNeedValue4 = rapNeedValue4;
    }

    public Integer getRapNeedStatus4() {
        return rapNeedStatus4;
    }

    public void setRapNeedStatus4(Integer rapNeedStatus4) {
        this.rapNeedStatus4 = rapNeedStatus4;
    }

    public double getRapNeedRawValue4() {
        return rapNeedRawValue4;
    }

    public void setRapNeedRawValue4(double rapNeedRawValue4) {
        this.rapNeedRawValue4 = rapNeedRawValue4;
    }

    public Integer getRapNeedRawStatus4() {
        return rapNeedRawStatus4;
    }

    public void setRapNeedRawStatus4(Integer rapNeedRawStatus4) {
        this.rapNeedRawStatus4 = rapNeedRawStatus4;
    }

    public Long getRapNeedTime4() {
        return rapNeedTime4;
    }

    public void setRapNeedTime4(Long rapNeedTime4) {
        this.rapNeedTime4 = rapNeedTime4;
    }

    public double getRapBaseValue5() {
        return rapBaseValue5;
    }

    public void setRapBaseValue5(double rapBaseValue5) {
        this.rapBaseValue5 = rapBaseValue5;
    }

    public Integer getRapBaseStatus5() {
        return rapBaseStatus5;
    }

    public void setRapBaseStatus5(Integer rapBaseStatus5) {
        this.rapBaseStatus5 = rapBaseStatus5;
    }

    public double getRapBaseRawValue5() {
        return rapBaseRawValue5;
    }

    public void setRapBaseRawValue5(double rapBaseRawValue5) {
        this.rapBaseRawValue5 = rapBaseRawValue5;
    }

    public Integer getRapBaseRawStatus5() {
        return rapBaseRawStatus5;
    }

    public void setRapBaseRawStatus5(Integer rapBaseRawStatus5) {
        this.rapBaseRawStatus5 = rapBaseRawStatus5;
    }

    public double getRapNeedValue5() {
        return rapNeedValue5;
    }

    public void setRapNeedValue5(double rapNeedValue5) {
        this.rapNeedValue5 = rapNeedValue5;
    }

    public Integer getRapNeedStatus5() {
        return rapNeedStatus5;
    }

    public void setRapNeedStatus5(Integer rapNeedStatus5) {
        this.rapNeedStatus5 = rapNeedStatus5;
    }

    public double getRapNeedRawValue5() {
        return rapNeedRawValue5;
    }

    public void setRapNeedRawValue5(double rapNeedRawValue5) {
        this.rapNeedRawValue5 = rapNeedRawValue5;
    }

    public Integer getRapNeedRawStatus5() {
        return rapNeedRawStatus5;
    }

    public void setRapNeedRawStatus5(Integer rapNeedRawStatus5) {
        this.rapNeedRawStatus5 = rapNeedRawStatus5;
    }

    public Long getRapNeedTime5() {
        return rapNeedTime5;
    }

    public void setRapNeedTime5(Long rapNeedTime5) {
        this.rapNeedTime5 = rapNeedTime5;
    }

    public double getPrpBaseValue1() {
        return prpBaseValue1;
    }

    public void setPrpBaseValue1(double prpBaseValue1) {
        this.prpBaseValue1 = prpBaseValue1;
    }

    public Integer getPrpBaseStatus1() {
        return prpBaseStatus1;
    }

    public void setPrpBaseStatus1(Integer prpBaseStatus1) {
        this.prpBaseStatus1 = prpBaseStatus1;
    }

    public double getPrpBaseRawValue1() {
        return prpBaseRawValue1;
    }

    public void setPrpBaseRawValue1(double prpBaseRawValue1) {
        this.prpBaseRawValue1 = prpBaseRawValue1;
    }

    public Integer getPrpBaseRawStatus1() {
        return prpBaseRawStatus1;
    }

    public void setPrpBaseRawStatus1(Integer prpBaseRawStatus1) {
        this.prpBaseRawStatus1 = prpBaseRawStatus1;
    }

    public double getPrpNeedValue1() {
        return prpNeedValue1;
    }

    public void setPrpNeedValue1(double prpNeedValue1) {
        this.prpNeedValue1 = prpNeedValue1;
    }

    public Integer getPrpNeedStatus1() {
        return prpNeedStatus1;
    }

    public void setPrpNeedStatus1(Integer prpNeedStatus1) {
        this.prpNeedStatus1 = prpNeedStatus1;
    }

    public double getPrpNeedRawValue1() {
        return prpNeedRawValue1;
    }

    public void setPrpNeedRawValue1(double prpNeedRawValue1) {
        this.prpNeedRawValue1 = prpNeedRawValue1;
    }

    public Integer getPrpNeedRawStatus1() {
        return prpNeedRawStatus1;
    }

    public void setPrpNeedRawStatus1(Integer prpNeedRawStatus1) {
        this.prpNeedRawStatus1 = prpNeedRawStatus1;
    }

    public Long getPrpNeedTime1() {
        return prpNeedTime1;
    }

    public void setPrpNeedTime1(Long prpNeedTime1) {
        this.prpNeedTime1 = prpNeedTime1;
    }

    public double getPrpBaseValue2() {
        return prpBaseValue2;
    }

    public void setPrpBaseValue2(double prpBaseValue2) {
        this.prpBaseValue2 = prpBaseValue2;
    }

    public Integer getPrpBaseStatus2() {
        return prpBaseStatus2;
    }

    public void setPrpBaseStatus2(Integer prpBaseStatus2) {
        this.prpBaseStatus2 = prpBaseStatus2;
    }

    public double getPrpBaseRawValue2() {
        return prpBaseRawValue2;
    }

    public void setPrpBaseRawValue2(double prpBaseRawValue2) {
        this.prpBaseRawValue2 = prpBaseRawValue2;
    }

    public Integer getPrpBaseRawStatus2() {
        return prpBaseRawStatus2;
    }

    public void setPrpBaseRawStatus2(Integer prpBaseRawStatus2) {
        this.prpBaseRawStatus2 = prpBaseRawStatus2;
    }

    public double getPrpNeedValue2() {
        return prpNeedValue2;
    }

    public void setPrpNeedValue2(double prpNeedValue2) {
        this.prpNeedValue2 = prpNeedValue2;
    }

    public Integer getPrpNeedStatus2() {
        return prpNeedStatus2;
    }

    public void setPrpNeedStatus2(Integer prpNeedStatus2) {
        this.prpNeedStatus2 = prpNeedStatus2;
    }

    public double getPrpNeedRawValue2() {
        return prpNeedRawValue2;
    }

    public void setPrpNeedRawValue2(double prpNeedRawValue2) {
        this.prpNeedRawValue2 = prpNeedRawValue2;
    }

    public Integer getPrpNeedRawStatus2() {
        return prpNeedRawStatus2;
    }

    public void setPrpNeedRawStatus2(Integer prpNeedRawStatus2) {
        this.prpNeedRawStatus2 = prpNeedRawStatus2;
    }

    public Long getPrpNeedTime2() {
        return prpNeedTime2;
    }

    public void setPrpNeedTime2(Long prpNeedTime2) {
        this.prpNeedTime2 = prpNeedTime2;
    }

    public double getPrpBaseValue3() {
        return prpBaseValue3;
    }

    public void setPrpBaseValue3(double prpBaseValue3) {
        this.prpBaseValue3 = prpBaseValue3;
    }

    public Integer getPrpBaseStatus3() {
        return prpBaseStatus3;
    }

    public void setPrpBaseStatus3(Integer prpBaseStatus3) {
        this.prpBaseStatus3 = prpBaseStatus3;
    }

    public double getPrpBaseRawValue3() {
        return prpBaseRawValue3;
    }

    public void setPrpBaseRawValue3(double prpBaseRawValue3) {
        this.prpBaseRawValue3 = prpBaseRawValue3;
    }

    public Integer getPrpBaseRawStatus3() {
        return prpBaseRawStatus3;
    }

    public void setPrpBaseRawStatus3(Integer prpBaseRawStatus3) {
        this.prpBaseRawStatus3 = prpBaseRawStatus3;
    }

    public double getPrpNeedValue3() {
        return prpNeedValue3;
    }

    public void setPrpNeedValue3(double prpNeedValue3) {
        this.prpNeedValue3 = prpNeedValue3;
    }

    public Integer getPrpNeedStatus3() {
        return prpNeedStatus3;
    }

    public void setPrpNeedStatus3(Integer prpNeedStatus3) {
        this.prpNeedStatus3 = prpNeedStatus3;
    }

    public double getPrpNeedRawValue3() {
        return prpNeedRawValue3;
    }

    public void setPrpNeedRawValue3(double prpNeedRawValue3) {
        this.prpNeedRawValue3 = prpNeedRawValue3;
    }

    public Integer getPrpNeedRawStatus3() {
        return prpNeedRawStatus3;
    }

    public void setPrpNeedRawStatus3(Integer prpNeedRawStatus3) {
        this.prpNeedRawStatus3 = prpNeedRawStatus3;
    }

    public Long getPrpNeedTime3() {
        return prpNeedTime3;
    }

    public void setPrpNeedTime3(Long prpNeedTime3) {
        this.prpNeedTime3 = prpNeedTime3;
    }

    public double getPrpBaseValue4() {
        return prpBaseValue4;
    }

    public void setPrpBaseValue4(double prpBaseValue4) {
        this.prpBaseValue4 = prpBaseValue4;
    }

    public Integer getPrpBaseStatus4() {
        return prpBaseStatus4;
    }

    public void setPrpBaseStatus4(Integer prpBaseStatus4) {
        this.prpBaseStatus4 = prpBaseStatus4;
    }

    public double getPrpBaseRawValue4() {
        return prpBaseRawValue4;
    }

    public void setPrpBaseRawValue4(double prpBaseRawValue4) {
        this.prpBaseRawValue4 = prpBaseRawValue4;
    }

    public Integer getPrpBaseRawStatus4() {
        return prpBaseRawStatus4;
    }

    public void setPrpBaseRawStatus4(Integer prpBaseRawStatus4) {
        this.prpBaseRawStatus4 = prpBaseRawStatus4;
    }

    public double getPrpNeedValue4() {
        return prpNeedValue4;
    }

    public void setPrpNeedValue4(double prpNeedValue4) {
        this.prpNeedValue4 = prpNeedValue4;
    }

    public Integer getPrpNeedStatus4() {
        return prpNeedStatus4;
    }

    public void setPrpNeedStatus4(Integer prpNeedStatus4) {
        this.prpNeedStatus4 = prpNeedStatus4;
    }

    public double getPrpNeedRawValue4() {
        return prpNeedRawValue4;
    }

    public void setPrpNeedRawValue4(double prpNeedRawValue4) {
        this.prpNeedRawValue4 = prpNeedRawValue4;
    }

    public Integer getPrpNeedRawStatus4() {
        return prpNeedRawStatus4;
    }

    public void setPrpNeedRawStatus4(Integer prpNeedRawStatus4) {
        this.prpNeedRawStatus4 = prpNeedRawStatus4;
    }

    public Long getPrpNeedTime4() {
        return prpNeedTime4;
    }

    public void setPrpNeedTime4(Long prpNeedTime4) {
        this.prpNeedTime4 = prpNeedTime4;
    }

    public double getPrpBaseValue5() {
        return prpBaseValue5;
    }

    public void setPrpBaseValue5(double prpBaseValue5) {
        this.prpBaseValue5 = prpBaseValue5;
    }

    public Integer getPrpBaseStatus5() {
        return prpBaseStatus5;
    }

    public void setPrpBaseStatus5(Integer prpBaseStatus5) {
        this.prpBaseStatus5 = prpBaseStatus5;
    }

    public double getPrpBaseRawValue5() {
        return prpBaseRawValue5;
    }

    public void setPrpBaseRawValue5(double prpBaseRawValue5) {
        this.prpBaseRawValue5 = prpBaseRawValue5;
    }

    public Integer getPrpBaseRawStatus5() {
        return prpBaseRawStatus5;
    }

    public void setPrpBaseRawStatus5(Integer prpBaseRawStatus5) {
        this.prpBaseRawStatus5 = prpBaseRawStatus5;
    }

    public double getPrpNeedValue5() {
        return prpNeedValue5;
    }

    public void setPrpNeedValue5(double prpNeedValue5) {
        this.prpNeedValue5 = prpNeedValue5;
    }

    public Integer getPrpNeedStatus5() {
        return prpNeedStatus5;
    }

    public void setPrpNeedStatus5(Integer prpNeedStatus5) {
        this.prpNeedStatus5 = prpNeedStatus5;
    }

    public double getPrpNeedRawValue5() {
        return prpNeedRawValue5;
    }

    public void setPrpNeedRawValue5(double prpNeedRawValue5) {
        this.prpNeedRawValue5 = prpNeedRawValue5;
    }

    public Integer getPrpNeedRawStatus5() {
        return prpNeedRawStatus5;
    }

    public void setPrpNeedRawStatus5(Integer prpNeedRawStatus5) {
        this.prpNeedRawStatus5 = prpNeedRawStatus5;
    }

    public Long getPrpNeedTime5() {
        return prpNeedTime5;
    }

    public void setPrpNeedTime5(Long prpNeedTime5) {
        this.prpNeedTime5 = prpNeedTime5;
    }

    public double getRrpBaseValue1() {
        return rrpBaseValue1;
    }

    public void setRrpBaseValue1(double rrpBaseValue1) {
        this.rrpBaseValue1 = rrpBaseValue1;
    }

    public Integer getRrpBaseStatus1() {
        return rrpBaseStatus1;
    }

    public void setRrpBaseStatus1(Integer rrpBaseStatus1) {
        this.rrpBaseStatus1 = rrpBaseStatus1;
    }

    public double getRrpBaseRawValue1() {
        return rrpBaseRawValue1;
    }

    public void setRrpBaseRawValue1(double rrpBaseRawValue1) {
        this.rrpBaseRawValue1 = rrpBaseRawValue1;
    }

    public Integer getRrpBaseRawStatus1() {
        return rrpBaseRawStatus1;
    }

    public void setRrpBaseRawStatus1(Integer rrpBaseRawStatus1) {
        this.rrpBaseRawStatus1 = rrpBaseRawStatus1;
    }

    public double getRrpNeedValue1() {
        return rrpNeedValue1;
    }

    public void setRrpNeedValue1(double rrpNeedValue1) {
        this.rrpNeedValue1 = rrpNeedValue1;
    }

    public Integer getRrpNeedStatus1() {
        return rrpNeedStatus1;
    }

    public void setRrpNeedStatus1(Integer rrpNeedStatus1) {
        this.rrpNeedStatus1 = rrpNeedStatus1;
    }

    public double getRrpNeedRawValue1() {
        return rrpNeedRawValue1;
    }

    public void setRrpNeedRawValue1(double rrpNeedRawValue1) {
        this.rrpNeedRawValue1 = rrpNeedRawValue1;
    }

    public Integer getRrpNeedRawStatus1() {
        return rrpNeedRawStatus1;
    }

    public void setRrpNeedRawStatus1(Integer rrpNeedRawStatus1) {
        this.rrpNeedRawStatus1 = rrpNeedRawStatus1;
    }

    public Long getRrpNeedTime1() {
        return rrpNeedTime1;
    }

    public void setRrpNeedTime1(Long rrpNeedTime1) {
        this.rrpNeedTime1 = rrpNeedTime1;
    }

    public double getRrpBaseValue2() {
        return rrpBaseValue2;
    }

    public void setRrpBaseValue2(double rrpBaseValue2) {
        this.rrpBaseValue2 = rrpBaseValue2;
    }

    public Integer getRrpBaseStatus2() {
        return rrpBaseStatus2;
    }

    public void setRrpBaseStatus2(Integer rrpBaseStatus2) {
        this.rrpBaseStatus2 = rrpBaseStatus2;
    }

    public double getRrpBaseRawValue2() {
        return rrpBaseRawValue2;
    }

    public void setRrpBaseRawValue2(double rrpBaseRawValue2) {
        this.rrpBaseRawValue2 = rrpBaseRawValue2;
    }

    public Integer getRrpBaseRawStatus2() {
        return rrpBaseRawStatus2;
    }

    public void setRrpBaseRawStatus2(Integer rrpBaseRawStatus2) {
        this.rrpBaseRawStatus2 = rrpBaseRawStatus2;
    }

    public double getRrpNeedValue2() {
        return rrpNeedValue2;
    }

    public void setRrpNeedValue2(double rrpNeedValue2) {
        this.rrpNeedValue2 = rrpNeedValue2;
    }

    public Integer getRrpNeedStatus2() {
        return rrpNeedStatus2;
    }

    public void setRrpNeedStatus2(Integer rrpNeedStatus2) {
        this.rrpNeedStatus2 = rrpNeedStatus2;
    }

    public double getRrpNeedRawValue2() {
        return rrpNeedRawValue2;
    }

    public void setRrpNeedRawValue2(double rrpNeedRawValue2) {
        this.rrpNeedRawValue2 = rrpNeedRawValue2;
    }

    public Integer getRrpNeedRawStatus2() {
        return rrpNeedRawStatus2;
    }

    public void setRrpNeedRawStatus2(Integer rrpNeedRawStatus2) {
        this.rrpNeedRawStatus2 = rrpNeedRawStatus2;
    }

    public Long getRrpNeedTime2() {
        return rrpNeedTime2;
    }

    public void setRrpNeedTime2(Long rrpNeedTime2) {
        this.rrpNeedTime2 = rrpNeedTime2;
    }

    public double getRrpBaseValue3() {
        return rrpBaseValue3;
    }

    public void setRrpBaseValue3(double rrpBaseValue3) {
        this.rrpBaseValue3 = rrpBaseValue3;
    }

    public Integer getRrpBaseStatus3() {
        return rrpBaseStatus3;
    }

    public void setRrpBaseStatus3(Integer rrpBaseStatus3) {
        this.rrpBaseStatus3 = rrpBaseStatus3;
    }

    public double getRrpBaseRawValue3() {
        return rrpBaseRawValue3;
    }

    public void setRrpBaseRawValue3(double rrpBaseRawValue3) {
        this.rrpBaseRawValue3 = rrpBaseRawValue3;
    }

    public Integer getRrpBaseRawStatus3() {
        return rrpBaseRawStatus3;
    }

    public void setRrpBaseRawStatus3(Integer rrpBaseRawStatus3) {
        this.rrpBaseRawStatus3 = rrpBaseRawStatus3;
    }

    public double getRrpNeedValue3() {
        return rrpNeedValue3;
    }

    public void setRrpNeedValue3(double rrpNeedValue3) {
        this.rrpNeedValue3 = rrpNeedValue3;
    }

    public Integer getRrpNeedStatus3() {
        return rrpNeedStatus3;
    }

    public void setRrpNeedStatus3(Integer rrpNeedStatus3) {
        this.rrpNeedStatus3 = rrpNeedStatus3;
    }

    public double getRrpNeedRawValue3() {
        return rrpNeedRawValue3;
    }

    public void setRrpNeedRawValue3(double rrpNeedRawValue3) {
        this.rrpNeedRawValue3 = rrpNeedRawValue3;
    }

    public Integer getRrpNeedRawStatus3() {
        return rrpNeedRawStatus3;
    }

    public void setRrpNeedRawStatus3(Integer rrpNeedRawStatus3) {
        this.rrpNeedRawStatus3 = rrpNeedRawStatus3;
    }

    public Long getRrpNeedTime3() {
        return rrpNeedTime3;
    }

    public void setRrpNeedTime3(Long rrpNeedTime3) {
        this.rrpNeedTime3 = rrpNeedTime3;
    }

    public double getRrpBaseValue4() {
        return rrpBaseValue4;
    }

    public void setRrpBaseValue4(double rrpBaseValue4) {
        this.rrpBaseValue4 = rrpBaseValue4;
    }

    public Integer getRrpBaseStatus4() {
        return rrpBaseStatus4;
    }

    public void setRrpBaseStatus4(Integer rrpBaseStatus4) {
        this.rrpBaseStatus4 = rrpBaseStatus4;
    }

    public double getRrpBaseRawValue4() {
        return rrpBaseRawValue4;
    }

    public void setRrpBaseRawValue4(double rrpBaseRawValue4) {
        this.rrpBaseRawValue4 = rrpBaseRawValue4;
    }

    public Integer getRrpBaseRawStatus4() {
        return rrpBaseRawStatus4;
    }

    public void setRrpBaseRawStatus4(Integer rrpBaseRawStatus4) {
        this.rrpBaseRawStatus4 = rrpBaseRawStatus4;
    }

    public double getRrpNeedValue4() {
        return rrpNeedValue4;
    }

    public void setRrpNeedValue4(double rrpNeedValue4) {
        this.rrpNeedValue4 = rrpNeedValue4;
    }

    public Integer getRrpNeedStatus4() {
        return rrpNeedStatus4;
    }

    public void setRrpNeedStatus4(Integer rrpNeedStatus4) {
        this.rrpNeedStatus4 = rrpNeedStatus4;
    }

    public double getRrpNeedRawValue4() {
        return rrpNeedRawValue4;
    }

    public void setRrpNeedRawValue4(double rrpNeedRawValue4) {
        this.rrpNeedRawValue4 = rrpNeedRawValue4;
    }

    public Integer getRrpNeedRawStatus4() {
        return rrpNeedRawStatus4;
    }

    public void setRrpNeedRawStatus4(Integer rrpNeedRawStatus4) {
        this.rrpNeedRawStatus4 = rrpNeedRawStatus4;
    }

    public Long getRrpNeedTime4() {
        return rrpNeedTime4;
    }

    public void setRrpNeedTime4(Long rrpNeedTime4) {
        this.rrpNeedTime4 = rrpNeedTime4;
    }

    public double getRrpBaseValue5() {
        return rrpBaseValue5;
    }

    public void setRrpBaseValue5(double rrpBaseValue5) {
        this.rrpBaseValue5 = rrpBaseValue5;
    }

    public Integer getRrpBaseStatus5() {
        return rrpBaseStatus5;
    }

    public void setRrpBaseStatus5(Integer rrpBaseStatus5) {
        this.rrpBaseStatus5 = rrpBaseStatus5;
    }

    public double getRrpBaseRawValue5() {
        return rrpBaseRawValue5;
    }

    public void setRrpBaseRawValue5(double rrpBaseRawValue5) {
        this.rrpBaseRawValue5 = rrpBaseRawValue5;
    }

    public Integer getRrpBaseRawStatus5() {
        return rrpBaseRawStatus5;
    }

    public void setRrpBaseRawStatus5(Integer rrpBaseRawStatus5) {
        this.rrpBaseRawStatus5 = rrpBaseRawStatus5;
    }

    public double getRrpNeedValue5() {
        return rrpNeedValue5;
    }

    public void setRrpNeedValue5(double rrpNeedValue5) {
        this.rrpNeedValue5 = rrpNeedValue5;
    }

    public Integer getRrpNeedStatus5() {
        return rrpNeedStatus5;
    }

    public void setRrpNeedStatus5(Integer rrpNeedStatus5) {
        this.rrpNeedStatus5 = rrpNeedStatus5;
    }

    public double getRrpNeedRawValue5() {
        return rrpNeedRawValue5;
    }

    public void setRrpNeedRawValue5(double rrpNeedRawValue5) {
        this.rrpNeedRawValue5 = rrpNeedRawValue5;
    }

    public Integer getRrpNeedRawStatus5() {
        return rrpNeedRawStatus5;
    }

    public void setRrpNeedRawStatus5(Integer rrpNeedRawStatus5) {
        this.rrpNeedRawStatus5 = rrpNeedRawStatus5;
    }

    public Long getRrpNeedTime5() {
        return rrpNeedTime5;
    }

    public void setRrpNeedTime5(Long rrpNeedTime5) {
        this.rrpNeedTime5 = rrpNeedTime5;
    }
}