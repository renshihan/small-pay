package com.renshihan.pay.frame.core.enums;

public enum ServiceType {
    PAY("PAY_SERVICE","支付"),
    QUERY("QUERY_SERVICE","查询");
    private String serviceCode;
    private String serviceMsg;

    ServiceType(String serviceCode, String serviceMsg) {
        this.serviceCode = serviceCode;
        this.serviceMsg = serviceMsg;
    }

    public String getServiceCode() {
        return serviceCode;
    }


    public String getServiceMsg() {
        return serviceMsg;
    }

}
