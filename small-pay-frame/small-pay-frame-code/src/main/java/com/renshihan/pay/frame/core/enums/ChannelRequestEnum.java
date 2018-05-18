package com.renshihan.pay.frame.core.enums;

public enum ChannelRequestEnum {
    B2C("B2C","网银B2C")
    ;
    private String channelType;
    private String channelMsg;

    ChannelRequestEnum(String channelType, String channelMsg) {
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
