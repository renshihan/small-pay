package com.renshihan.pay.server.check;

import com.renshihan.pay.core.check.CheckHandler;
import com.renshihan.pay.core.merchant.MerchantRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/10 16:56
 * 校验请求合法性的check
 * 黑白名单
 */
@Slf4j
public class ValidityCheckHandler extends CheckHandler {
    public ValidityCheckHandler(CheckHandler checkHandler) {
        this.setCheckHandler(checkHandler);
    }

    @Override
    public void handleRequest(MerchantRequest merchantRequest) {

    }

}
