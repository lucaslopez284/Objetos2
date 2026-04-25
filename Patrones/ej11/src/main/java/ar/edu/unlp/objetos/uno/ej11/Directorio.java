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
		return (32 * 1024) + this.elementos.stream()
		.mapToInt(elem -> elem.espacio())
		.sum();
	}
	
	@Override
	public Elemento buscar(String nombre) {
		if (this.getNombre().equals(nombre)) {
			return this;
		}
		for (Elemento elem : this.elementos) {
			Elemento resultado = elem.buscar(nombre);
			if (resultado != null){
				return resultado;
			}
		}
		return null;
	}

	@Override
	public List<Elemento> buscarTodos(String nombre) {
		List<Elemento> lista = new ArrayList<>();
	    if (this.getNombre().equals(nombre)) {
	        lista.add(this);
	    }
	    for (Elemento elem : this.elementos) {
			lista.addAll(elem.buscarTodos(nombre));
	    }
	    return lista;
	}
	
	public String listadoDeContenido(String path) {
		String nuevoPath =  path + "/" + this.getNombre();
		String resultado = nuevoPath + "\n";
		for (Elemento elem : this.elementos) {
			resultado += elem.listadoDeContenido(nuevoPath);
		}
		return resultado;
	}
	
	public Archivo archivoMasGrande() {
	    Archivo mayor = null;
	    for (Elemento elem : this.elementos) {
	        Archivo candidato = elem.archivoMasGrande();
	        if (candidato != null) {
	            if (mayor == null || candidato.espacio() > mayor.espacio()) {
	                mayor = candidato;
	            }
	        }
	    }
	    return mayor;
	}

	public Archivo archivoMasNuevo() {
	    Archivo nuevo = null;
	    for (Elemento elem : this.elementos) {
	        Archivo candidato = elem.archivoMasNuevo();
	        if (candidato != null) {
	            if (nuevo == null || 
	                candidato.getFechaCreacion().compareTo(nuevo.getFechaCreacion()) > 0) {
	                nuevo = candidato;
	            }
	        }
	    }
	    return nuevo;
	}


}
