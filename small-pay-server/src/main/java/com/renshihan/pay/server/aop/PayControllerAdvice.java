package com.renshihan.pay.server.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/10 17:50
 */
@RestControllerAdvice("com.renshihan.pay.server.controller")
@Slf4j
public class PayControllerAdvice {
    @ModelAttribute
    public void checkSign(){
        log.info("检查签名是否正确...");
    }
    //请求参数校验
    @ModelAttribute
    public void check(){
        log.info("检查参数是否正确...");
    }
}
