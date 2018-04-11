package com.renshihan.pay.frame.entity;


import java.util.Map;

public class BankRequest {

    private boolean isOk=false;
    private String msg;
    private Map<String,String> result;
    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Map<String, String> getResult() {
        return result;
    }
    public void setResult(Map<String, String> result) {
        this.result = result;
    }

}
