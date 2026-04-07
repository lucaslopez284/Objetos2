package ar.edu.unlp.objetos.uno.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasanteTest {
	
	Pasante p1, p2;

	@BeforeEach
	void setUp() throws Exception {
		p1 = new Pasante(0);
		p2 = new Pasante(1);
	}

	@Test
	void testBasico() {
		assertEquals(p1.basico(), 20000);
		assertEquals(p2.basico(), 20000);
	}

	@Test
	void testAdicional() {
		assertEquals(p1.adicional(), 0);
		assertEquals(p2.adicional(), 2000);
	}

}
