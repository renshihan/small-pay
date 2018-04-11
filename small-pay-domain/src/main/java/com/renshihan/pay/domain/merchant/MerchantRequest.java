package com.renshihan.pay.domain.merchant;

import lombok.Data;

import java.io.Serializable;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/10 18:31
 */
@Data
public class MerchantRequest implements Serializable{
    private String orderId; //商户订单流水
    private String merchantId;  //商户号
    private String sign;    //商户签名
    private String amount;  //分为单位

    @Override
    public String toString() {
        return "MerchantRequest{" +
                "orderId='" + orderId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", sign='" + sign + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
