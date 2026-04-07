package ar.edu.unlp.objetos.uno.ej04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaCompuestaTest {
	TopografiaAgua t1;
	TopografiaTierra t2;
	TopografiaCompuesta t3;
	TopografiaCompuesta t4;

	@BeforeEach
	void setUp() throws Exception {
		t1 = new TopografiaAgua();
		t2 = new TopografiaTierra();
		t3 = new TopografiaCompuesta(List.of(t1,t2,t2,t1));
		t4 = new TopografiaCompuesta(List.of(t1,t2,t2,t3));
	    
	}

	@Test
	void testProporcionAgua() {
		assertEquals(t1.proporcionAgua(), 1);
		assertEquals(t2.proporcionAgua(), 0);
		assertEquals(t3.proporcionAgua(), 0.5);
		assertEquals(t4.proporcionAgua(), 0.375);
	}

	@Test
	void testProporcionTierra() {
		assertEquals(t1.proporcionTierra(), 0);
		assertEquals(t2.proporcionTierra(), 1);
		assertEquals(t3.proporcionTierra(), 0.5);
		assertEquals(t4.proporcionTierra(), 0.65);
	}

}
