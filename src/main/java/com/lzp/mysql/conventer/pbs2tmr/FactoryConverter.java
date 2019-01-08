package com.lzp.mysql.conventer.pbs2tmr;

import com.lzp.mysql.conventer.unit.ConverterUtils;
import com.lzp.mysql.conventer.unit.EBaseVoltage;
import com.lzp.mysql.conventer.mvc.CommService;
import com.lzp.mysql.source.pbsSource.entity.Factory;
import com.lzp.mysql.source.tmrSource.entity.Substation;

public class FactoryConverter implements Converter<Factory> {

	public Object[] convert(Factory factory , CommService service) {
		Substation st = new Substation();
//		st.setName(factory.getFacName());
//		st.setId(factory.getFacId());
		if (factory.getHighVolType() != null) {
			EBaseVoltage bv = ConverterUtils.volType2BV(factory.getHighVolType().intValue());
			st.setBvId(new Long(bv.getValue()));
		}

		if (factory.getAreaId() != null) {
			st.setSubareaId(factory.getAreaId());
		}

		return new Object[] { st };
	}
}
