package entities;

import entities.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TillTest {

	private Till till;

	@Before
	public void setUp() throws Exception {
		till = new Till(100.0);
	}

	@Test
	public void getAmount() {
		assertEquals(100.0,till.getAmount(),.001);
	}

	@Test
	public void setAmount() {
		till.setAmount(200.0);
		assertEquals(200.0, till.getAmount(), 0.001);
	}
}