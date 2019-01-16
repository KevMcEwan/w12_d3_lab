package entities;

import entities.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealerTest {

	private Dealer dealer;

	@Before
	public void setUp() throws Exception {
		dealer = new Dealer("Swiss Tony");
	}

	@Test
	public void getName() {
		assertEquals("Swiss Tony", dealer.getName());
	}

	@Test
	public void setName() {
		dealer.setName("Swiss Tina");
		assertEquals("Swiss Tina", dealer.getName());
	}
}