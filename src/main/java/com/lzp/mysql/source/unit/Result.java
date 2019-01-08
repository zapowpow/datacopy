package com.lzp.mysql.source.unit;


import java.util.List;

/**
 * @Author: liutuo
 * @Description: controller返回Json的格式,会调用Constant类
 * @Company: 上海博般数据技术有限公司
 * @Date: Created in 12:20 2018/4/8.
 */
public class Result {

    private int errorCode;
    private String status;
    private String resultType;
    private Object results;

    public Result(){}

    public Result(int errorCode, String status, String resultType, Object results){
        this.errorCode = errorCode;
        this.status = status;
        this.resultType = resultType;
        this.results = results;
    }

    public Result(String status, boolean results){
        this.errorCode = Constant.ErrorCode.NOEXCEPTION.getErrorCode();
        this.status = status;
        this.resultType = Constant.ResultType.B00.getResultType();
        this.results = results;
    }

    public Result(String status, Object results){
        this.errorCode = Constant.ErrorCode.NOEXCEPTION.getErrorCode();
        this.status = status;
        this.resultType = Constant.ResultType.OBJ.getResultType();
        this.results = results;
    }

    public Result(String status, List results){
        this.errorCode = Constant.ErrorCode.NOEXCEPTION.getErrorCode();
        this.status = status;
        this.resultType = Constant.ResultType.ARRAY.getResultType();
        this.results = results;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
        this.results = results;
    }
}
