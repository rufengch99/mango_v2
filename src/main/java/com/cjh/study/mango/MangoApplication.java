package com.cjh.study.mango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cjh.study.mango"})
public class MangoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MangoApplication.class, args);
	}

}
