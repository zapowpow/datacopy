package com.lzp.mysql.conventer.pbs2tmr;

import com.lzp.mysql.conventer.mvc.CommService;
import com.lzp.mysql.source.pbsSource.entity.Yc;
import com.lzp.mysql.source.tmrSource.entity.InstantaneousValues;

import java.sql.Timestamp;

public class YcConverter implements Converter<Yc> {

    @Override
    public Object[] convert(Yc s , CommService service) {
        InstantaneousValues mp = new InstantaneousValues();
        mp.setIvName(s.getYcName());
        if (s.getYcNo() != null) {
            mp.setIvAddr(s.getYcNo().intValue());
        }
        if (s.getYcType() != null) {
            mp.setIvType(s.getYcType().shortValue());
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
