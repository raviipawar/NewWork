package com.yognirog.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.yognirog.auth")
@EntityScan(basePackages = {"com.yognirog.auth"}) 
public class EntryYogNirogApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntryYogNirogApplication.class, args);
	}
}
