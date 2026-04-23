package ar.edu.unlp.objetos.uno.ej09;

import java.util.List;

public class Pelicula {
	
	private String titulo;
	private int estreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	

	public Pelicula(String titulo, int estreno, double puntaje, List<Pelicula> similares) {
		super();
		this.titulo = titulo;
		this.estreno = estreno;
		this.puntaje = puntaje;
		this.similares = similares;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getEstreno() {
		return estreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}
	
	
	
	

}
