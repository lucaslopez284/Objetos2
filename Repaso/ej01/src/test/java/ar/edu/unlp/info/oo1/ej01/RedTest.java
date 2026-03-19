package ar.edu.unlp.info.oo1.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RedTest {
	
	Red r;
	Usuario usu1, usu2;

	@BeforeEach
	void setUp() throws Exception {
		r = new Red("Twitter");
	}

	@Test
	void testCrearUsuario() {
		usu1 = r.crearUsuario("Lucas");
		assertEquals(r.obtenerUsuarios().size(), 1);
		usu2 = r.crearUsuario("Bauti");
		assertEquals(r.obtenerUsuarios().size(), 2);
	}

	@Test
	void testEliminarUsuario() {
		usu1 = r.crearUsuario("Lucas");
		usu2 = r.crearUsuario("Bauti");
		r.eliminarUsuario(usu1);
		assertEquals(r.obtenerUsuarios().size(), 1);
		r.eliminarUsuario(usu2);
		assertEquals(r.obtenerUsuarios().size(), 0);
	}

}
