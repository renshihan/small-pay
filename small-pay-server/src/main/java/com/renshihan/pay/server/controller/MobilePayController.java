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
@Slf4j
public class MobilePayController {
    @RequestMapping("/mobile/wx")
    public String wx(){
        log.info("进入测试微信服务...");
        String msg="微信测试....";
        log.info("返回数据:{}",msg);
        return msg;
    }
    @RequestMapping("/mobile/zfb")
    public String zfb(){
        log.info("进入测试支付宝服务...");
        String msg="支付宝测试....";
        log.info("返回数据:{}",msg);
        return msg;
    }
}
