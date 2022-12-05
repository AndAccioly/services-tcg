package com.servicestcg.servicestcg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.servicestcg.servicestcg.controller.CartasController;

@SpringBootApplication
@ComponentScan(basePackageClasses = CartasController.class)
public class ServicesTcgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesTcgApplication.class, args);
	}
	
}
