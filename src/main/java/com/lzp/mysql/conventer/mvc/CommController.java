package com.lzp.mysql.conventer.mvc;

import com.lzp.mysql.conventer.pbs2tmr.*;
import com.lzp.mysql.source.pbsSource.entity.*;
import com.lzp.mysql.source.tmrSource.entity.*;
import com.lzp.mysql.source.unit.Constant;
import com.lzp.mysql.source.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/12/21 14:58
 * @Description:
 */
@RestController
public class CommController {
    @Autowired
    public CommService service;


    @RequestMapping("findById")
    public Result findById() {
        Yc channel =  (Yc)service.findById(Yc.class,(long)105017434);
        return new Result(Constant.MethodResult.SUCCESS.getMethodResult(), channel);
    }

    @RequestMapping("channel")
    public Result channel() {
        List<Channel> channels = (List<Channel>) service.findAll(Channel.class);
        List<Object> objs = new ArrayList<>();
        for (Channel channel : channels) {
            Converter<Channel> channelConverter = new ChannelConverter();
            Object[] obj = channelConverter.convert(channel, service);
            objs.addAll(new ArrayList<>(Arrays.asList(obj)));
        }
        return new Result(Constant.MethodResult.SUCCESS.getMethodResult(), service.tmrSave(objs));
    }

    @RequestMapping("ipFour")
    public Result ipFour() {
        List<IpFour> ipFours = (List<IpFour>) service.findAll(IpFour.class);
        List<Object> objs = new ArrayList<>();
        for(IpFour ipFour :ipFours){
            Converter<IpFour> ipFourConverter = new IpFourConverter();
            Object[] obj = ipFourConverter.convert(ipFour, service);
            objs.addAll(new ArrayList<>(Arrays.asList(obj)));
        }
        return new Result(Constant.MethodResult.SUCCESS.getMethodResult(),service.tmrSave(objs));
    }

    @RequestMapping("meter")
    public Result meter() {
        List<Meter> meters = (List<Meter>) service.findAll(Meter.class);
        List<Object> objs = new ArrayList<>();
        for (Meter meter : meters) {
            Converter<Meter> meterConverter = new MeterConverter();
            Object[] obj = meterConverter.convert(meter, service);
            objs.addAll(new ArrayList<>(Arrays.asList(obj)));
        }
        return new Result(Constant.MethodResult.SUCCESS.getMethodResult(), service.tmrSave(objs));
    }

    @RequestMapping("pulse")
    public Result pulse() {
        List<Pulse> pulses = (List<Pulse>) service.findAll(Pulse.class);
        List<Object> objs = new ArrayList<>();
        for(Pulse pulse :pulses){
            Converter<Pulse> meterConverter = new PulseConverter();
            Object[] obj = meterConverter.convert(pulse, service);
            objs.addAll(new ArrayList<>(Arrays.asList(obj)));
        }
        return new Result(Constant.MethodResult.SUCCESS.getMethodResult(),service.tmrSave(objs));
    }

    @RequestMapping("termdevice")
    public Result termdevice() {
        List<Termdevice> termdevices = (List<Termdevice>) service.findAll(Termdevice.class);
        List<Object> objs = new ArrayList<>();
        for(Termdevice termdevice :termdevices){
            Converter<Termdevice> termdeviceConverter = new TermdeviceConverter();
            Object[] obj = termdeviceConverter.convert(termdevice, service);
            objs.addAll(new ArrayList<>(Arrays.asList(obj)));
        }
        return new Result(Constant.MethodResult.SUCCESS.getMethodResult(),service.tmrSave(objs));
    }

    @RequestMapping("yc")
    public Result yc() {
        List<Yc> ycs = (List<Yc>) service.findAll(Yc.class);
        List<Object> objs = new ArrayList<>();
        for(Yc yc :ycs){
            Converter<Yc> meterConverter = new YcConverter();
            Object[] obj = meterConverter.convert(yc, service);
            objs.addAll(new ArrayList<>(Arrays.asList(obj)));
        }
        return new Result(Constant.MethodResult.SUCCESS.getMethodResult(),service.tmrSave(objs));
    }

    @RequestMapping("check")
    public String check() {
//        List<Channel> channels = (List<Channel>) service.findAll(Channel.class);
//        List<ChannelGroup> channelGroups = (List<ChannelGroup>) service.findAll(ChannelGroup.class);
//        List<CommParam> commParams = (List<CommParam>) service.findAll(CommParam.class);
//        List<Factory> factories = (List<Factory>) service.findAll(Factory.class);
//        List<IpFour> ipFours = (List<IpFour>) service.findAll(IpFour.class);
//        List<Meter> meters = (List<Meter>) service.findAll(Meter.class);
//        List<Pulse> pulses = (List<Pulse>) service.findAll(Pulse.class);
//        List<TaskConfig> taskConfigs = (List<TaskConfig>) service.findAll(TaskConfig.class);
//        List<Termdevice> termdevices = (List<Termdevice>) service.findAll(Termdevice.class);
//        List<Terminal> terminals = (List<Terminal>) service.findAll(Terminal.class);
//        List<Yc> ycs = (List<Yc>) service.findAll(Yc.class);

        String check = "";

        Long pbsTermdevice = (Long) service.getColumn(Termdevice.class);
        Long acquireds = (Long) service.getColumn(Acquireds.class);
        Long ertus = (Long) service.getColumn(Ertus.class);

        Long pbsIpFour = (Long) service.getColumn(IpFour.class);
        Long reactivePulses = (Long) service.getColumn(ReactivePulses.class);

        Long pbsPulse = (Long) service.getColumn(Pulse.class);
        Long pulses = (Long) service.getColumn(Pulses.class);

        Long pbsYc = (Long) service.getColumn(Yc.class);
        Long instantaneousValues = (Long)service.getColumn(InstantaneousValues.class);

        Long pbsMeter = (Long) service.getColumn(Meter.class);
        Long meters = (Long) service.getColumn(Meters.class);

        if(pbsTermdevice.equals(acquireds)&&pbsTermdevice.equals(ertus)){
            check=check+"pbsTermdevice:true  </p>";
        }else {
            check=check+"pbsTermdevice:"+pbsTermdevice+"-"+acquireds+"-"+ertus+"</p>";
        }

        if(pbsIpFour.equals(reactivePulses)){
            check=check+"pbsIpFour:true </p>";
        }else {
            check=check+"pbsIpFour:"+pbsIpFour+"-"+reactivePulses+"</p>";
        }

        if(pbsPulse.equals(pulses)){
            check=check+"pbsPulse:true </p>";
        }else {
            check=check+"pbsPulse:"+pbsPulse+"-"+pulses+"</p>";
        }

        if(pbsYc.equals(instantaneousValues)){
            check=check+"pbsYc:true  </p>";
        }else {
            check=check+"pbsYc:"+pbsYc+"-"+instantaneousValues+"</p>";
        }

        if(pbsMeter.equals(meters)){
            check=check+"pbsMeter:true </p>";
        }else {
            check=check+"pbsMeter:"+pbsMeter+"-"+meters+"</p>";
        }
        return check;
    }
}