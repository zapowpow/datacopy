package com.lzp.mysql.conventer.pbs2tmr;

import com.lzp.mysql.conventer.mvc.CommService;
import com.lzp.mysql.source.pbsSource.entity.CommParam;
import com.lzp.mysql.source.tmrSource.entity.CommParams;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2019/1/9 9:59
 * @Description:
 */

public class CommParamConverter implements Converter<CommParam> {

    @Override
    public Object[] convert(CommParam commParam, CommService service) {
        CommParams commParams = new CommParams();
        commParams.setCommParamId(commParam.getCommParamId());
        if(commParam.getCommParamName()!=null){
            commParams.setCommParamName(commParam.getCommParamName());
        }
        if(commParam.getBaudRate()!=null){
            commParams.setBaudRate(commParam.getBaudRate());
        }
        if(commParam.getParityBit()!=null){
            commParams.setParityBit(commParam.getParityBit());
        }
        if(commParam.getStopBit()!=null){
            commParams.setStopBit(commParam.getStopBit());
        }
        if(commParam.getCarrierCtrl()!=null){
            commParams.setCarrierCtrl(commParam.getCarrierCtrl());
        }
        if(commParam.getDataBit()!=null){
            commParams.setDataBit(commParam.getDataBit());
        }
        if(commParam.getTxfifo()!=null){
            commParams.setTxfifo(commParam.getTxfifo());
        }
        if(commParam.getXonOff()!=null){
            commParams.setXonOff(commParam.getXonOff());
        }
        return new Object[]{commParams};
    }
}