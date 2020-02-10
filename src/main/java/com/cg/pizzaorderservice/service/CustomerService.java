package com.cg.pizzaorderservice.service;

import com.cg.pizzaorderservice.entity.CustomerDetails;

public interface CustomerService {
	//This method will add customer details.
	public CustomerDetails addCustomerDetails(CustomerDetails customerDetails);

	//This method will return customer details.
	public CustomerDetails getCustomerDetails(int customerId);

	//This method will update customer details.
	public CustomerDetails updateCustomerDetails(CustomerDetails customerDetails);

	//This method will remove customer details.
	public boolean removeCustomerDetails(int customerId);

}
