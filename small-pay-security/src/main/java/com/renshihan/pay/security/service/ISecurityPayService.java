package com.renshihan.pay.security.service;

import com.renshihan.pay.domain.merchant.MerchantResponse;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/11 17:23
 */
public interface ISecurityPayService {
    String sign(MerchantResponse merchantResponse);
}
