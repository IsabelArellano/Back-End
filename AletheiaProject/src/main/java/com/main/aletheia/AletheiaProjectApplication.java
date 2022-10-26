package com.main.aletheia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages="controller")
public class AletheiaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AletheiaProjectApplication.class, args);
	}

}
