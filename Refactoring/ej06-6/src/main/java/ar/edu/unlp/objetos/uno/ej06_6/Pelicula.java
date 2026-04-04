package ar.edu.unlp.objetos.uno.ej06_6;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Pelicula {
	
	private String nombre;
	private String genero;
	private double costo;
	private LocalDate fechaEstreno;
	
	public double getCosto() {
	   	 return this.costo;
    }
	    
	    public double calcularCargoExtraPorEstreno(){
		// Si la Película se estrenó 30 días antes de la fecha actual, retorna un cargo de 0$, caso contrario, retorna un cargo extra de 300$
	   	return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
	    }


}
