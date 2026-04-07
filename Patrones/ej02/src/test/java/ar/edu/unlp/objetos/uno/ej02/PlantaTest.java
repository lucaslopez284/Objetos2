package ar.edu.unlp.objetos.uno.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlantaTest {

	Planta p1, p2, p3, p4, p5, p6, p7, p8;

	@BeforeEach
	void setUp() throws Exception {
		p1 = new Planta(0, false, 0);
		p2 = new Planta(0, true, 0);
		p3 = new Planta(1, false, 0);
		p4 = new Planta(0, false, 1);
		p5 = new Planta(1, true, 0);
		p6 = new Planta(1, false, 1);
		p7 = new Planta(0, true, 1);
		p8 = new Planta(1, true, 1);
	}

	@Test
	void testBasico() {
		assertEquals(p1.basico(), 50000);
	}

	@Test
	void testAdicional() {
		assertEquals(p1.adicional(), 0);
		assertEquals(p2.adicional(), 5000);
		assertEquals(p3.adicional(), 2000);
		assertEquals(p4.adicional(), 2000);
		assertEquals(p5.adicional(), 7000);
		assertEquals(p6.adicional(), 4000);
		assertEquals(p7.adicional(), 7000);
		assertEquals(p8.adicional(), 9000);
	}

}
