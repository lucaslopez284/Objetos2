package ar.edu.unlp.objetos.uno.ej06_6;

public class Familia implements Suscripcion {

	public double calcularCostoPelicula(Pelicula pelicula) {
		return (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
	}

}
