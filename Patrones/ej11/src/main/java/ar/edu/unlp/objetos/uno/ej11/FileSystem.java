package ar.edu.unlp.objetos.uno.ej11;

import java.util.*;
import java.util.stream.Collectors;

public class FileSystem {
	private List<Elemento> elementos;
	
	
	
	public FileSystem(List<Elemento> elementos) {
		super();
		this.elementos = elementos;
	}
	
	public void agregarElemento(Elemento unElemento) {
		this.elementos.add(unElemento);
	}
	
	public void borrarElemento(Elemento unElemento) {
		this.elementos.remove(unElemento);
	}

	/**
	 * Retorna el espacio total ocupado, incluyendo todo su contenido.
	 */
	public int espacioTotalOcupado() {
		return this.elementos.stream()
		.mapToInt(elem -> elem.espacio())
		.sum();
	}

	/**
	 * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	 * filesystem 
	 */
	public Archivo archivoMasGrande() {
		  return null;
	}
		  

	/**
	 * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	 * del filesystem
	 */
	public Archivo archivoMasNuevo() {
		  
	}

	 /**
	  * Retorna el primer elemento con el nombre solicitado contenido en cualquier
	  * nivel del filesystem
	  */
	public Elemento buscar(String nombre) {
	    return this.elementos.stream()
	        .map(e -> e.buscar(nombre)) 
	        .filter(res -> res != null)   
	        .findFirst()
	        .orElse(null);
	}

	 /**
	  * Retorna la lista con los elementos que coinciden con el nombre solicitado 
	  * contenido en cualquier nivel del filesystem
	  */
	 public List<Elemento> buscarTodos(String nombre){
		 return this.elementos.stream()
			        .flatMap(e -> {
			            List<Elemento> lista = e.buscarTodos(nombre);
			            return lista.stream();
			        })
			        .toList();        
	 }

	  
	 public String listadoDeContenido() {
		 
	 }

}
