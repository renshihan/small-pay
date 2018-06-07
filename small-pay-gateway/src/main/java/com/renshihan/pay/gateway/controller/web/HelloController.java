package com.renshihan.pay.gateway.controller.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author renshihan@winchannel.net
 * @date 2018/6/7 17:05
 */
@RequestMapping("/hello")
@Controller
@Slf4j
public class HelloController {

    @RequestMapping("/list")
    public String list() {
        return "/hello/list";
    }
}
