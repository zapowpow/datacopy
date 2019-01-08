package com.lzp.mysql.conventer.pbs2tmr;


import com.lzp.mysql.conventer.mvc.CommService;
import com.lzp.mysql.conventer.unit.AcquiredIdUtil;
import com.lzp.mysql.conventer.unit.NetworksofIp2;
import com.lzp.mysql.source.pbsSource.entity.Channel;
import com.lzp.mysql.source.tmrSource.entity.Ddns;
import com.lzp.mysql.source.tmrSource.entity.Dials;
import com.lzp.mysql.source.tmrSource.entity.Networks;

import java.sql.Timestamp;

public class ChannelConverter implements Converter<Channel> {
	@Override
	public Object[] convert(Channel ch , CommService service) {
		if(ch.getChannelType() == 1){
			Networks nw = new Networks();
			if(ch.getProtocolId() != null){
				nw.setProtocolId(ch.getProtocolId());
			}
			nw.setChannelName(ch.getChannelName());
			if(ch.getChannelStatus() != null){
				nw.setStatus(ch.getChannelStatus());
			}
			if(ch.getIpAddress1() != null){
				nw.setIpAddress(ch.getIpAddress1());
			}
			if(ch.getIpPort1() !=null){
				nw.setIpPort(ch.getIpPort1().intValue());
			}
			nw.setCommTimeTag(new Timestamp(ch.getCommTimeTag()));
			nw.setAcquiredId(AcquiredIdUtil.acquiredIdGetter(ch,service));   //获得采集点ID

			if(ch.getIpAddress2() != null){  // ipaddress2不为空时 生成另一条记录
				return new Object[]{nw,NetworksofIp2.handle(ch,service)};
			}
			return new Object[] { nw };
		}else if(ch.getChannelType() == 19 || ch.getChannelType() == 35 || 
				ch.getChannelType() == 51 || ch.getChannelType() == 67){
			    Dials ds = new Dials();
			    ds.setChannelName(ch.getChannelName());
			    ds.setCommTimeTag(new Timestamp(ch.getCommTimeTag()));
			    ds.setAcquiredId(AcquiredIdUtil.acquiredIdGetter(ch,service));
			    return new Object[] { ds };
			}else{
				Ddns ddns = new Ddns();
				ddns.setChannelName(ch.getChannelName());
				ddns.setAcquiredId(AcquiredIdUtil.acquiredIdGetter(ch,service));
				ddns.setCommTimeTag(new Timestamp(ch.getCommTimeTag()));
				return new Object[] { ddns };
			}
	}
}