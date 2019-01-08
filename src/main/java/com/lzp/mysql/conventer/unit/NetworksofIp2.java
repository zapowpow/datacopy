package com.lzp.mysql.conventer.unit;

import com.lzp.mysql.conventer.mvc.CommService;
import com.lzp.mysql.source.pbsSource.entity.Channel;
import com.lzp.mysql.source.tmrSource.entity.Networks;

import java.sql.Timestamp;

public class NetworksofIp2 {
	public static Object handle(Channel ch , CommService service) {
		Networks nw = new Networks();
		nw.setProtocolId(ch.getProtocolId());
		nw.setChannelName(ch.getChannelName());
		nw.setStatus(ch.getChannelStatus());
		nw.setIpAddress(ch.getIpAddress2());
		nw.setIpPort(ch.getIpPort2().intValue());
		nw.setCommTimeTag(new Timestamp(ch.getCommTimeTag()));
		nw.setAcquiredId(AcquiredIdUtil.acquiredIdGetter(ch,service));
		return nw;
	}
}
