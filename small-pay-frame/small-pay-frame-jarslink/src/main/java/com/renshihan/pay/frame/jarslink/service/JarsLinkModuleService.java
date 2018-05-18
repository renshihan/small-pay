package com.renshihan.pay.frame.jarslink.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/16 14:13
 */
public interface JarsLinkModuleService {
    //查询
    public String query();
    //增加
    public String add();
    //删除
    public String remove();

}
