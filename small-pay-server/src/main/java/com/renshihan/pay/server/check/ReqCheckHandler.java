package com.renshihan.pay.server.check;

import com.renshihan.pay.core.check.CheckHandler;
import com.renshihan.pay.core.merchant.MerchantRequest;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/10 18:17
 * 校验发送参数是否合法，以及签名是否合法
 */
public class ReqCheckHandler extends CheckHandler{
    public ReqCheckHandler(CheckHandler checkHandler) {
        this.setCheckHandler(checkHandler);
    }

    @Override
    public void handleRequest(MerchantRequest merchantRequest) {

    }
}
