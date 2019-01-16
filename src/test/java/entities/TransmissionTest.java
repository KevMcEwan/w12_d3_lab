package entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransmissionTest {

	Transmission transmission;

	@Before
	public void setUp() throws Exception {
		transmission = new Transmission(TransmissionType.AUTOMATIC);
	}

	@Test
	public void getTransmissionType(){
		assertEquals(TransmissionType.AUTOMATIC, transmission.getType());
	}

//	@Test
//	public void repair() {
//	}
}