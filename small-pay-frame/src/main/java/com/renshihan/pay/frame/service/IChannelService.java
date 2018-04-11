package com.renshihan.pay.frame.service;

import com.renshihan.pay.domain.channel.ChannelRequest;
import com.renshihan.pay.domain.channel.ChannelResponse;
import lombok.Data;

/**
 *
 * */
@Data
public abstract class IChannelService{
    private String serviceCode;
    private String serviceName;
    abstract ChannelResponse service(ChannelRequest channelRequest);
}
