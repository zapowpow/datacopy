package com.lzp.mysql.conventer.pbs2tmr;


import com.lzp.mysql.conventer.mvc.CommService;
import com.lzp.mysql.source.pbsSource.entity.Pulse;
import com.lzp.mysql.source.tmrSource.entity.Pulses;

import java.sql.Timestamp;

public class PulseConverter implements Converter<Pulse> {

    @Override
    public Object[] convert(Pulse s, CommService service) {
        // TODO Auto-generated method stub
        Pulses mp = new Pulses();
        mp.setPulseName(s.getPulseName());
        if (s.getPulseNo() != null) {
            mp.setPulseAddr(s.getPulseNo().intValue());
        }
        if (s.getPulseType() != null) {
            mp.setPulseType(s.getPulseType().shortValue());
        }
        if (s.getMeterId() != null) {
            mp.setMeterId(s.getMeterId());
        }
        if(s.getIsLimitValid()!=null){
            mp.setIsLimitValid(s.getIsLimitValid());
        }
        if(s.getLimitValidInterval()!=null){
            mp.setLimitValidInterval(s.getIsLimitValid());
        }
        if(s.getLowLimit()!=null){
            mp.setLowLimit((double)s.getLowLimit());
        }
        if(s.getUpLimit()!=null){
            mp.setUpLimit((double)s.getUpLimit());
        }
        if(s.getLimitValidTimeTag()!=null){
            mp.setLimitValidTimeTag(new Timestamp(s.getLimitValidTimeTag()));
        }
        return new Object[]{mp};
    }
}
