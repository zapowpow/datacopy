package com.lzp.mysql.source.unit;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/12/26 10:49
 * @Description: 标准时间反序列化
 */

public class DateJsonDeserializer extends JsonDeserializer<Date> {
    public static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return format.parse(jsonParser.getText());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}