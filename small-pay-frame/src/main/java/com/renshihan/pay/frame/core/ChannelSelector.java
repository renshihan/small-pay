package com.renshihan.pay.frame.core;


/**
 * @author renshihan@winchannel.net
 * @date 2018/5/15 17:52
 * //大致方向---- 1.分布式：配置中心 ---》通道为分布式（非单个项目）
 *               2.jarsLink模块加载：子系统通过单个jar提供服务，数据库控制通道可用性。
 */
public interface ChannelSelector {

    public PayChannel selectChannel(PayConfig payConfig);
}
