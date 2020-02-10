package com.cg.pizzaorderservice.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pizzaorderservice.entity.OrderDetails;
import com.cg.pizzaorderservice.service.OrderService;

@RestController
public class OrderController {
	
	//Creating reference of OrderService using dependency injection.
	@Autowired
	OrderService orderService;
	
	//Using HTTP request methods handling HTTP requests and responses.
	
	@PostMapping(value = "/AddOrderDetails/{customerId}&{pizzaId}",consumes = "application/json")
	public String AddOrderDetails(@Valid @RequestBody OrderDetails order,@PathVariable  int customerId,@PathVariable int pizzaId) {
		 orderService.AddOrderDetails(order,customerId,pizzaId);
		 System.out.println(customerId);
		 System.out.println(pizzaId);
		return "Order placed!";
	}

	@GetMapping(value = "/viewOrderDetails/{orderId}", produces = "application/json")
	public Optional<OrderDetails> viewOrderDetails(@PathVariable int orderId){
		return orderService.viewOrderDetails(orderId);
	}
	
	@DeleteMapping(value = "/cancleOrderDetails/{orderId}")
	public boolean cancleOrder(@PathVariable int orderId) {
		return orderService.cancleOrder(orderId);
	}
	
	@PutMapping(value = "/editOrderDetails", consumes = "application/json")
	public OrderDetails editOrderDetails(@Valid @RequestBody OrderDetails order) {
		return orderService.editOrderDetails(order);
		
	}
}
