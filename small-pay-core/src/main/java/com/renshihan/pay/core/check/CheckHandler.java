package com.renshihan.pay.core.check;

import com.renshihan.pay.core.merchant.MerchantRequest;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/10 16:50
 * 设计模式：责任链模式
 */

@Data
@Slf4j
public abstract class CheckHandler {
    //下一个处理者
    private CheckHandler checkHandler;
    /**
     * 传给下一个处理者，这个方法本不应该出现在这，因为每个处理者中都有这个方法，所以就放到父类中来了
     * @param merchantRequest
     */
    public void next(MerchantRequest merchantRequest){
        if(null!=getCheckHandler() ){
            log.info("请求的处理方法为:{}",getCheckHandler());
            checkHandler.handleRequest(merchantRequest);
        }else {
            log.info("请求到ValidityCheckHandler这里没有了后续handler..");
        }
    }
    protected abstract void handleRequest(MerchantRequest merchantRequest);
}
