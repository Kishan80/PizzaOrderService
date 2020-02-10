/**
 * 
 */
package com.cg.pizzaorderservice.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.pizzaorderservice.service.OrderServiceImpl;

/**
 * @author kneware
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderTest {

	@MockBean
	private OrderServiceImpl orderservice;
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
