package ar.edu.unlp.objetos.uno.ej11;

import java.time.LocalDate;

public abstract class Elemento {
	
	private String nombre;
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
	
	public abstract boolean esArchivo();
	
	public abstract int espacio();
	
	public abstract Elemento buscar(String nombre);
	
	
	
	

}
