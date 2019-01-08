package com.lzp.mysql.conventer.pbs2tmr;


import com.lzp.mysql.conventer.mvc.CommService;
import com.lzp.mysql.source.pbsSource.entity.IpFour;
import com.lzp.mysql.source.tmrSource.entity.ReactivePulses;

import java.sql.Timestamp;

public class IpFourConverter implements Converter<IpFour> {


    @Override
    public Object[] convert(IpFour s , CommService service) {
        ReactivePulses mp = new ReactivePulses();
        mp.setRpName(s.getIpName());
        if (s.getIpNo() != null) {
            mp.setAddress(s.getIpNo().intValue());
        }
        if (s.getIpType() != null) {
            mp.setRpType(s.getIpType().shortValue());
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
        return new Object[] { mp };
    }

}
