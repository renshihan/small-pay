package com.renshihan.pay.frame.core;

import com.renshihan.pay.core.channel.Channel;
import com.renshihan.pay.domain.channel.ChannelRequest;
import com.renshihan.pay.domain.channel.ChannelResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/15 17:46
 * 定义整个支付系统的业务链路
 */
@Slf4j
public class PayProccess implements Proccess<ChannelRequest, ChannelResponse> {
    //通道选择器 需要依赖注入
    private ChannelSelector channelSelector;

    private ChannelCallClient channelCallClient;

    @Override
    public ChannelResponse proccess(ChannelRequest channelRequest) {

        //交易前置---根据传入的channelRequest
        //1.创建支付config
        PayConfig payConfig = createPayConfig(channelRequest);
        //选择通道
        PayChannel channel = channelSelector.selectChannel(payConfig);
        log.info("通道选择结果:{}" + channel);

        ChannelResponse response = channelCallClient.callChannel(channelRequest,channel);
        //交易后置---返回统一处理
        afterProccess(response,channel);

        return response;


    }

    private PayConfig createPayConfig(ChannelRequest channelRequest) {
        //TODO 根据支付领域对象选择支付config，可能涉及redis
        return new PayConfig();
    }



    /**
     * @return
     * @author: renshihan@winchannel.net
     * @Description: 支付后置
     * @Date 2018/5/15 18:24
     * @Param
     */
    public void afterProccess(ChannelResponse response,Channel channel) {
        log.info("请求最后后处理");

    }
}
