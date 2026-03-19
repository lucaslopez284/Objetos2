package ar.edu.unlp.info.oo1.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LagartoTest {
	
	Piedra pie;
	Papel pap;
	Tijera tij;
	Lagarto lag;
	Spock spo;

	@BeforeEach
	void setUp() throws Exception {
		pie = new Piedra();
		pap = new Papel();
		tij = new Tijera();
		lag = new Lagarto();
		spo = new Spock();
	}
	
	@Test
	void testJuegaContraPiedra() {
		assertEquals(lag.juegaContraPiedra(pie), "Gano Piedra");
	}

	@Test
	void testJuegaContraPapel() {
		assertEquals(lag.juegaContraPapel(pap), "Gano Lagarto");
	}

	@Test
	void testJuegaContraTijera() {
		assertEquals(lag.juegaContraTijera(tij), "Gano Tijera");
	}

	@Test
	void testJuegaContraLagarto() {
		assertEquals(lag.juegaContraLagarto(lag), "Empate");
	}

	@Test
	void testJuegaContraSpock() {
		assertEquals(lag.juegaContraSpock(spo), "Gano Lagarto");
	}

}
