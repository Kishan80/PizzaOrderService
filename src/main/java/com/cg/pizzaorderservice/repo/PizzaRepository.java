package com.cg.pizzaorderservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.pizzaorderservice.entity.PizzaDetails;
@Repository
public interface PizzaRepository extends CrudRepository<PizzaDetails, Integer> {
	/**
	 * To perform CRUD operations interface extending CrudRepository.
	 */
}
