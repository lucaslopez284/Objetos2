package ar.edu.unlp.objetos.uno.ej20;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProxyAccessTest {
	
	ProxyAccess proxy;
	DatabaseRealAccess database;		

	@BeforeEach
	void setUp() throws Exception {
		this.database = new DatabaseRealAccess();
		proxy = new ProxyAccess("contra", database);
	}

	@Test
	void testGetSearchResults() {
		proxy.logIn("contra");
		assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
		proxy.logOut();
		proxy.logIn("hola");
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=1"));
	}

	@Test
	void testInsertNewRow() {
		proxy.logIn("contra");
		assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
		assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
		proxy.logOut();
		proxy.logIn("hola");
		assertEquals(0, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
	}

}
