package com.renshihan.pay.frame.core.core;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/15 18:54
 */
public interface ChannelLoader<M,C> {
    M load(C c);
}
