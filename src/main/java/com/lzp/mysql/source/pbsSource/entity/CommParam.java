package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/12/25 16:44
 * @Description:
 */
@Entity
@Table(name = "comm_param")
public class CommParam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMM_PARAM_ID", unique = true, nullable = false, precision = 20)
    private Long commParamId;
    @Column(name = "COMM_PARAM_NAME", nullable = false, length = 64)
    private String commParamName;
    @Column(name = "DDN_PARAM", nullable = false, length = 64)
    private String ddnParam;
    @Column(name = "BAUD_RATE", nullable = false, length = 10)
    private Integer baudRate;
    @Column(name = "PARITY_BIT", nullable = false, length = 6)
    private Short parityBit;
    @Column(name = "STOP_BIT", nullable = false, length = 6)
    private Short stopBit;
    @Column(name = "CARRIER_CTRL", nullable = false, length = 10)
    private Integer carrierCtrl;
    @Column(name = "DATA_BIT", nullable = false, length = 6)
    private Short dataBit;
    @Column(name = "TXFIFO", nullable = false, length = 10)
    private Integer txfifo;

    public Long getCommParamId() {
        return commParamId;
    }

    public void setCommParamId(Long commParamId) {
        this.commParamId = commParamId;
    }

    public String getCommParamName() {
        return commParamName;
    }

    public void setCommParamName(String commParamName) {
        this.commParamName = commParamName;
    }

    public String getDdnParam() {
        return ddnParam;
    }

    public void setDdnParam(String ddnParam) {
        this.ddnParam = ddnParam;
    }

    public Integer getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(Integer baudRate) {
        this.baudRate = baudRate;
    }

    public Short getParityBit() {
        return parityBit;
    }

    public void setParityBit(Short parityBit) {
        this.parityBit = parityBit;
    }

    public Short getStopBit() {
        return stopBit;
    }

    public void setStopBit(Short stopBit) {
        this.stopBit = stopBit;
    }

    public Integer getCarrierCtrl() {
        return carrierCtrl;
    }

    public void setCarrierCtrl(Integer carrierCtrl) {
        this.carrierCtrl = carrierCtrl;
    }

    public Short getDataBit() {
        return dataBit;
    }

    public void setDataBit(Short dataBit) {
        this.dataBit = dataBit;
    }

    public Integer getTxfifo() {
        return txfifo;
    }

    public void setTxfifo(Integer txfifo) {
        this.txfifo = txfifo;
    }
}