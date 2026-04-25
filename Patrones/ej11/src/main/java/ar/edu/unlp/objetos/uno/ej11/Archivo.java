package ar.edu.unlp.objetos.uno.ej11;

import java.util.*;

public class Archivo extends Elemento {

	private int espacio;
	
	
	public Archivo(String nombre, int espacio) {
		super(nombre);
		this.espacio = espacio;
	}

	public int espacio() {
		return this.espacio;
	}

	@Override
	public Elemento buscar(String nombre) {
		return this.getNombre().equals(nombre) ? this: null;
	}

	@Override
	public List<Elemento> buscarTodos(String nombre) {
		List<Elemento> lista = new ArrayList<Elemento>();
	    if (this.getNombre().equals(nombre)) {
	        lista.add(this);
	    }
	    return lista;
	}
	
	public String listadoDeContenido(String path) {
		// TODO Auto-generated method stub
		return path + "/" + this.getNombre() + "\n";
	}

	public Archivo archivoMasGrande() {
		return this;
	}

	public Archivo archivoMasNuevo() {
		return this;
	}
	
	
	
	
	
	

}
