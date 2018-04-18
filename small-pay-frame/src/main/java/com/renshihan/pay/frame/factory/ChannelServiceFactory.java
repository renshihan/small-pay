package com.renshihan.pay.frame.factory;


import com.renshihan.pay.common.utils.enums.NoChannelExceptionCodes;
import com.renshihan.pay.common.utils.exception.NoChannelException;
import com.renshihan.pay.domain.channel.ChannelRequest;
import com.renshihan.pay.frame.container.ChannelContainer;
import com.renshihan.pay.frame.service.IChannelService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ChannelServiceFactory {

    private static final String INIT_MSG = "加载通道项 - {} - {} - {}";
    //存放容器
    public ChannelContainer channelContainer;

    public synchronized void setChannel(IChannel channel) {
        getChannelContainer().getIChannels().add(channel);
        log.info(INIT_MSG, channel.getChannelName(), channel.getChannelType().getChannelMsg(), channel.getChannelId());
    }

    public IChannelService getChannelService(ChannelRequest channelRequest) {
        for (IChannel channel : getChannelContainer().getIChannels()) {
            IChannelService channelService = channel.getChannelService(channelRequest);
            if (null != channelService) {
                log.debug("通道请求[{}]---命中通道服务:机构号[{}],通道号[{}],通道服务号[{}]",
                        channelRequest.getChannelRequestId(), channel.getAgentId(), channel.getChannelId(), channelService.getServiceCode());
                return channelService;
            }
        }
        throw new NoChannelException(NoChannelExceptionCodes.NC0001);
    }
}