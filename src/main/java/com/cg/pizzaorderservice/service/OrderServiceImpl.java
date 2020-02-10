package com.cg.pizzaorderservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pizzaorderservice.entity.CustomerDetails;
import com.cg.pizzaorderservice.entity.OrderDetails;
import com.cg.pizzaorderservice.entity.PizzaDetails;
import com.cg.pizzaorderservice.repo.CustomerRepository;
import com.cg.pizzaorderservice.repo.OrderRepository;
import com.cg.pizzaorderservice.repo.PizzaRepository;

@Service
public class OrderServiceImpl implements OrderService {

	//Creating reference of OrderRepository using dependency injection.
	@Autowired
	OrderRepository orderRepo;
	
	//Creating reference of CustomerRepository using dependency injection.
	@Autowired
	CustomerRepository customerRepo;
	
	//Creating reference of PizzaRepository using dependency injection.
	@Autowired
	PizzaRepository pizzaRepo;

	//Implementation of all methods declared in Interface OrderService.
	@Override
	public void AddOrderDetails(OrderDetails order, int customerId, int pizzaId) {
		CustomerDetails cust = customerRepo.findById(customerId).get();
		PizzaDetails pizza = pizzaRepo.findById(pizzaId).get();
		System.out.println(cust);
		System.out.println(pizza);
		if (cust != null && pizza != null) {
			order.setCustomers(cust);
			order.setPizzadetails(pizza);
			orderRepo.save(order);
		}

		else {
			System.out.println("Customer Id and Pizza Id not found");
		}

	}

	@Override
	public Optional<OrderDetails> viewOrderDetails(int orderId) {
		return orderRepo.findById(orderId);
	}

	@Override
	public boolean cancleOrder(int orderId) {
		try {
			if (orderRepo.findById(orderId).get() != null)
				orderRepo.deleteById(orderId);
			return true;
		} catch (Exception e) {
			System.out.println("Invalid orderId");
		}
		return false;
	}

	@Override
	public OrderDetails editOrderDetails(OrderDetails order) {
		return orderRepo.save(order);
	}

}
