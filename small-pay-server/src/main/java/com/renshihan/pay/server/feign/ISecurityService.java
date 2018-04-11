package com.renshihan.pay.server.feign;

import com.renshihan.pay.domain.merchant.MerchantResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/11 16:39
 */
@FeignClient(url = "${small.pay.security.url}")
public interface ISecurityService {
    @RequestMapping(value = "/v1/security/sign", method = RequestMethod.POST)
    String getSign(@RequestBody MerchantResponse merchantResponse);

}
