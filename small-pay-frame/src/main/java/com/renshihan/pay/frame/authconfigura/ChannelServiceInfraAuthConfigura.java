package com.renshihan.pay.frame.authconfigura;

import com.renshihan.pay.frame.endpoint.ChannelEndpoint;
import com.renshihan.pay.frame.endpoint.ChannelEndpointMvcAdapter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.actuate.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/3 11:24
 */
@Configurable
public class ChannelServiceInfraAuthConfigura {
    @Bean
    public ChannelEndpoint channelEndpoint(){
        return new ChannelEndpoint();
    }

    @Bean
    @ConditionalOnBean(ChannelEndpoint.class)
    @ConditionalOnEnabledEndpoint(ChannelEndpoint.CHANNEL_VERSION_PREFIX)
    public ChannelEndpointMvcAdapter channelEndpointMvcAdapter(ChannelEndpoint channelEndpoint) {

        return new ChannelEndpointMvcAdapter(channelEndpoint);
    }
}
