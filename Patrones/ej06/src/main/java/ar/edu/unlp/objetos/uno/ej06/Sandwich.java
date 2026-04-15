package ar.edu.unlp.objetos.uno.ej06;
import java.util.*;

public class Sandwich {
	
	private List<Ingrediente> ingredientes;

	public Sandwich() {
		ingredientes = new ArrayList<Ingrediente>();
	}
	
	public void agregarIngrediente(Ingrediente nuevo) {
		if (nuevo != null) {
			this.ingredientes.add(nuevo);
		}
	}
	
	public double precio() {
		return this.ingredientes.stream().mapToDouble(i-> i.getPrecio()).sum();
	}
	
	
	

}
