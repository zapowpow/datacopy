package com.lzp.mysql.conventer.pbs2tmr;

import com.lzp.mysql.conventer.mvc.CommService;

public interface  Converter<S> {
	Object[] convert(S s ,CommService service);
}
