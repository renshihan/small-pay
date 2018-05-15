package com.renshihan.pay.frame.core;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/15 17:47
 */
public interface Proccess<T,R> {
    public R proccess(T dto);
}
