package com.renshihan.pay.frame.factory;

/**
 * Created by renshihan on 2017/1/10.
 */

public interface IChannelFactory{
    public  IChannel getChannel(String channelId);
}
