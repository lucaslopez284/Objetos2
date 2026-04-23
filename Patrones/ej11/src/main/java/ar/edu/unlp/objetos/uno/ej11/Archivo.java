package ar.edu.unlp.objetos.uno.ej11;

import java.util.List;

public class Archivo extends Elemento {

	private int espacio;
	
	
	public Archivo(String nombre, int espacio) {
		super(nombre);
		this.espacio = espacio;
	}

	public int espacio() {
		return this.espacio;
	}
	
	public boolean esArchivo() {
		return true;
	}
	
	public Elemento buscar(String nombre) {
		 return this.getNombre().equals(nombre) ? this : null;
	}
	
	public List<Elemento> buscarTodos(String nombre){
		return this.getNombre().equals(nombre) ? List.of(this) : List.of();
	}

}
