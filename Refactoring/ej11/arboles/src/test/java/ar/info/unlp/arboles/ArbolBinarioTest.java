package ar.info.unlp.arboles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.info.unlp.arboles.ArbolBinario;

class ArbolBinarioTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	  @Test
	    public void testUnSoloNodo() {
	        ArbolBinario arbol = new ArbolBinarioReal(10);
	        assertEquals("10 - ", arbol.recorrerPreorden());
	        assertEquals("10 - ", arbol.recorrerInorden());
	        assertEquals("10 - ", arbol.recorrerPostorden());
	    }

	    @Test
	    public void testSoloHijoIzquierdo() {
	        ArbolBinario arbol = new ArbolBinarioReal(10);
	        arbol.setHijoIzquierdo(new ArbolBinarioReal(5));
	        assertEquals("10 - 5 - ", arbol.recorrerPreorden());
	        assertEquals("5 - 10 - ", arbol.recorrerInorden());
	        assertEquals("5 - 10 - ", arbol.recorrerPostorden());
	    }

	    @Test
	    public void testSoloHijoDerecho() {
	        ArbolBinario arbol = new ArbolBinarioReal(10);
	        arbol.setHijoDerecho(new ArbolBinarioReal(15));
	        assertEquals("10 - 15 - ", arbol.recorrerPreorden());
	        assertEquals("10 - 15 - ", arbol.recorrerInorden());
	        assertEquals("15 - 10 - ", arbol.recorrerPostorden());
	    }

	    @Test
	    public void testArbolCompletoTresNodos() {
	        ArbolBinario arbol = new ArbolBinarioReal(10);
	        arbol.setHijoIzquierdo(new ArbolBinarioReal(5));
	        arbol.setHijoDerecho(new ArbolBinarioReal(15));
	        assertEquals("10 - 5 - 15 - ", arbol.recorrerPreorden());
	        assertEquals("5 - 10 - 15 - ", arbol.recorrerInorden());
	        assertEquals("5 - 15 - 10 - ", arbol.recorrerPostorden());
	    }

	    @Test
	    public void testArbolConVariosNiveles() {
	        ArbolBinario arbol = new ArbolBinarioReal(10);
	        ArbolBinario n5 = new ArbolBinarioReal(5);
	        ArbolBinario n15 = new ArbolBinarioReal(15);
	        ArbolBinario n3 = new ArbolBinarioReal(3);
	        ArbolBinario n7 = new ArbolBinarioReal(7);
	        ArbolBinario n12 = new ArbolBinarioReal(12);
	        ArbolBinario n18 = new ArbolBinarioReal(18);

	        arbol.setHijoIzquierdo(n5);
	        arbol.setHijoDerecho(n15);
	        n5.setHijoIzquierdo(n3);
	        n5.setHijoDerecho(n7);
	        n15.setHijoIzquierdo(n12);
	        n15.setHijoDerecho(n18);

	        assertEquals("10 - 5 - 3 - 7 - 15 - 12 - 18 - ", arbol.recorrerPreorden());
	        assertEquals("3 - 5 - 7 - 10 - 12 - 15 - 18 - ", arbol.recorrerInorden());
	        assertEquals("3 - 7 - 5 - 12 - 18 - 15 - 10 - ", arbol.recorrerPostorden());
	    }
	}
