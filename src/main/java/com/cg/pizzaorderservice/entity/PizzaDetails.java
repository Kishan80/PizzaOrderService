package com.cg.pizzaorderservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "PizzaDetails")
public class PizzaDetails {

	@Id
	@GeneratedValue()
	@Column(name = "pizzaId")
	private int pizzaId;

	@Column(name = "pizzaName")
	@Pattern(regexp = "[A-Za-z ]{2,20}", message = "Sorry pizza name is not as given requirement.")
	private String pizzaName;

	@Column(name = "toppingName")
	@Pattern(regexp = "[A-Za-z ]{2,20}", message = "Sorry topping name is not as given requirement.")
	private String toppingName;

	@Column(name = "pizzaPrice")
	private Double pizzaPrice;

	/**
	 * implementing one to one mapping between PizzaDetails and OrderDetails.
	 */
	@OneToOne(mappedBy = "pizzadetails")
	private OrderDetails orders;

	/**
	 * @return the pizzaId
	 */
	public int getPizzaId() {
		return pizzaId;
	}

	/**
	 * @param pizzaId the pizzaId to set
	 */
	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}

	/**
	 * @return the pizzaName
	 */
	public String getPizzaName() {
		return pizzaName;
	}

	/**
	 * @param pizzaName the pizzaName to set
	 */
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	/**
	 * @return the toppingName
	 */
	public String getToppingName() {
		return toppingName;
	}

	/**
	 * @param toppingName the toppingName to set
	 */
	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}

	/**
	 * @return the pizzaPrice
	 */
	public Double getPizzaPrice() {
		return pizzaPrice;
	}

	/**
	 * @param pizzaPrice the pizzaPrice to set
	 */
	public void setPizzaPrice(Double pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}

	/**
	 * @return the orders
	 */
	public OrderDetails getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(OrderDetails orders) {
		this.orders = orders;
	}

	/**
	 * @param pizzaId
	 * @param pizzaName
	 * @param toppingName
	 * @param pizzaPrice
	 * @param orders
	 */
	public PizzaDetails(int pizzaId, String pizzaName, String toppingName, Double pizzaPrice, OrderDetails orders) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		this.toppingName = toppingName;
		this.pizzaPrice = pizzaPrice;
		this.orders = orders;
	}

	/**
	 * 
	 */
	public PizzaDetails() {
		super();
	}

}
