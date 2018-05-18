package com.renshihan.pay.frame.core.core;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/15 17:47
 */
public interface Proccess<T,R> {
    /**
    * @author: renshihan@winchannel.net
    * @Description: 定位子系统
    * @Date 2018/5/16 \
    * @Param
    * @return
    */
    public R proccess(T dto);
}
