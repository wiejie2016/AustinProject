package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurikaClientMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurikaClientMicroserviceApplication.class, args);
	}
}

@RestController
class ClientController{

	@RequestMapping(value = "/" )
	public String landingPage(){
		return "Hello Netflix's Eurika World !!";
	}
	
}
