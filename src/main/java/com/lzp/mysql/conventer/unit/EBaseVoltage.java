package com.lzp.mysql.conventer.unit;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "BaseVoltage", namespace = "service.axe.njcp.net")
public enum EBaseVoltage {

	UNKNOWN(0), AC1000kV(1), AC800kV(2), DC800kV(3), AC750kV(4), DC660kV(5), AC500kV(
			6), DC500kV(7), AC400kV(8), AC330kV(9), AC220kV(10), DC120kV(11), AC110kV(
			12), AC66kV(13), AC35kV(14), AC20kV(15), AC15kV(16), AC13kV(17), AC10kV(
			18), AC6kV(19), AC380V(20), AC220V(21), AC100V(22), DC6V(23), DC12V(
			24), DC36V(25), DC110V(26), DC220V(27), DC48V(28), DC750V(29), DC3000V(
			30), DC600V(31), DC1500V(32), AC6V(33), AC12V(34), AC36V(35), AC110V(
			36), AC48V(37), AC660V(38), AC750V(39), AC1500V(40), AC3000V(41), AC2500V(
			42), AC3kV(43), DC24V(44), AC24V(45), AC1000V(46), AC600V(47);
	private int value;

	EBaseVoltage(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return name();
	}
}
