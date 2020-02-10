package com.cg.pizzaorderservice.service;

import java.util.List;

import com.cg.pizzaorderservice.entity.PizzaDetails;

public interface PizzaService {

	//This method will show pizza menu.
	public List<PizzaDetails> getPizzaMenu();

	//This method will add pizza details.
	public PizzaDetails addPizzaMenu(PizzaDetails pizzaDetails);

	//This method will update pizza menu.
	public PizzaDetails updateMenu(PizzaDetails pizzaDetails);

	//This method will remove pizza details.
	boolean removePizzaDetails(int pizzaId);
}
