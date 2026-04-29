package ar.edu.unlp.objetos.uno.ej12;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements Politica {

	public double montoAReembolsar(Reserva unaReserva) {
		int dias = (int) ChronoUnit.DAYS.between(LocalDate.now(), unaReserva.getFecha()); 
		if (dias >= 7){
			return unaReserva.montoAPagar();
		}
		if (dias >= 2) {
			return unaReserva.montoAPagar() * 0.5;
		}
		return 0;			
	}
	

}
