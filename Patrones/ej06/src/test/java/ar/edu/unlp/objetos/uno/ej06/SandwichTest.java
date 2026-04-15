package ar.edu.unlp.objetos.uno.ej06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SandwichTest {
	Sandwich clasico, vegetariano, vegano, sintac;
	Builder builclasico, builvegetariano, builvegano, builsintac;
	Director d1, d2, d3, d4;

	@BeforeEach
	void setUp() throws Exception {
		builclasico = new ClasicoBuilder();
		d1 = new Director(builclasico);
		clasico = d1.receta();
		
		builvegetariano = new VegetarianoBuilder();
		d2 = new Director(builvegetariano);
		vegetariano = d2.receta();
		
		builvegano = new VeganoBuilder();
		d3 = new Director(builvegano);
		vegano = d3.receta();
		
		builsintac = new SinTACBuilder();
		d4 = new Director(builsintac);
		sintac = d4.receta();
	}

	@Test
	void precioClasico() {
		assertEquals(clasico.precio(), 500);
	}
	
	@Test
	void precioVegetariano() {
		assertEquals(vegetariano.precio(), 420);
	}
	
	@Test
	void precioVegano() {
		assertEquals(vegano.precio(), 620);
	}
	
	@Test
	void precioSinTAC() {
		assertEquals(sintac.precio(), 618);
	}

}
