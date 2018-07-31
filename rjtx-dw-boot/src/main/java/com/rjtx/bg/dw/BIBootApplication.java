package com.rjtx.bg.dw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BIBootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BIBootApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println("aaa");
		return builder.sources(this.getClass());
	}
}
