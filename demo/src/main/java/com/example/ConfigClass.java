package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigClass {

	@Bean("NonVegPizza")
	public Pizza NonVegPizza() {
		return new NonVegPizza();
	}
	
	@Bean("VegPizza")
	@Primary
	public Pizza VegPizza() {
		return new VegPizza();
	}

}
