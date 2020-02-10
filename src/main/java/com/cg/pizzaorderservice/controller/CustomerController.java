package com.cg.pizzaorderservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pizzaorderservice.entity.CustomerDetails;
import com.cg.pizzaorderservice.service.CustomerService;

@RestController
public class CustomerController {

	//Creating reference of CustomerService using dependency injection.
	@Autowired
	CustomerService customerService;

	//Using HTTP request methods handling HTTP requests and responses.
	
	@PostMapping(value = "/registerCustome", consumes = "application/json")
	public CustomerDetails addCustomerDetails(@Valid @RequestBody CustomerDetails customerDetails) {
		return customerService.addCustomerDetails(customerDetails);
	}

	@GetMapping(value = "/getCustomerDetails/{customerId}", produces = "application/json")
	public CustomerDetails getCustomerDetails(@PathVariable int customerId) {
		return customerService.getCustomerDetails(customerId);
	}

	@PutMapping(value = "/updateCustomerDetails", consumes = "application/json")
	public CustomerDetails updateCustomerDetails(@Valid @RequestBody CustomerDetails customerDetails) {
		return customerService.updateCustomerDetails(customerDetails);
	}

	@DeleteMapping(value = "/removeCustomerDetails/{customerId}")
	public boolean removeCustomerDetails(@PathVariable int customerId) {
		return customerService.removeCustomerDetails(customerId);

	}

}
