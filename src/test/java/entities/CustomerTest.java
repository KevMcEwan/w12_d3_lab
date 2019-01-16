package entities;

import entities.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

	private Customer customer;

	@Before
	public void setUp() throws Exception {
		customer = new Customer("Buck Rodgers", 10000.0);
	}

	@Test
	public void getName() {
		assertEquals("Buck Rodgers", customer.getName());
	}

	@Test
	public void setName() {
		customer.setName("Ducky Dodgers");
		assertEquals("Ducky Dodgers", customer.getName());
	}

	@Test
	public void getBudget() {
		assertEquals(10000.0, customer.getBudget(), .0001);
	}

	@Test
	public void setBudget() {
		customer.setBudget(20000.0);
		assertEquals(20000.0, customer.getBudget(), .001);
	}
}