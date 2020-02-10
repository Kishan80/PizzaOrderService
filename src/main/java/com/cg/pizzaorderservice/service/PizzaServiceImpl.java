package com.cg.pizzaorderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pizzaorderservice.entity.PizzaDetails;
import com.cg.pizzaorderservice.repo.PizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService {

	//Creating reference of PizzaRepository using dependency injection.
	@Autowired
	PizzaRepository pizzaRepo;

	//Implementation of all methods declared in Interface PizzaService.
	@Override
	public List<PizzaDetails> getPizzaMenu() {
		return (List<PizzaDetails>) pizzaRepo.findAll();
	}

	@Override
	public PizzaDetails addPizzaMenu(PizzaDetails pizzaDetails) {
		return pizzaRepo.save(pizzaDetails);
	}

	@Override
	public PizzaDetails updateMenu(PizzaDetails pizzaDetails) {
		return pizzaRepo.save(pizzaDetails);
	}

	@Override
	public boolean removePizzaDetails(int pizzaId) {
		try {
			if (pizzaRepo.findById(pizzaId).get() != null)
				pizzaRepo.deleteById(pizzaId);
			return true;
		} catch (Exception e) {
			System.out.println("Invalid pizzaId");
		}
		return false;
	}

}
