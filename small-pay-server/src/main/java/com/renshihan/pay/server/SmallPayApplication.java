package com.renshihan.pay.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.io.IOException;

@SpringBootApplication
@Slf4j
public class SmallPayApplication extends SpringBootServletInitializer {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 * @throws IOException the io exception
	 */
	public static void main(String[] args) throws IOException {
		SpringApplication application = new SpringApplication(SmallPayApplication.class);
		application.setRegisterShutdownHook(false);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		log.info("Service provider started!!!");
	}
}
