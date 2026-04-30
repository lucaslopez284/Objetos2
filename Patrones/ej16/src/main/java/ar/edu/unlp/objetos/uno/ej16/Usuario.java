package ar.edu.unlp.objetos.uno.ej16;

public class Usuario {
	
	private String apellido;
	private String nombre;
	private String email;
	
	public Usuario(String apellido, String nombre, String email) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}
