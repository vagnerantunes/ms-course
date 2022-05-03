package com.spring.microservicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
Eureka é um servidor onde os micro serviços vão se registrar usando portas aleatorias.. 
 */

//anotação eureka para dizer que esse é um projeto servidor
@EnableEurekaServer
@SpringBootApplication
public class HrEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrEurekaServerApplication.class, args);
	}

}
