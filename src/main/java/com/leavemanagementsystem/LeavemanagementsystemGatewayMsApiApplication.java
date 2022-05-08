package com.leavemanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class LeavemanagementsystemGatewayMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeavemanagementsystemGatewayMsApiApplication.class, args);
	}

}
