package com.cg.pizzaorderservice.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "CustomerDetails")
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerId")
	private int customerId;

	@Column(name = "customerName")
	@Pattern(regexp = "[A-Za-z ]{2,20}", message = "Sorry Customer name is not as given requirement.")
	private String customerName;

	@Column(name = "customerAddress")
	@Pattern(regexp = "[A-Za-z ]{2,20}", message = "Sorry Customer address is not as given requirement.")
	private String customerAddress;

	@Column(name = "customerPhoneNo")
	@Pattern(regexp = "[0-9]{2,20}", message = "Sorry Customer phone number is not as given requirement.")
	private String customerPhoneNo;

	/**
	 * implementing one to many mapping between CustomerDetails and OrderDetails.
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customers")
	private Set<OrderDetails> orders;

	public CustomerDetails() {
		super();
	}

	/**
	 * @return the orders
	 */
	public Set<OrderDetails> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Set<OrderDetails> orders) {
		this.orders = orders;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	/**
	 * @return the customerPhoneNo
	 */
	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}

	/**
	 * @param customerPhoneNo the customerPhoneNo to set
	 */
	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	/**
	 * @param customerId
	 * @param customerName
	 * @param customerAddress
	 * @param customerPhoneNo
	 * @param orders
	 */
	public CustomerDetails(int customerId, String customerName, String customerAddress, String customerPhoneNo,
			Set<OrderDetails> orders) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhoneNo = customerPhoneNo;
		this.orders = orders;
	}

}
