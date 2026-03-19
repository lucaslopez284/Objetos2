package ar.edu.unlp.info.oo1.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PiedraTest {
	
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
		assertEquals(pie.juegaContraPiedra(pie), "Empate");
	}

	@Test
	void testJuegaContraPapel() {
		assertEquals(pie.juegaContraPapel(pap), "Gano Papel");
	}

	@Test
	void testJuegaContraTijera() {
		assertEquals(pie.juegaContraTijera(tij), "Gano Piedra");
	}

	@Test
	void testJuegaContraLagarto() {
		assertEquals(pie.juegaContraLagarto(lag), "Gano Piedra");
	}

	@Test
	void testJuegaContraSpock() {
		assertEquals(pie.juegaContraSpock(spo), "Gano Spock");
	}

}
