package com.gilbarco.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.gilbarco"})
public class NijishGilbarcoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NijishGilbarcoTestApplication.class, args);
	}
}
