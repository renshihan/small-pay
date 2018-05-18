package com.renshihan.pay.frame.core.core;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/16 13:56
 */
@Data
public class ChannelLoadConfig {

    private String name;
    private boolean enable;
    private String version;
    private Map properties;
    private List moduleUrl;
}
