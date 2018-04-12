package com.renshihan.pay.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/12 17:25
 */
@Component
@Slf4j
public class GatewayFilter extends ZuulFilter {

    @Value("${zuul.prefix}")
    private String zuulPrefix;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.info("进入small-pay-gateway的zuulFilter中进行请求预处理");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("传入的request的content_type---{}",request.getHeader("Content-Type"));
        log.info("发送 {} 请求到 {} ",request.getMethod(),request.getRequestURI().toString());
        final String requestUri = request.getRequestURI().substring(zuulPrefix.length());

        final String method = request.getMethod();
        log.info("requestUri----{},method----{}",requestUri,method);
        return null;
    }
}
