package ar.edu.unlp.objetos.uno.ej06;

public class SinTACBuilder implements Builder {
	
	public SinTACBuilder() {
		super();
	}

	public Ingrediente elegirPan() {
		return new Ingrediente("Chipa", 150);
	}

	public Ingrediente elegirAderezo() {
		return new Ingrediente("Salsa tartara", 18);
	}
	
	public Ingrediente elegirCarne() {
		return new Ingrediente("Pollo", 250);
	}

	public Ingrediente elegirAdicional() {
		return new Ingrediente("Verduras grilladas", 200);
	}

}
