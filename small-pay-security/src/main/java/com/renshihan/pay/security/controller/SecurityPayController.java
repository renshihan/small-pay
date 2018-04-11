package com.renshihan.pay.security.controller;

import com.renshihan.pay.domain.channel.ChannelRequest;
import com.renshihan.pay.domain.merchant.MerchantResponse;
import com.renshihan.pay.security.service.ISecurityPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/9 13:49
 */
@RestController
@Slf4j
@RequestMapping("/v1/")
public class SecurityPayController {
    @Autowired
    private ISecurityPayService securityPayService;
    @RequestMapping("/security/sign")
    public String sign(@RequestBody MerchantResponse merchantResponse){
        log.info("接收到的签名信息:{}",merchantResponse);
        String msg=securityPayService.sign(merchantResponse);
        log.info("返回数据:{}",msg);
        return msg;
    }
}
