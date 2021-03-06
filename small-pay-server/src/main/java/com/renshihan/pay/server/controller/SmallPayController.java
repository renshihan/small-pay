package com.renshihan.pay.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/9 13:49
 */
@RestController
@RequestMapping(name = "/server/hello")
@Slf4j
public class SmallPayController {
    @RequestMapping("/hello")
    public @ResponseBody String hello(){
        log.info("进入测试服务hello...");
        String msg="hello,傻白甜同学";
        log.info("返回数据:{}",msg);
        return msg;
    }

}
