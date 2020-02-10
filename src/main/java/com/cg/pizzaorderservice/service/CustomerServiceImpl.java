package com.cg.pizzaorderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pizzaorderservice.entity.CustomerDetails;
import com.cg.pizzaorderservice.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	//Creating reference of CustomerRepository using dependency injection.
	@Autowired
	CustomerRepository customerRepo;

	//Implementation of all methods declared in Interface CustomerService
	@Override
	public CustomerDetails addCustomerDetails(CustomerDetails customerDetails) {
		return customerRepo.save(customerDetails);
	}

	@Override
	public CustomerDetails getCustomerDetails(int customerId) {
		return customerRepo.findById(customerId).orElseThrow();
	}

	@Override
	public CustomerDetails updateCustomerDetails(CustomerDetails customerDetails) {
		return customerRepo.save(customerDetails);
	}

	@Override
	public boolean removeCustomerDetails(int customerId) {
		try {
			if (customerRepo.findById(customerId).get() != null) 
				customerRepo.deleteById(customerId);
			return true;
		} catch (Exception e) {
			System.out.println("Invalid customerId");
		}
		return false;
	}

}
