package com.HospitalAPIGATEWAY;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HospitalApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApiGatewayApplication.class, args);
	}

}
