package com.renshihan.pay.server.feign;

import com.renshihan.pay.domain.merchant.MerchantResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/11 16:39
 */
@FeignClient(name = "SecurityClient",url = "${small.pay.security.url}")
public interface ISecurityClient {
    @RequestMapping(value = "/v1/security/sign", method = RequestMethod.POST)
    String getSign(@RequestBody MerchantResponse merchantResponse);

}
@Component
@Slf4j
class ISecurityClientFallback implements ISecurityClient {
    @Override
    public String getSign(MerchantResponse merchantResponse) {
        log.info("调用接口ISecurityClient失败...");
        return "";
    }
}