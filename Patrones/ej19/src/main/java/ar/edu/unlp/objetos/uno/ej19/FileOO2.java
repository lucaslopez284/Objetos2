package ar.edu.unlp.objetos.uno.ej19;

import java.time.LocalDate;

public class FileOO2 implements Archivo {
	
	private String nombre;
	private String extension;
	private String espacio;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	
	
	public FileOO2(String nombre, String extension, String espacio, String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.espacio = espacio;
		this.fechaCreacion = LocalDate.now();
		this.fechaModificacion = LocalDate.now();
		this.permisos = permisos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getEspacio() {
		return espacio;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public String getPermisos() {
		return permisos;
	}

	public String prettyPrint() {
		return this.getNombre();
	}

}
