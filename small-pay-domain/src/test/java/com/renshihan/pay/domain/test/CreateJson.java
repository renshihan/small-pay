package com.renshihan.pay.domain.test;

import com.renshihan.pay.common.utils.JsonUtil;
import com.renshihan.pay.common.utils.RandomHelper;
import com.renshihan.pay.domain.merchant.MerchantRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/11 18:39
 */
@Slf4j
public class CreateJson {
    @Test
    public void test1(){
        MerchantRequest merchantRequest=new MerchantRequest();
        merchantRequest.setAmount("10000");
        merchantRequest.setMerchantId("10000222");
        merchantRequest.setOrderId(RandomHelper.uuid());
        log.info("merchantRequest----json:{}", JsonUtil.getJsonString(merchantRequest));
    }
}
