package ar.edu.unlp.info.oo1.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TijeraTest {
	
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
		assertEquals(tij.juegaContraPiedra(pie), "Gano Piedra");
	}

	@Test
	void testJuegaContraPapel() {
		assertEquals(tij.juegaContraPapel(pap), "Gano Tijera");
	}

	@Test
	void testJuegaContraTijera() {
		assertEquals(tij.juegaContraTijera(tij), "Empate");
	}

	@Test
	void testJuegaContraLagarto() {
		assertEquals(tij.juegaContraLagarto(lag), "Gano Tijera");
	}

	@Test
	void testJuegaContraSpock() {
		assertEquals(tij.juegaContraSpock(spo), "Gano Spock");
	}

}
