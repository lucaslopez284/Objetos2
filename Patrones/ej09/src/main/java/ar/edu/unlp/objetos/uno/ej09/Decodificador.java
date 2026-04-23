package ar.edu.unlp.objetos.uno.ej09;

import java.util.List;

public class Decodificador {
	
	private Estrategia strategy;
	private List<Pelicula> peliculas;
	private List<Pelicula> vistas;

	

	public Decodificador(Estrategia strategy, List<Pelicula> peliculas, List<Pelicula> vistas) {
		super();
		this.strategy = strategy;
		this.peliculas = peliculas;
		this.vistas = vistas;
	}

	public void setStrategy(Estrategia strategy) {
		this.strategy = strategy;
	}

	public List<Pelicula> sugerirContenido() {
		return this.strategy.sugerirContenido(this);
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public List<Pelicula> getVistas() {
		return vistas;
	}
}
