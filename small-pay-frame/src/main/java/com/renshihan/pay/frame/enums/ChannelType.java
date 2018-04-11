package com.renshihan.pay.frame.enums;

public enum ChannelType {
    B2C("B2C","网银B2C"),
    SM("SM","扫码支付"),
    TM("TM","条码支付"),
    WAP("WAP","WAP支付"),
    APP("APP","APP支付"),
    REGISTER("REGISTER","商户入驻")
    ;
    private String channelType;
    private String channelMsg;

    ChannelType(String channelType,String channelMsg) {
        this.channelType = channelType;
        this.channelMsg=channelMsg;
    }

    public String getChannelType() {
        return channelType;
    }

    public String getChannelMsg() {
        return channelMsg;
    }
}
