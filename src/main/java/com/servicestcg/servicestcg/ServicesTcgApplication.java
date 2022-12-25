package com.servicestcg.servicestcg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.servicestcg.servicestcg.config.AuthProvider;
import com.servicestcg.servicestcg.config.SecurityConfig;
import com.servicestcg.servicestcg.controller.CartasController;

@SpringBootApplication
@ComponentScan(basePackageClasses = CartasController.class)
@ComponentScan(basePackageClasses = AuthProvider.class)
@Import({SecurityConfig.class})
public class ServicesTcgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesTcgApplication.class, args);
	}
	
}
