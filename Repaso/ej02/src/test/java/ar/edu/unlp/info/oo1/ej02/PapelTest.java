package ar.edu.unlp.info.oo1.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PapelTest {
	
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
		assertEquals(pap.juegaContraPiedra(pie), "Gano Papel");
	}

	@Test
	void testJuegaContraPapel() {
		assertEquals(pap.juegaContraPapel(pap), "Empate");
	}

	@Test
	void testJuegaContraTijera() {
		assertEquals(pap.juegaContraTijera(tij), "Gano Tijera");
	}

	@Test
	void testJuegaContraLagarto() {
		assertEquals(pap.juegaContraLagarto(lag), "Gano Lagarto");
	}

	@Test
	void testJuegaContraSpock() {
		assertEquals(pap.juegaContraSpock(spo), "Gano Papel");
	}

}
