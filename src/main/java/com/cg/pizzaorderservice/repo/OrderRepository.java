package com.cg.pizzaorderservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.pizzaorderservice.entity.OrderDetails;

@Repository
public interface OrderRepository extends CrudRepository<OrderDetails, Integer> {
	/**
	 * To perform CRUD operations interface extending CrudRepository.
	 */
}
