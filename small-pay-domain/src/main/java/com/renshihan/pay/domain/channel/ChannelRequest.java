package com.renshihan.pay.domain.channel;

import lombok.Data;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/10 18:07
 */
@Data
public class ChannelRequest {
    //机构ID
    private String agencyId;
    //通道请求ID
    private String channelRequestId;
    //到达通道后请求
}
