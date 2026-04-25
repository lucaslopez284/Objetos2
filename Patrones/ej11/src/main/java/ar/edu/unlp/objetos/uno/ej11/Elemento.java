package ar.edu.unlp.objetos.uno.ej11;

import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
	
	protected String nombre;
	private LocalDate fechaCreacion;
	
	public Elemento(String nombre) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = LocalDate.now();
	}

    

	public String getNombre() {
		return nombre;
	}



	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	
	public abstract int espacio();
	public abstract String listadoDeContenido(String path);
	public abstract Elemento buscar(String nombre);
	public abstract List<Elemento> buscarTodos(String nombre);
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	
	
	
	

}
