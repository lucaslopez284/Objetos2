package ar.edu.unlp.objetos.uno.ej10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTestMejorado {
	
	Calculadora calc;

	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculadora();
	}

	@Test
	void testBorrar() {
		calc.setValor(6); 
		calc.mas();  
		calc.setValor(3);
		calc.borrar();
		assertEquals(calc.getResultado(), "0");
	}

	@Test
	void testMas() {
		calc.setValor(6); 
		calc.mas();  
		calc.setValor(3);
		assertEquals(calc.getResultado(), "9.0");
		calc.mas();
		calc.mas();
		assertEquals(calc.getResultado(), "Error");
	}

	@Test
	void testMenos() {
		calc.setValor(6); 
		calc.menos();  
		calc.setValor(3);
		calc.menos();
		calc.menos();
		assertEquals(calc.getResultado(), "Error");
	}

	@Test
	void testPor() {
		calc.setValor(6); 
		calc.por();  
		calc.setValor(3);
		assertEquals(calc.getResultado(), "18.0");
		calc.setValor(3);
		assertEquals(calc.getResultado(), "Error");
	}

	@Test
	void testDividido() {
		calc.setValor(6); 
		calc.dividido();  
		calc.setValor(3);
		assertEquals(calc.getResultado(), "2.0");
		calc.setValor(3);
		assertEquals(calc.getResultado(), "Error");
	}

}
