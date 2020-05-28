package com.chlang.common.resp.common;

import java.io.Serializable;

/**
 * 请求结果返回给前端的包装类
 */
public class PlatformHttpResult implements Serializable {
    private static final long serialVersionUID = 1517968965755604156L;

    private final static Integer SUCCESS_CODE = 0;

    private Integer code;
    private String msg;
    private Object obj;

    public PlatformHttpResult(){}

    public PlatformHttpResult(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    private PlatformHttpResult(Integer code, Object obj){
        this.code = code;
        this.obj = obj;
    }

    /**
     * 失败，提示信息
     * @param code
     * @param msg
     * @return
     */
    public final static PlatformHttpResult errorWithMsg(Integer code, String msg){
        return new PlatformHttpResult(code,msg);
    }

    /**
     * 失败，对象
     * @param code
     * @param obj
     * @return
     */
    public final static PlatformHttpResult errorWithObj(Integer code, Object obj){
        return new PlatformHttpResult(code,obj);
    }

    /**
     * 成功，提示信息
     * @param msg
     * @return
     */
    public final static PlatformHttpResult successWithMsg(String msg){
        return new PlatformHttpResult(SUCCESS_CODE,msg);
    }

    /**
     * 成功，对象
     * @param obj
     * @return
     */
    public final static PlatformHttpResult successWithObj(Object obj){
        return new PlatformHttpResult(SUCCESS_CODE,obj);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
