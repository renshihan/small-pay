package com.renshihan.pay.server.config;

import com.renshihan.pay.core.check.CheckHandler;
import com.renshihan.pay.server.check.ReqCheckHandler;
import com.renshihan.pay.server.check.ValidityCheckHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/10 18:12
 */
@Configuration
public class CheckConfig {
    @Bean
    public CheckHandler checkHandler(){
        CheckHandler checkHandler=new ValidityCheckHandler();

        return checkHandler;
    }
}
