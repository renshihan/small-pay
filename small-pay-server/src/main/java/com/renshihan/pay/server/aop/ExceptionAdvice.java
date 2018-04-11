package com.renshihan.pay.server.aop;

import com.renshihan.pay.common.exception.NoChannelException;
import com.renshihan.pay.domain.merchant.MerchantRequest;
import com.renshihan.pay.domain.merchant.MerchantResponse;
import com.renshihan.pay.server.feign.ISecurityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/11 16:08
 */
@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {
    @Autowired
    @Lazy
    private ISecurityService iSecurityService;
    //此处可做统计功能
    @ResponseBody
    @ExceptionHandler(value = NoChannelException.class)
    public MerchantResponse noChannelExceptionHandle(@RequestBody MerchantRequest merchantRequest, NoChannelException e){
        log.error("异常拦截器拦截异常---[{}]",merchantRequest);

        return buildFailseMerchantResponse(merchantRequest,e);

    }

    private MerchantResponse buildFailseMerchantResponse(MerchantRequest merchantRequest,NoChannelException e){
        MerchantResponse merchantResponse=new MerchantResponse();
        merchantResponse.setResultCode(e.getCode());
        merchantResponse.setResultMsg(e.getMessage());
        if(null!=merchantRequest){
            log.error("商户http请求数据异常");
            merchantResponse.setAmount(merchantRequest.getAmount());
            merchantResponse.setOrderId(merchantRequest.getOrderId());
        }
        merchantResponse.setSign(iSecurityService.getSign(merchantResponse));
        return merchantResponse;
    }

}
