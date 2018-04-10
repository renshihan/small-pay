package com.renshihan.pay.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/9 13:49
 */
@Controller
@RequestMapping(name = "/")
@Slf4j
public class SmallPayController {
    @RequestMapping("/hello")

    public @ResponseBody String hello(){
        log.info("进入测试服务hello...");
        return "hello,傻白甜同学";
    }

}
