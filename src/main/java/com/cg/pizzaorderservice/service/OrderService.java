package com.cg.pizzaorderservice.service;

import java.util.Optional;

import com.cg.pizzaorderservice.entity.OrderDetails;

public interface OrderService {

	//This method will add Order details.
	public void AddOrderDetails(OrderDetails order, int customerId, int pizzaId);

	//This method will show Order details.
	public Optional<OrderDetails> viewOrderDetails(int orderId);

	//This method will remove Order.
	public boolean cancleOrder(int orderId);

	//This method will edit Order details.
	public OrderDetails editOrderDetails(OrderDetails order);

}
