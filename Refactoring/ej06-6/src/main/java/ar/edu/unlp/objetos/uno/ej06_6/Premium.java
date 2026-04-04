package ar.edu.unlp.objetos.uno.ej06_6;

public class Premium implements Suscripcion {

	public double calcularCostoPelicula(Pelicula pelicula) {
		return pelicula.getCosto() * 0.75;
	}

}
