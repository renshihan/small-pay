package com.renshihan.pay.frame.jarslink.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/16 13:37
 */
@Controller
@RequestMapping("/jarsModule")
@Slf4j
public class JarsModuleController {
    @RequestMapping("/console")
    public String console(){
        log.info("进入jarsmodule控制台");
        return null;
    }
}
