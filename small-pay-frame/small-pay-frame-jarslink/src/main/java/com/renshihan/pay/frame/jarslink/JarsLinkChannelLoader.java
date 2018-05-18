package com.renshihan.pay.frame.jarslink;

import com.alipay.jarslink.api.Module;
import com.alipay.jarslink.api.ModuleConfig;
import com.alipay.jarslink.api.ModuleLoader;
import com.alipay.jarslink.api.ModuleManager;
import com.renshihan.pay.frame.core.core.ChannelLoader;

import lombok.Data;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/16 12:45
 */
@Data
public class JarsLinkChannelLoader  implements ChannelLoader<Module,ModuleConfig>{
    //    模块加载引擎
    private ModuleLoader moduleLoader;
    //    模块管理器
    private ModuleManager moduleManager;

    @Override
    public Module load(ModuleConfig moduleConfig) {
        //模块加载
        return moduleLoader.load(moduleConfig);
    }

}
