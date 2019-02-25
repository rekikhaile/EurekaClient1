package com.rekik.findproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FindpropertyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindpropertyApplication.class, args);
	}

}

