package ar.edu.unlp.objetos.uno.ej06;
import java.util.*;

public class Director {
	
	private Builder builder;
	
	
	
	public Director(Builder builder) {
		super();
		this.builder = builder;
	}



	public Sandwich receta() {
		Sandwich sandwich = new Sandwich();
		sandwich.agregarIngrediente(builder.elegirPan());
		sandwich.agregarIngrediente(builder.elegirAderezo());
		sandwich.agregarIngrediente(builder.elegirCarne());
		sandwich.agregarIngrediente(builder.elegirAdicional());
		return sandwich;
	}
	

}
