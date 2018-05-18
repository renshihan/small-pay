package com.renshihan.pay.frame.core.factory;

import com.renshihan.pay.domain.channel.ChannelRequest;
import com.renshihan.pay.domain.channel.ChannelResponse;
import com.renshihan.pay.frame.entity.BankResponse;

public interface IChannelHttpClient {
    public BankResponse submit(ChannelRequest channelRequest, ChannelResponse channelResponse, String url);
}
