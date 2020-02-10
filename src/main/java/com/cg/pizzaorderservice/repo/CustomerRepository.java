package com.cg.pizzaorderservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.pizzaorderservice.entity.CustomerDetails;
@Repository
public interface CustomerRepository extends CrudRepository<CustomerDetails, Integer> {
	/**
	 * To perform CRUD operations interface extending CrudRepository.
	 */
}
