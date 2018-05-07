package com.renshihan.pay.common.redis;

import com.renshihan.pay.common.TestRedisMain;
import com.renshihan.pay.common.utils.RandomHelper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/18 12:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestRedisMain.class)
@Slf4j
public class TestRedisService {
    @Autowired
    private RedisService redisService;
    @Test
    public void set(){
        try {
            log.info("添加结果:{}",redisService.set("a", RandomHelper.uuid()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
