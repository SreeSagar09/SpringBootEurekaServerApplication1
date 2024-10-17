package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServerApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerApplication1Application.class, args);
		System.out.println("SpringBootEurekaServerApplication1Application is started..");
	}

}
