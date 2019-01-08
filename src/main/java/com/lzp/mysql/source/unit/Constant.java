package com.lzp.mysql.source.unit;

/**
 * @Author: liutuo
 * @Description: 被Result类调用，controller返回Json的格式,
 * @Company: 上海博般数据技术有限公司
 * @Date: Created in 12:45 2018/4/8.
 */
public class Constant {

    public enum ErrorCode {
        //未发生异常
        NOEXCEPTION(0),
        //发生异常
        EXCEPTION(1);

        private final int code;

        private ErrorCode(int code) {
            this.code = code;
        }

        public int getErrorCode() {
            return code;
        }
    }

    public enum MethodResult {
        //成功
        SUCCESS("success"),
        //失败
        FAIL("fail");

        private final String keyName;

        private MethodResult(String keyName) {
            this.keyName = keyName;
        }

        public String getMethodResult() {
            return keyName;
        }
    }

    public enum ResultType {
        //布尔类型
        B00("boo"),
        //对象
        OBJ("obj"),
        //数组
        ARRAY("array");


        private final String keyName;

        private ResultType(String keyName) {
            this.keyName = keyName;
        }

        public String getResultType() {
            return keyName;
        }
    }

}
