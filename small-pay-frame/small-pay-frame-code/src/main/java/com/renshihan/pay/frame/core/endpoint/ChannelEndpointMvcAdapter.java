package com.renshihan.pay.frame.core.endpoint;

import org.springframework.boot.actuate.endpoint.mvc.AbstractEndpointMvcAdapter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/3 11:27
 */
public class ChannelEndpointMvcAdapter extends AbstractEndpointMvcAdapter<ChannelEndpoint>{
    public static final String CHANNEL_VERSION_URL = ChannelEndpoint.CHANNEL_VERSION_PREFIX
            .replace("_", "/");
    public ChannelEndpointMvcAdapter(ChannelEndpoint delegate) {
        super(delegate);
    }
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object invoke(){
        return super.invoke();
    }
}
