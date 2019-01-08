package com.lzp.mysql.source.tmrSource.entity;

import javax.persistence.*;

@Entity
@Table(name = "comm_params")
public class CommParams{
	private Long commParamId;
	private String commParamName;
	private Integer baudRate;
	private Short parityBit;
	private Short stopBit;
	private Integer carrierCtrl;
	private Short dataBit;
	private Integer txfifo;
	private Integer rtsCts;
	private Integer xonOff;
	private Integer disconCtrl;
	private Integer portType;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMM_PARAM_ID", unique = true, nullable = false)
	public Long getCommParamId() {
		return this.commParamId;
	}

	public void setCommParamId(Long commParamId) {
		this.commParamId = commParamId;
	}

	@Column(name = "COMM_PARAM_NAME", nullable = false, length = 64)
	public String getCommParamName() {
		return this.commParamName;
	}

	public void setCommParamName(String commParamName) {
		this.commParamName = commParamName;
	}

	@Column(name = "BAUD_RATE")
	public Integer getBaudRate() {
		return this.baudRate;
	}

	public void setBaudRate(Integer baudRate) {
		this.baudRate = baudRate;
	}

	@Column(name = "PARITY_BIT")
	public Short getParityBit() {
		return this.parityBit;
	}

	public void setParityBit(Short parityBit) {
		this.parityBit = parityBit;
	}

	@Column(name = "STOP_BIT")
	public Short getStopBit() {
		return this.stopBit;
	}

	public void setStopBit(Short stopBit) {
		this.stopBit = stopBit;
	}

	@Column(name = "CARRIER_CTRL")
	public Integer getCarrierCtrl() {
		return this.carrierCtrl;
	}

	public void setCarrierCtrl(Integer carrierCtrl) {
		this.carrierCtrl = carrierCtrl;
	}

	@Column(name = "DATA_BIT")
	public Short getDataBit() {
		return this.dataBit;
	}

	public void setDataBit(Short dataBit) {
		this.dataBit = dataBit;
	}

	@Column(name = "TXFIFO")
	public Integer getTxfifo() {
		return this.txfifo;
	}

	public void setTxfifo(Integer txfifo) {
		this.txfifo = txfifo;
	}

	@Column(name = "RTS_CTS")
	public Integer getRtsCts() {
		return this.rtsCts;
	}

	public void setRtsCts(Integer rtsCts) {
		this.rtsCts = rtsCts;
	}

	@Column(name = "XON_OFF")
	public Integer getXonOff() {
		return this.xonOff;
	}

	public void setXonOff(Integer xonOff) {
		this.xonOff = xonOff;
	}

	@Column(name = "DISCON_CTRL")
	public Integer getDisconCtrl() {
		return this.disconCtrl;
	}

	public void setDisconCtrl(Integer disconCtrl) {
		this.disconCtrl = disconCtrl;
	}

	@Column(name = "PORT_TYPE")
	public Integer getPortType() {
		return portType;
	}

	public void setPortType(Integer portType) {
		this.portType = portType;
	}

}