package ar.edu.unlp.info.oo1.ej03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntRingTest {
	
	IntRing intRing;

	@BeforeEach
	void setUp() throws Exception {
		int[] arreglo = {1,2,3,4,5};
		intRing = new IntRing(arreglo);
	}

	@Test
	void testNext() {
		assertEquals(1, intRing.next());
		assertEquals(2, intRing.next());
		assertEquals(3, intRing.next());
		assertEquals(4, intRing.next());
		assertEquals(5, intRing.next());
	}

}
