package ar.edu.unlp.objetos.uno.ej06;

public class ClasicoBuilder implements Builder {
	
	public ClasicoBuilder() {
		super();
	}

	public Ingrediente elegirPan() {
		return new Ingrediente("Brioche", 100);
	}

	public Ingrediente elegirAderezo() {
		return new Ingrediente("Mayonesa", 20);
	}
	
	public Ingrediente elegirCarne() {
		return new Ingrediente("Ternera", 300);
	}

	public Ingrediente elegirAdicional() {
		return new Ingrediente("Tomate", 80);
	}

}
