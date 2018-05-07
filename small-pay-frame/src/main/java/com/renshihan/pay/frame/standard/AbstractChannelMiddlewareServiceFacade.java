package com.renshihan.pay.frame.standard;

import java.util.Map;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/3 11:12
 */
public abstract class AbstractChannelMiddlewareServiceFacade {
    public abstract String getAgencyId();
    public abstract String getAgencyName();
    public abstract String getServiceCode();
    public abstract String getServiceName();
    public abstract String getVersion();
    public abstract String getAuthor();
    public abstract String getStartDate();
    public abstract String getEndDate();

    public Map<String, Object> getRuntimeInfo() {
        return null;
    }
}
