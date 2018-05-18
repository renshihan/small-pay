package com.renshihan.pay.frame.core.service;

import com.renshihan.pay.domain.channel.ChannelRequest;
import com.renshihan.pay.domain.channel.ChannelResponse;
import lombok.Data;

/**
 *
 * */
@Data
public abstract class IChannelService{


    abstract ChannelResponse service(ChannelRequest channelRequest);
}
