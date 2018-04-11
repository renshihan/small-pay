package com.renshihan.pay.frame.factory;

import com.renshihan.pay.domain.channel.ChannelRequest;
import com.renshihan.pay.domain.channel.ChannelResponse;
import com.renshihan.pay.frame.entity.BankResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChannelHttpClient implements IChannelHttpClient{
    @Override
    public BankResponse submit(ChannelRequest channelRequest, ChannelResponse channelResponse, String url) {
        return null;
    }
}
