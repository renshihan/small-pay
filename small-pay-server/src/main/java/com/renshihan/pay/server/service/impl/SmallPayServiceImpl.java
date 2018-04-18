package com.renshihan.pay.server.service.impl;

import com.renshihan.pay.common.redis.RedisService;
import com.renshihan.pay.server.service.SmallPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SmallPayServiceImpl implements SmallPayService{
    @Autowired
    private RedisService redisService;

}
