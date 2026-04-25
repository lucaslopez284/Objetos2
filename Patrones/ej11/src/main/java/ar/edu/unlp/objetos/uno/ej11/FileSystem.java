package ar.edu.unlp.objetos.uno.ej11;

import java.time.LocalDate;
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
		  

	/**
	 * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	 * del filesystem
	 */
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

	 /**
	  * Retorna el primer elemento con el nombre solicitado contenido en cualquier
	  * nivel del filesystem
	  */
	public Elemento buscar(String nombre) {
		for (Elemento e : this.elementos) {
	        Elemento encontrado = e.buscar(nombre);
	        if (encontrado != null) {
	            return encontrado;
	        }
	    }
	    return null;
	}

	 /**
	  * Retorna la lista con los elementos que coinciden con el nombre solicitado 
	  * contenido en cualquier nivel del filesystem
	  */
	 public List<Elemento> buscarTodos(String nombre){
		 List<Elemento> resultado = new ArrayList<Elemento>();
		 for (Elemento e : this.elementos) {
			 resultado.addAll(e.buscarTodos(nombre));
		 }
		 return resultado;   
	 }

	  
	 public String listadoDeContenido() {
		 String resultado = "";
		 for (Elemento elem : this.elementos) {
			 resultado += elem.listadoDeContenido("");
		 }
		 return resultado;
		}

}
