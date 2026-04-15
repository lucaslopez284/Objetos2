package ar.edu.unlp.objetos.uno.ej06;

public class VegetarianoBuilder implements Builder {
	
	public VegetarianoBuilder() {
		super();
	}

	public Ingrediente elegirPan() {
		return new Ingrediente("Semillas", 120);
	}

	public Ingrediente elegirAderezo() {
		return null;
	}
	
	public Ingrediente elegirCarne() {
		return new Ingrediente("Provoleta grillada", 200);
	}

	public Ingrediente elegirAdicional() {
		return new Ingrediente("Berenjenas de escabeche", 100);
	}

}
