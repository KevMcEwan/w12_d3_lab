package entities;

import entities.Engine;
import entities.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

	Engine engine;

	@Before
	public void setUp() throws Exception {
		engine = new Engine(EngineType.PETROL, 100);
	}

	@Test
	public void getType() {
		assertEquals(EngineType.PETROL, engine.getType());
	}

	@Test
	public void getPowerHP() {
		assertEquals(100, engine.getPowerHP());
	}
}