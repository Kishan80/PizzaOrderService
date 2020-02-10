package com.cg.pizzaorderservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pizzaorderservice.entity.PizzaDetails;
import com.cg.pizzaorderservice.service.PizzaService;

@RestController
public class PizzaController {

	//Creating reference of PizzaService using dependency injection.
	@Autowired
	PizzaService pizzaService;

	//Using HTTP request methods handling HTTP requests and responses.
	
	@GetMapping(value = "/getPizzaMenu", produces = "application/json")
	public List<PizzaDetails> getPizzaMenu() {
		return pizzaService.getPizzaMenu();
	}

	@PostMapping(value = "/addPizzaMenu", consumes = "application/json")
	public PizzaDetails addPizzaMenu(@Valid @RequestBody PizzaDetails pizzaDetails) {
		return pizzaService.addPizzaMenu(pizzaDetails);
	}

	@PutMapping(value = "/updateMenu", consumes = "application/json")
	public PizzaDetails updateMenu(@Valid @RequestBody PizzaDetails pizzaDetails) {
		return pizzaService.updateMenu(pizzaDetails);
	}

	@DeleteMapping(value = "/removePizzaDetails/{pizzaId}")
	boolean removePizzaDetails(@PathVariable int pizzaId) {
		return pizzaService.removePizzaDetails(pizzaId);

	}
}
