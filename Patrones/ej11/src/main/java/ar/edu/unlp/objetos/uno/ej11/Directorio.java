package ar.edu.unlp.objetos.uno.ej11;

import java.util.*;

public class Directorio extends Elemento {

	private List<Elemento> elementos;
	
	public Directorio(String nombre, List<Elemento> elementos) {
		super(nombre);
		this.elementos = elementos;
	}
	
	public void agregarElemento(Elemento unElemento) {
		this.elementos.add(unElemento);
	}
	
	public void borrarElemento(Elemento unElemento) {
		this.elementos.remove(unElemento);
	}

	@Override
	public int espacio() {
		return 32 + this.elementos.stream()
		.mapToInt(elem -> elem.espacio())
		.sum();
	}
	
	public boolean esArchivo() {
		return false;
	}
	
	@Override
	public Elemento buscar(String nombre) {
	    if (this.getNombre().equals(nombre)) {
	        return this;
	    }
	    return this.elementos.stream()
	            .map(elem -> elem.buscar(nombre)) // cada hijo se busca a sí mismo
	            .filter(e -> e != null)
	            .findFirst()
	            .orElse(null); 
	}
	
	public List<Elemento> buscarTodos(String nombre) {
		List<Elemento> resultados = new ArrayList<Elemento>();
	    if (this.getNombre().equals(nombre)) {
	        resultados.add(this);
	    }
	    for (Elemento elem : this.elementos) {
	        resultados.addAll(elem.buscarTodos(nombre));
	    }
	    return resultados;
	}


}
