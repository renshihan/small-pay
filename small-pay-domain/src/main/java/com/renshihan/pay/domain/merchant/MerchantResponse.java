package com.renshihan.pay.domain.merchant;

import lombok.Data;

import java.io.Serializable;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/11 16:16
 */
@Data
public class MerchantResponse implements Serializable{
    private String orderId; //商户订单流水
    private String merchantId;  //商户号
    private String sign;    //商户签名
    private String amount;  //分为单位
    private String resultCode;  //成功 失败 处理中
    private String resultMsg;   //返回信息说明
    @Override
    public String toString() {
        return "MerchantResponse{" +
                "orderId='" + orderId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", sign='" + sign + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
