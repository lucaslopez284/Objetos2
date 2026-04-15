package ar.edu.unlp.objetos.uno.ej06;

public class VeganoBuilder implements Builder {
	
	public VeganoBuilder() {
		super();
	}

	public Ingrediente elegirPan() {
		return new Ingrediente("Integral", 100);
	}

	public Ingrediente elegirAderezo() {
		return new Ingrediente("Salsa criolla", 20);
	}
	
	public Ingrediente elegirCarne() {
		return new Ingrediente("Milanesa de girgolas", 500);
	}

	public Ingrediente elegirAdicional() {
		return null;
	}

}
