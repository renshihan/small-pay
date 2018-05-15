package com.renshihan.pay.server.config;

import com.alipay.jarslink.api.ModuleLoader;
import com.alipay.jarslink.api.ModuleManager;
import com.alipay.jarslink.api.impl.ModuleLoaderImpl;
import com.alipay.jarslink.api.impl.ModuleManagerImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/15 14:22
 */
@Configurable
public class JarsLinkConfig {

//    模块加载引擎
    @Bean
    public ModuleLoader moduleLoader(){
        return new ModuleLoaderImpl();
    }

//    模块管理器
    @Bean
    public ModuleManager moduleManager(){
        return new ModuleManagerImpl();
    }


}
