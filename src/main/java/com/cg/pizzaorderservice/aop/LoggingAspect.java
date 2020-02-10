package com.cg.pizzaorderservice.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	/* AOP implementation for CustomerController */

	@Before("execution(public * com.cg.pizzaorderservice.controller.CustomerController.addCustomerDetails())")
	public void addCustLog() {
		LOGGER.info("addCustomerDetails method called from customer aspect");
	}

	@Before("execution(public * com.cg.pizzaorderservice.controller.CustomerController.getCustomerDetails(int))")
	public void getCustLog() {
		LOGGER.info("getCustomerDetails method called from customer aspect");
	}

	@Before("execution(public * com.cg.pizzaorderservice.controller.CustomerController.updateCustomerDetails())")
	public void updateCustLog() {
		LOGGER.info("updateCustomerDetails method called from customer aspect");
	}

	@Before("execution(public * com.cg.pizzaorderservice.controller.CustomerController.removeCustomerDetails(int))")
	public void removeCustLog() {
		LOGGER.info("removeCustomerDetails method called from customer aspect");
	}
	/*--------------------------------------------------------------------------------------------------------------------------*/

	/* AOP implementation for OrderController */

	@Before("execution(public * com.cg.pizzaorderservice.controller.OrderController.AddOrderDetails(int,int))")
	public void addOrderLog() {
		LOGGER.info("addOrderDetails method called from order aspect");
	}

	@Before("execution(public * com.cg.pizzaorderservice.controller.OrderController.viewOrderDetails(int))")
	public void viewOrderLog() {
		LOGGER.info("viewOrderDetails method called from order aspect");
	}

	@Before("execution(public * com.cg.pizzaorderservice.controller.OrderController.cancleOrder(int))")
	public void cancleOrderLog() {
		LOGGER.info("cancleOrderDetails method called from order aspect");
	}

	@Before("execution(public * com.cg.pizzaorderservice.controller.OrderController.editOrderDetails())")
	public void editOrderLog() {
		LOGGER.info("editOrderDetails method called from order aspect");
	}
	/*--------------------------------------------------------------------------------------------------------------------------*/
	
	/* AOP implementation for PizzaController */
	
	@Before("execution(public * com.cg.pizzaorderservice.controller.OrderController.getPizzaMenu())")
	public void getPizzaLog() {
		LOGGER.info("getPizzaMenu method called from pizza aspect");
	}
	
	@Before("execution(public * com.cg.pizzaorderservice.controller.OrderController.addPizzaMenu())")
	public void addPizzaLog() {
		LOGGER.info("addPizzaMenu method called from pizza aspect");
	}
	
	@Before("execution(public * com.cg.pizzaorderservice.controller.OrderController.updateMenu())")
	public void updatePizzaLog() {
		LOGGER.info("updatePizzaMenu method called from pizza aspect");
	}
	
	@Before("execution(public * com.cg.pizzaorderservice.controller.OrderController.removePizzaDetails(int))")
	public void removePizzaLog() {
		LOGGER.info("removePizzaMenu method called from pizza aspect");
	}
}
