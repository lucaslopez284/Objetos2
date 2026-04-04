package ar.edu.unlp.objetos.uno.ej06_4;
import java.util.*;

public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
    	return this.items.stream()
    			.mapToDouble(item -> item.calcularCosto())
    			.sum();
    	}


}
