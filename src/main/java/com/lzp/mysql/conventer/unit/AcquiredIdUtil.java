package com.lzp.mysql.conventer.unit;

import com.lzp.mysql.conventer.mvc.CommService;
import com.lzp.mysql.source.pbsSource.entity.*;
import com.lzp.mysql.source.tmrSource.entity.Acquireds;

import java.util.List;

public class AcquiredIdUtil{
	public static Long acquiredIdGetter(Channel ch, CommService service) {
		List<?> list1 = service.pbsFindBy(ChannelGroup.class,"channelId1",ch.getChannelId());
		if(list1 !=null && !list1.isEmpty()){
			ChannelGroup cg = (ChannelGroup) list1.get(0);
			List<?> list2 = service.pbsFindBy(Terminal.class,"terminalId",cg.getTerminalId());
			if(list2 != null && !list2.isEmpty()){
				Terminal t = (Terminal) list2.get(0);
				List<?> list3 = service.pbsFindBy(Termdevice.class,"terminalId",t.getTerminalId());
				if(list3 != null && !list3.isEmpty()){
					Termdevice td = (Termdevice) list3.get(0);
//					List<?> list4 = service.pbsFindBy(TmnlRun.class,"other1Id",td.getTermdeviceId());
//					if(list4 != null && !list4.isEmpty()){
//						TmnlRun tr = (TmnlRun) list4.get(0);
//						List<?> list5 = service.tmrFindBy(Acquireds.class,"acquiredName",tr.getName());
//						if(list5 != null && !list4.isEmpty()){
//							Acquireds a = (Acquireds) list5.get(0);
//							return a.getAcquiredId();
//						}
//					}
					return td.getTermdeviceId();
				}

			}
		}
		return null;
	}
}


