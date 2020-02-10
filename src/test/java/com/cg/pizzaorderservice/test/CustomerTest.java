package com.cg.pizzaorderservice.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.cg.pizzaorderservice.entity.CustomerDetails;
import com.cg.pizzaorderservice.service.CustomerServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class CustomerTest {

//	@Autowired
//	private MockMvc mockMvc;

	@MockBean
	private CustomerServiceImpl custservice;

//	String exampleCustomer ="{\n" + 
//			"	\"customerName\":\"Kishan\",\n" + 
//			"	\"customerAddress\":\"Airoli\",\n" + 
//			"	\"customerPhoneNo\":\"8529517535\"\n" + 
//			"}";
	@Test
	public void registerCustTest() throws Exception {
		CustomerDetails mockCustomer = new CustomerDetails(1, "Kishan", "Airoli", "8529517535", null);
		Mockito.when(custservice.addCustomerDetails(mockCustomer)).thenReturn(mockCustomer);
		assertEquals(mockCustomer, custservice.addCustomerDetails(mockCustomer));
	}

	@Test
	public void getCustTest() throws Exception {
		int customerId = 1;
		CustomerDetails mockCustomer = new CustomerDetails(1, "Kishan", "Airoli", "8529517535", null);
		Mockito.when(custservice.getCustomerDetails(customerId)).thenReturn(mockCustomer);
		assertEquals(mockCustomer, custservice.getCustomerDetails(customerId));
	}

	@Test
	public void updateCustTest() throws Exception {
		CustomerDetails mockCustomer = new CustomerDetails(1, "Kishan", "Airoli", "8529517535", null);
		Mockito.when(custservice.updateCustomerDetails(mockCustomer)).thenReturn(mockCustomer);
		assertEquals(mockCustomer, custservice.updateCustomerDetails(mockCustomer));
	}

	@Test
	public void removeCustTest() throws Exception {
		int id = 1;
		Mockito.when(custservice.removeCustomerDetails(id)).thenReturn(true);
		assertEquals(true, custservice.removeCustomerDetails(id));
	}

}
