package ar.edu.unlp.info.oo1.ej03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharRingTest {
	
	CharRing chring;

	@BeforeEach
	void setUp() throws Exception {
		chring = new CharRing("Lucas");
	}

	@Test
	void testNext() {
		assertEquals('L', chring.next());
		assertEquals('u', chring.next());
		assertEquals('c', chring.next());
		assertEquals('a', chring.next());
		assertEquals('s', chring.next());
	}

}
