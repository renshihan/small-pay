package com.renshihan.pay.security.service;

import com.renshihan.pay.common.utils.Md5Util;
import com.renshihan.pay.domain.merchant.MerchantResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/11 17:23
 */
@Service
@Slf4j
public class SecurityPayService implements ISecurityPayService{
    @Value("${small.pay.security.signPassword}")
    private String signPassword;
    @Override
    public String sign(MerchantResponse merchantResponse) {
        log.info("待签名字符串[{}],盐[{}]:",merchantResponse,signPassword);
        return Md5Util.MD5(merchantResponse.toString(),signPassword);
    }
}
