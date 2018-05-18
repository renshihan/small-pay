package com.renshihan.pay.frame.core.initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.PriorityOrdered;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/3 12:58
 * channel infrastructure通道基础设施 启动初始化器
 */
@Slf4j
public class ChannelInfrastructureSpringContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext>,PriorityOrdered{

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        log.info("[ChannelInfrastructureSpringContextInitializer]初始化开始.........");
    }

    @Override
    public int getOrder() {
        //设置优先级
        return HIGHEST_PRECEDENCE;
    }
}
