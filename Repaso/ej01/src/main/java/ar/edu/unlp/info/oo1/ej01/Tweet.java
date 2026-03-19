package ar.edu.unlp.info.oo1.ej01;
import java.util.*;

public class Tweet implements Publicacion {
	
	private String mensaje;
	
	public Tweet(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	public boolean esRt() {
		return false;
	}
}
