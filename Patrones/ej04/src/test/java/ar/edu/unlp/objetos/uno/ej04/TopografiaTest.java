package ar.edu.unlp.objetos.uno.ej04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaTest {
	
	TopografiaAgua t1, t2;
	TopografiaTierra t3, t4;

	@BeforeEach
	void setUp() throws Exception {
		t1 = new TopografiaAgua();
		t2 = new TopografiaAgua();
		t3 = new TopografiaTierra();
		t4 = new TopografiaTierra();
	}

	@Test
	void testSonIgualesEnProporcion() {
		assertTrue(t1.sonIgualesEnProporcion(t2));
		assertTrue(t3.sonIgualesEnProporcion(t4));
		assertFalse(t1.sonIgualesEnProporcion(t4));
	}

}
