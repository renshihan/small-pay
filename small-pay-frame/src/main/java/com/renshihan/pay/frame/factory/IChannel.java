package com.renshihan.pay.frame.factory;


import com.renshihan.pay.domain.channel.ChannelRequest;
import com.renshihan.pay.frame.enums.ChannelType;
import com.renshihan.pay.frame.service.IChannelService;
import lombok.Data;

/**
* @author: renshihan@winchannel.net
* @Description: 封装通道行为
* @Date 2018/4/11 11:37
* @Param
* @return
*/
@Data
public abstract class IChannel {
    //通道ID
    private String channelId;
    //通道名
    private String channelName;
    //通道类型
    private ChannelType channelType;
    //所属机构
    private String agentId;
    //是否需要向上游入驻商户
    private boolean isNeedRegister=false;
    abstract IChannelService getChannelService(ChannelRequest channelRequest);
}
