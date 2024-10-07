package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PizzaController {

	private final Pizza pizza;

	@Autowired
	public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
		this.pizza = pizza;
	}

	public String getPizza() {
		return pizza.getPizza();
	}
}
