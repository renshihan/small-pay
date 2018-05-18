package com.renshihan.pay.frame.core.core;


import com.renshihan.pay.domain.channel.ChannelRequest;
import com.renshihan.pay.domain.channel.ChannelResponse;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/15 18:05
 * 负责通道的信息传递
 * 影响其选择call方式的因数
 */
public interface ChannelCallClient {
    //参数1 通道请求，参数2 选择本地通道加载属性
    public ChannelResponse callChannel(ChannelRequest channelRequest, ChannelLoader channelLoad);
}
