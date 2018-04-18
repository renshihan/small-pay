package com.renshihan.pay.server.controller;

import com.renshihan.pay.common.utils.StringHelper;
import com.renshihan.pay.common.utils.enums.NoChannelExceptionCodes;
import com.renshihan.pay.common.utils.exception.NoChannelException;
import com.renshihan.pay.domain.merchant.MerchantRequest;
import com.renshihan.pay.domain.merchant.MerchantResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/9 13:49
 */
@RestController
@Slf4j
public class MobilePayController {
    @RequestMapping("/mobile/wx")
    public String wx() {
        log.info("进入测试微信服务...");
        String msg = "微信测试....";
        log.info("返回数据:{}", msg);
        return msg;
    }

    @RequestMapping("/mobile/zfb")
    public String zfb() {
        log.info("进入测试支付宝服务...");
        String msg = "支付宝测试....";
        log.info("返回数据:{}", msg);
        return msg;
    }

    @RequestMapping(value = "/mobile/exception", method = RequestMethod.POST)
    public MerchantResponse exception(@RequestBody MerchantRequest merchantRequest, HttpServletRequest request) {
        log.info("app---{}", request.getHeader("Content-Type"));
        log.info("----msg---{}", merchantRequest);
        log.info("收到请求数据----{}", merchantRequest);
        if (StringHelper.isBank2(new MerchantRequest().getMerchantId())) {
            throw new NoChannelException(NoChannelExceptionCodes.NC0001);
        }
        MerchantResponse merchantResponse = new MerchantResponse();
        BeanUtils.copyProperties(merchantRequest, merchantResponse);
        return merchantResponse;

    }
}
