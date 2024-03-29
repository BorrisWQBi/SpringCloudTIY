package com.borris.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan("com.borris")
public class SpringCloudTiyApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTiyApplication.class, args);
	}
}
