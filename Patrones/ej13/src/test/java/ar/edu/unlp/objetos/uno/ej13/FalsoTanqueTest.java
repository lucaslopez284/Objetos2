package ar.edu.unlp.objetos.uno.ej13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FalsoTanqueTest {
	FalsoTanque falsoTanque;

	@BeforeEach
	void setUp() throws Exception {
		falsoTanque = new FalsoTanque();
	}

	@Test
	void testHeatPower() {
		assertTrue(falsoTanque.heatPower(20));
		assertEquals(falsoTanque.getHeatPowerValue(), 20);
	}

	@Test
	void testMixerPower() {
		assertTrue(falsoTanque.mixerPower(20));
		assertEquals(falsoTanque.getMixerPowerValue(), 20);
	}

	@Test
	void testPurge() {
		assertTrue(falsoTanque.purge());
	}

	@Test
	void testUpTo() {
		assertEquals(falsoTanque.upTo(), 0);
	}
	
	@Test
	void testTemperature() {
		assertEquals(falsoTanque.temperature(), 0);
	}

}
