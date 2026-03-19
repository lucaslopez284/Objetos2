package ar.edu.unlp.info.oo1.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpockTest {
	
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
		assertEquals(spo.juegaContraPiedra(pie), "Gano Spock");
	}

	@Test
	void testJuegaContraPapel() {
		assertEquals(spo.juegaContraPapel(pap), "Gano Papel");
	}

	@Test
	void testJuegaContraTijera() {
		assertEquals(spo.juegaContraTijera(tij), "Gano Spock");
	}

	@Test
	void testJuegaContraLagarto() {
		assertEquals(spo.juegaContraLagarto(lag), "Gano Lagarto");
	}

	@Test
	void testJuegaContraSpock() {
		assertEquals(spo.juegaContraSpock(spo), "Empate");
	}

}
