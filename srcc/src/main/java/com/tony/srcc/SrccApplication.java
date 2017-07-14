package com.tony.srcc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SrccApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SrccApplication.class).web(true).run(args);
	}
}
