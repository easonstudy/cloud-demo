package com.example.eurekapeerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaPeerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPeerServerApplication.class, args);
	}
}
