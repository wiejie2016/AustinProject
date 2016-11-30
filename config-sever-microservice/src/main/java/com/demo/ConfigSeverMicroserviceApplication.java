package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigSeverMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSeverMicroserviceApplication.class, args);
	}
}