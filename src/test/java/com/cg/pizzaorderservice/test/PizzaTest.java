package com.cg.pizzaorderservice.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.pizzaorderservice.entity.PizzaDetails;
import com.cg.pizzaorderservice.service.PizzaServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class PizzaTest {

	@MockBean
	private PizzaServiceImpl pizzservice;

	@Test
	public void addMenuTest() throws Exception {
		PizzaDetails mockPizza = new PizzaDetails(1, "cheese corn", "capsicum", 500.0, null);
		Mockito.when(pizzservice.addPizzaMenu(mockPizza)).thenReturn(mockPizza);
		assertEquals(mockPizza, pizzservice.addPizzaMenu(mockPizza));
	}

	@Test
	public void getPizzaMenuTest() throws Exception {
		Mockito.when(pizzservice.getPizzaMenu())
				.thenReturn(Stream
						.of(new PizzaDetails(1, "cheese corn", "capsicum", 500.0, null),
								new PizzaDetails(1, "paneer perry", "capsicum", 400.0, null))
						.collect(Collectors.toList()));
		assertEquals(2, pizzservice.getPizzaMenu().size());
	}

	@Test
	public void updatePizzaTest() throws Exception {
		PizzaDetails mockPizza = new PizzaDetails(1, "cheese corn", "capsicum", 500.0, null);
		Mockito.when(pizzservice.updateMenu(mockPizza)).thenReturn(mockPizza);
		assertEquals(mockPizza, pizzservice.updateMenu(mockPizza));
	}

	@Test
	public void removePizzaTest() throws Exception {
		int pizzaId = 1;
		Mockito.when(pizzservice.removePizzaDetails(pizzaId)).thenReturn(true);
		assertEquals(true, pizzservice.removePizzaDetails(pizzaId));
	}
}
