package ar.edu.unlp.objetos.uno.ej06_6;

public class Basico implements Suscripcion {

	public double calcularCostoPelicula(Pelicula pelicula) {
		return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
	}

}
