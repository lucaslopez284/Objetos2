package ar.edu.unlp.objetos.uno.ej12;
import java.util.*;

public class Usuario {
	private String nombre;
	private List<AutoEnAlquiler> autosEnAlquiler;

	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		this.autosEnAlquiler = new ArrayList<AutoEnAlquiler>();
	}
	
	public void agregarAutoEnAlquiler(AutoEnAlquiler auto) {
		this.autosEnAlquiler.add(auto);
	}
	
	public void eliminarAutoEnAlquiler(AutoEnAlquiler auto) {
		this.autosEnAlquiler.remove(auto);
	}
	
	


}
