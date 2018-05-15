package com.renshihan.pay.frame.core;

import lombok.Data;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/15 17:49
 */
@Data
public class PayCondition {
    private PayChannel payChannel;
    private PayConfig payConfig;

    public PayCondition(PayChannel payChannel, PayConfig payConfig) {
        this.payChannel = payChannel;
        this.payConfig = payConfig;
    }
}
