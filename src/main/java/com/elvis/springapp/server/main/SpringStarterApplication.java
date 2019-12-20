package com.elvis.springapp.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.elvis"})
public class SpringStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterApplication.class, args);
	}

}
