package com.renshihan.pay.gateway.loader;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.RefreshableRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/12 16:37
 * 重写路由定位器
 */
@Slf4j
public class ServiceRouteLoador extends SimpleRouteLocator implements RefreshableRouteLocator{

    private ZuulProperties properties;

    public ServiceRouteLoador(String servletPath, ZuulProperties properties) {
        super(servletPath, properties);
        this.properties=properties;
    }

    @Override
    public void refresh() {
        doRefresh();
    }
}
