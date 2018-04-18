package com.renshihan.pay.server.aop;

import com.renshihan.pay.common.utils.enums.NoChannelExceptionCodes;
import com.renshihan.pay.common.utils.exception.NoChannelException;
import com.renshihan.pay.domain.merchant.MerchantResponse;
import com.renshihan.pay.server.feign.ISecurityClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/11 16:08
 */
@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {
    @Autowired
    @Lazy
    private ISecurityClient iSecurityClient;
    private static final String HTTP_CONTENT_TYPE = "Content-Type";

    //此处可做统计功能
    @ExceptionHandler(value = {NoChannelException.class})
    public @ResponseBody
    MerchantResponse noChannelExceptionHandle(NoChannelException e) {
        log.info("捕获异常----{}:{}", e.getCode(), e.getMessage());
        //获取body
        return buildFailseMerchantResponse(e);
    }

    //是对spring服务间传送时出现错误的异常补充
    @ExceptionHandler(value = {Exception.class})
    public @ResponseBody
    MerchantResponse exceptionHandle(HttpServletRequest httpServletRequest, Exception e) {
        //判断是否是由
        log.error("捕获Exception异常", e);
        return noChannelExceptionHandle(conventNoChannelException(httpServletRequest));
    }

    private NoChannelException conventNoChannelException(HttpServletRequest httpServletRequest) {
        String content_type = httpServletRequest.getHeader(HTTP_CONTENT_TYPE);
        log.error("[检查http请求content_type..]---{}", content_type);
        if (!MediaType.APPLICATION_JSON_UTF8_VALUE.contains(content_type)) {
            return new NoChannelException(NoChannelExceptionCodes.NC9998);
        }
        //可添加其他检测
        return new NoChannelException(NoChannelExceptionCodes.NC9999);
    }

    private MerchantResponse buildFailseMerchantResponse(NoChannelException e) {
        MerchantResponse merchantResponse = new MerchantResponse();
        merchantResponse.setResultCode(e.getCode());
        merchantResponse.setResultMsg(e.getMessage());
        merchantResponse.setSign(iSecurityClient.getSign(merchantResponse));
        log.info("返回数据-----{}", merchantResponse);
        return merchantResponse;
    }

}
