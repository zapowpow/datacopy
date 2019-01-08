package com.lzp.mysql.conventer.unit;

public final class ConverterUtils {

	public static EBaseVoltage volType2BV(int volType) {
		switch (volType) {
		case 1:
			return EBaseVoltage.AC10kV;
		case 2:
			return EBaseVoltage.AC35kV;
		case 3:
			return EBaseVoltage.AC110kV;
		case 4:
			return EBaseVoltage.AC220kV;
		case 5:
			return EBaseVoltage.AC330kV;
		case 6:
			return EBaseVoltage.AC500kV;
		case 7:
			return EBaseVoltage.AC750kV;
		case 8:
			return EBaseVoltage.AC1000kV;
		case 9:
			return EBaseVoltage.AC6kV;
		case 10:
			return EBaseVoltage.AC100V;
		case 11:
			return EBaseVoltage.AC66kV;
		default:
			return EBaseVoltage.UNKNOWN;
		}
	}

	public static EBaseVoltage volType2BV(String voltCode) {
		if (voltCode.equalsIgnoreCase("AC00031")) {
			return EBaseVoltage.AC3kV;
		} else if (voltCode.equalsIgnoreCase("AC07501")) {
			return EBaseVoltage.AC750kV;
		} else if (voltCode.equalsIgnoreCase("AC10001")) {
			return EBaseVoltage.AC1000kV;
		} else if (voltCode.equalsIgnoreCase("DC00062")) {
			return EBaseVoltage.DC6V;
		} else if (voltCode.equalsIgnoreCase("DC00122")) {
			return EBaseVoltage.DC12V;
		} else if (voltCode.equalsIgnoreCase("DC00242")) {
			return EBaseVoltage.DC24V;
		} else if (voltCode.equalsIgnoreCase("DC00362")) {
			return EBaseVoltage.DC36V;
		} else if (voltCode.equalsIgnoreCase("DC01102")) {
			return EBaseVoltage.DC110V;
		} else if (voltCode.equalsIgnoreCase("DC02202")) {
			return EBaseVoltage.DC220V;
		} else if (voltCode.equalsIgnoreCase("DC05001")) {
			return EBaseVoltage.DC500kV;
		} else if (voltCode.equalsIgnoreCase("DC00482")) {
			return EBaseVoltage.DC48V;
		} else if (voltCode.equalsIgnoreCase("DC08001")) {
			return EBaseVoltage.DC800kV;
		} else if (voltCode.equalsIgnoreCase("DC07502")) {
			return EBaseVoltage.DC750V;
		} else if (voltCode.equalsIgnoreCase("DC30002")) {
			return EBaseVoltage.DC3000V;
		} else if (voltCode.equalsIgnoreCase("AC00062")) {
			return EBaseVoltage.AC6V;
		} else if (voltCode.equalsIgnoreCase("AC00122")) {
			return EBaseVoltage.AC12V;
		} else if (voltCode.equalsIgnoreCase("AC00242")) {
			return EBaseVoltage.AC24V;
		} else if (voltCode.equalsIgnoreCase("AC00362")) {
			return EBaseVoltage.AC36V;
		} else if (voltCode.equalsIgnoreCase("AC00482")) {
			return EBaseVoltage.AC48V;
		} else if (voltCode.equalsIgnoreCase("AC01102")) {
			return EBaseVoltage.AC110V;
		} else if (voltCode.equalsIgnoreCase("AC06602")) {
			return EBaseVoltage.AC660V;
		} else if (voltCode.equalsIgnoreCase("AC10002")) {
			return EBaseVoltage.AC1000V;
		} else if (voltCode.equalsIgnoreCase("AC06002")) {
			return EBaseVoltage.AC600V;
		} else if (voltCode.equalsIgnoreCase("AC07502")) {
			return EBaseVoltage.AC750V;
		} else if (voltCode.equalsIgnoreCase("AC15002")) {
			return EBaseVoltage.AC1500V;
		} else if (voltCode.equalsIgnoreCase("AC30002")) {
			return EBaseVoltage.AC3000V;
		} else if (voltCode.equalsIgnoreCase("AC25002")) {
			return EBaseVoltage.AC2500V;
		} else if (voltCode.equalsIgnoreCase("AC03301")) {
			return EBaseVoltage.AC330kV;
		} else if (voltCode.equalsIgnoreCase("AC00061")) {
			return EBaseVoltage.AC6kV;
		} else if (voltCode.equalsIgnoreCase("AC00101")) {
			return EBaseVoltage.AC10kV;
		} else if (voltCode.equalsIgnoreCase("AC00201")) {
			return EBaseVoltage.AC20kV;
		} else if (voltCode.equalsIgnoreCase("AC00351")) {
			return EBaseVoltage.AC35kV;
		} else if (voltCode.equalsIgnoreCase("AC00661")) {
			return EBaseVoltage.AC66kV;
		} else if (voltCode.equalsIgnoreCase("AC01101")) {
			return EBaseVoltage.AC110kV;
		} else if (voltCode.equalsIgnoreCase("AC02201")) {
			return EBaseVoltage.AC220kV;
		} else if (voltCode.equalsIgnoreCase("AC03802")) {
			return EBaseVoltage.AC380V;
		} else if (voltCode.equalsIgnoreCase("AC05001")) {
			return EBaseVoltage.AC500kV;
		} else if (voltCode.equalsIgnoreCase("AC02202")) {
			return EBaseVoltage.AC220V;
		} else if (voltCode.equalsIgnoreCase("DC06002")) {
			return EBaseVoltage.DC600V;
		} else if (voltCode.equalsIgnoreCase("DC15002")) {
			return EBaseVoltage.DC1500V;
		}
		return EBaseVoltage.UNKNOWN;
	}
}
