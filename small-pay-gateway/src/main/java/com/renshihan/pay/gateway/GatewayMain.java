package com.renshihan.pay.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@Slf4j
public class GatewayMain {

	public static void main(String[] args) {
		SpringApplication.run(GatewayMain.class, args);
		log.info("微付网关启动完成...");
	}

}
