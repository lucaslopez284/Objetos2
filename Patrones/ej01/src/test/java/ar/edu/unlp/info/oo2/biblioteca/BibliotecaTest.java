package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BibliotecaTest {
	
	Biblioteca b1;

	@BeforeEach
	void setUp() throws Exception {
		b1 = new Biblioteca();
		b1.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		b1.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}

	@Test
	void testAgregarSocio() {
		assertEquals(2,b1.getCantidadSocios());
	}

	@Test
	void testExportarSocios() {
		assertEquals(
			    "[\n" +
			    "  {\n" +
			    "    \"nombre\": \"Arya Stark\",\n" +
			    "    \"email\": \"needle@stark.com\",\n" +
			    "    \"legajo\": \"5234-5\"\n" +
			    "  },\n" +
			    "  {\n" +
			    "    \"nombre\": \"Tyron Lannister\",\n" +
			    "    \"email\": \"tyron@thelannisters.com\",\n" +
			    "    \"legajo\": \"2345-2\"\n" +
			    "  }\n" +
			    "]",
			    b1.exportarSocios()
			);
	}

}
