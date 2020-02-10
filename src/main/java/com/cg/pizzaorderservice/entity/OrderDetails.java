package com.cg.pizzaorderservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "OrdersTable")
public class OrderDetails {

	@Id
	@GeneratedValue
	@Column(name = "orderId")
	private int orderId;

	@Column(name = "orderDate")
	@Pattern(regexp = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", message = "Sorry Date id is not valid(mm/dd/yyyy).")
	private String orderDate;

	/**
	 * implementing many to one mapping between OrderDetails and CustomerDetails.
	 */
	@ManyToOne
	@JoinColumn(name = "customerId")
	private CustomerDetails customers;

	/**
	 * implementing one to one mapping between OrderDetails and PizzaDetails.
	 */
	@OneToOne
	@JoinColumn(name = "pizzaId")
	private PizzaDetails pizzadetails;

	/**
	 * @return the customers
	 */
	public CustomerDetails getCustomers() {
		return customers;
	}

	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(CustomerDetails customers) {
		this.customers = customers;
	}

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the pizzadetails
	 */
	public PizzaDetails getPizzadetails() {
		return pizzadetails;
	}

	/**
	 * @param pizzadetails the pizzadetails to set
	 */
	public void setPizzadetails(PizzaDetails pizzadetails) {
		this.pizzadetails = pizzadetails;
	}

	
	

	
}
