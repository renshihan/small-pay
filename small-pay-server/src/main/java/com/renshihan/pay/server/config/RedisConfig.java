package com.renshihan.pay.server.config;

import com.renshihan.pay.common.redis.RedisService;
import com.renshihan.pay.common.redis.impl.DefaultRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/18 11:17
 */
@Configuration
public class RedisConfig {
    @Bean
    public RedisService redisService(RedisTemplate redisTemplate){
        return new DefaultRedisService(redisTemplate);
    }
}
