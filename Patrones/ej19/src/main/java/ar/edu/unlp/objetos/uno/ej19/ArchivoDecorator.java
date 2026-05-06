package ar.edu.unlp.objetos.uno.ej19;

import java.time.LocalDate;

public abstract class ArchivoDecorator implements Archivo {
	
	protected Archivo archivo;
	
	public ArchivoDecorator(Archivo archivo) {
		super();
		this.archivo = archivo;
	}
	
	@Override
	public String prettyPrint() {
		return archivo.prettyPrint();
	}
	
	public String getNombre() {
		return this.archivo.getNombre();
	}
	
	public String getExtension() {
		return this.archivo.getExtension();
	}
	
	public String getEspacio() {
		return this.archivo.getEspacio();
	}
	
	public LocalDate getFechaCreacion() {
		return this.archivo.getFechaCreacion();
	}
	
	public LocalDate getFechaModificacion() {
		return this.archivo.getFechaModificacion();
	}
	
	public String getPermisos(){
		return this.archivo.getPermisos();
	}

}
