package com.renshihan.pay.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@Slf4j
public class GatewayMain {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(GatewayMain.class);
		application.setRegisterShutdownHook(false);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		log.info("微付网关启动完成...");
	}

}
