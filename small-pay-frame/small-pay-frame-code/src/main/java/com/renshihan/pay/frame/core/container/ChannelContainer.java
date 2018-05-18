package com.renshihan.pay.frame.core.container;

import com.renshihan.pay.frame.factory.IChannel;
import lombok.Data;

import java.util.List;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/11 14:09
 * 银行通道容器
 */
@Data
public class ChannelContainer {
    //本地存储通道
    private List<IChannel> iChannels;

}
