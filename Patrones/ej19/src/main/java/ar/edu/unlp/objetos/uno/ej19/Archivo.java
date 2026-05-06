package ar.edu.unlp.objetos.uno.ej19;

import java.time.LocalDate;

public interface Archivo {
	
	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public String getEspacio();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
	

}
