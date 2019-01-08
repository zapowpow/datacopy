package com.lzp.mysql.source.unit;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/11/8 10:40
 * @Description: 时间戳反序列化
 */

public class TimestampDeserializer extends JsonDeserializer<Timestamp> {
    public static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Timestamp deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            Timestamp timestamp = new Timestamp(format.parse(jsonParser.getText()).getTime());
            return timestamp;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}