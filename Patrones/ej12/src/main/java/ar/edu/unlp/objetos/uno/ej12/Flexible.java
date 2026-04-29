package ar.edu.unlp.objetos.uno.ej12;

public class Flexible implements Politica {

	public double montoAReembolsar(Reserva unaReserva) {
		return unaReserva.montoAPagar();
	}

}
