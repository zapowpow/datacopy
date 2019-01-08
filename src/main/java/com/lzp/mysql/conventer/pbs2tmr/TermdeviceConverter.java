package com.lzp.mysql.conventer.pbs2tmr;

import com.lzp.mysql.conventer.mvc.CommService;
import com.lzp.mysql.source.pbsSource.entity.TaskConfig;
import com.lzp.mysql.source.pbsSource.entity.Termdevice;
import com.lzp.mysql.source.pbsSource.entity.Terminal;
import com.lzp.mysql.source.tmrSource.entity.Acquireds;
import com.lzp.mysql.source.tmrSource.entity.Ertus;

import java.sql.Timestamp;

public class TermdeviceConverter implements Converter<Termdevice> {

	public Object[] convert(Termdevice term , CommService service) {
		Ertus ertu = new Ertus();
		ertu.setErtuName(term.getTermdeviceName());
		ertu.setErtuId(term.getTermdeviceId());
		if (term.getAddress() != null) {
			ertu.setAddress(term.getAddress().toString());
		}
		if(term.getUserName1()!=null){
			ertu.setUserName(term.getUserName1());
		}
		if (term.getPassword1() != null) {
			ertu.setPassword(term.getPassword1());
		}
		if(term.getStatus()!=null){
			ertu.setStatus(term.getStatus());
		}
		Acquireds acquired = new Acquireds();
		acquired.setAcquiredId(term.getTermdeviceId());

		if (term.getTerminalId() != null && term.getTerminalId() > 0) {
			Terminal t = (Terminal) service.findById(Terminal.class, term.getTerminalId());
			if (t != null) {
				if (t.getTaskConfigId() != null && t.getTaskConfigId() > 0) {
					TaskConfig config = (TaskConfig) service.findById(TaskConfig.class, t.getTaskConfigId());
					if (config != null) {
						acquired.setAcquireInterval(config.getTaskInterval());
						acquired.setInitialDelay(config.getTaskIntervalOffset());
					}
				}
				if (t.getFacId() != null && t.getFacId() > 0) {
						acquired.setParentId(t.getFacId());
				}
				if(t.getPri()!=null){
					acquired.setPri(t.getPri());
				}
				if(t.getCurStatus()!=null){
					acquired.setCurStatus(t.getCurStatus());
				}
				acquired.setLastAcquireTime(new Timestamp(System.currentTimeMillis()));
				ertu.setAcquiredId(acquired.getAcquiredId());
			}
		}
		return new Object[] { ertu, acquired };
	}
}
