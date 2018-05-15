package com.renshihan.pay.server.test.jarslink;

import com.alipay.jarslink.api.ModuleConfig;
import com.alipay.jarslink.api.impl.AbstractModuleRefreshScheduler;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.net.URL;
import java.util.List;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/15 14:32
 */
public class JarsLinkModuleTest  extends AbstractModuleRefreshScheduler{

    @Override
    public List<ModuleConfig> queryModuleConfigs() {
        return ImmutableList.of(buildModuleConfig());
    }
    public static ModuleConfig buildModuleConfig(){
        URL demoModule=Thread.currentThread().getContextClassLoader().getResource("META-INF/spring/demo-1.0.0.jar");
        ModuleConfig moduleConfig=new ModuleConfig();
        moduleConfig.setName("demo");//name：全局唯一，建议使用英文，忽略大小写。
        moduleConfig.setEnabled(true);//enabled：当前模块是否可用，默认可用，卸载模块时可以设置成false。
        moduleConfig.setVersion("1.0.0.20170621");  //：模块的版本，如果版本号和之前加载的不一致，框架则会重新加载模块。
        moduleConfig.setProperties(ImmutableMap.of("svnPath", new Object()));   //spring属性配置文件。
        moduleConfig.setModuleUrl(ImmutableList.of(demoModule));//模块的本地存放地址。


        return moduleConfig;
    }
}
