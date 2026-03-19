package ar.edu.unlp.info.oo1.ej01;
import java.util.*;

public class Red {
	
	private String nombre;
	private List<Usuario> usuarios;
	

	public Red(String nombre) {
		super();
		this.nombre = nombre;
		usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario crearUsuario (String nuevo) {
		Usuario usuNuevo = null;
		if (!existeUsuario(nuevo)) {
		    usuNuevo = new Usuario(nuevo);
			this.usuarios.add(usuNuevo);
		}
		return usuNuevo;
	}
	
	private boolean existeUsuario(String nuevo) {
		return this.usuarios.stream().anyMatch(usuario -> usuario.getScreenName().equals(nuevo));
	}
	
	public void eliminarUsuario (Usuario aBorrar) {
		if (aBorrar != null && this.existeUsuario(aBorrar.getScreenName())) {
			aBorrar.eliminarTweets();
			this.usuarios.remove(aBorrar);
		}
	}

	public List<Usuario> obtenerUsuarios() {
		return usuarios;
	}

	
	
	
	
	
	
	

}
