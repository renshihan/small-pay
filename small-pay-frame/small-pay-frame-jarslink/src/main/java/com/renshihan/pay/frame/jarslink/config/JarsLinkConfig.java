package com.renshihan.pay.frame.jarslink.config;

import com.alipay.jarslink.api.ModuleLoader;
import com.alipay.jarslink.api.ModuleManager;
import com.alipay.jarslink.api.impl.ModuleLoaderImpl;
import com.alipay.jarslink.api.impl.ModuleManagerImpl;
import com.renshihan.pay.frame.core.core.ChannelLoader;
import com.renshihan.pay.frame.jarslink.JarsLinkChannelLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/16 13:41
 */
@Configuration
public class JarsLinkConfig {
    @Bean
    public ModuleLoader moduleLoader(){
        return new ModuleLoaderImpl();
    }
    @Bean
    public ModuleManager moduleManager(){
        return new ModuleManagerImpl();
    }
    @Bean
    public ChannelLoader channelLoader(){
        JarsLinkChannelLoader channelLoader=new JarsLinkChannelLoader();
//        模块加载器
        channelLoader.setModuleLoader(moduleLoader());
//        模块管理器
        channelLoader.setModuleManager(moduleManager());
        return channelLoader;
    }
}
