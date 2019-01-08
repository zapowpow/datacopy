package com.lzp.mysql.conventer.pbs2tmr;

import com.lzp.mysql.conventer.mvc.CommService;
import com.lzp.mysql.source.pbsSource.entity.Meter;
import com.lzp.mysql.source.tmrSource.entity.Acquireds;
import com.lzp.mysql.source.tmrSource.entity.Measurements;
import com.lzp.mysql.source.tmrSource.entity.Meters;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class MeterConverter implements Converter<Meter> {

	@Override
	public Object[] convert(Meter meter , CommService service) {
		Meters m = new Meters();
		m.setMeterName(meter.getMeterName());
		m.setMeterId(meter.getMeterId());

		if (meter.getMeterSerial() != null) {
			m.setMeterSerial(meter.getMeterSerial().shortValue());
		}
		if (meter.getMeterNo() != null) {
			m.setMeterNo(meter.getMeterNo());
		}
		if (meter.getMeterAddr() != null) {
			m.setMeterAddr(meter.getMeterAddr().toString());
		}
		if (meter.getIsInUse() != null) {
			m.setIsInUse(meter.getIsInUse());
		}
		if(meter.getStatus()!=null){
			m.setStatus(meter.getStatus());
		}
		if(meter.getManufactureId()!=null){
			m.setManufactureId(meter.getManufactureId());
		}
		if(meter.getManufactureDate()!=null){
			m.setManufactureDate(new Date(meter.getManufactureDate()));
		}
		if(meter.getInUseTime()!=null){
			m.setInUseTime(new Timestamp(meter.getInUseTime()));
		}
		// 关联CTPT
		m.setCt1(meter.getCt1());
		m.setPt1(meter.getPt1());
		m.setCt2(meter.getCt2());
		m.setPt2(meter.getPt2());

		if (meter.getDevId() != null && meter.getDevId() > 0) {
			// 关联设备
            List<?> list = service.findBy(Measurements.class,"devId",meter.getDevId());
			if (list != null && !list.isEmpty()) {
				Measurements measurements = (Measurements) list.get(0);
				m.setMeasId(measurements.getMeasId());
			}
		}
		if (meter.getTerminalId() != null && meter.getTerminalId() > 0) {
			// 关联终端
            String s = service.query("select td.termdeviceId from Termdevice as td where td.terminalId="+meter.getTerminalId()).toString().replace("[","(").replace("]",")");
			List<?> list = service.query("select t from Acquireds t where t.id in "+s);
			if (list != null && !list.isEmpty()) {
				Acquireds t = (Acquireds) list.get(0);
				m.setAcquiredId(t.getAcquiredId());
			}
		}
		return new Object[] { m };
	}
}
