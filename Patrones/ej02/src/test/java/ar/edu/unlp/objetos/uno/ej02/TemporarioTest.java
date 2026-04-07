package ar.edu.unlp.objetos.uno.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemporarioTest {
	Temporario t1, t2, t3, t4, t5, t6, t7, t8;

	@BeforeEach
	void setUp() throws Exception {
		t1 = new Temporario(0, false, 0);
		t2 = new Temporario(0, true, 0);
		t3 = new Temporario(1, false, 0);
		t4 = new Temporario(0, false, 1);
		t5 = new Temporario(1, true, 0);
		t6 = new Temporario(1, false, 1);
		t7 = new Temporario(0, true, 1);
		t8 = new Temporario(1, true, 1);
	}

	@Test
	void testBasico() {
		assertEquals(t1.basico(), 20000);
		assertEquals(t4.basico(), 23000);
	}

	@Test
	void testAdicional() {
		assertEquals(t1.adicional(), 0);
		assertEquals(t2.adicional(), 5000);
		assertEquals(t3.adicional(), 2000);
		assertEquals(t8.adicional(), 7000);
	}

}
