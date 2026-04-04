package ar.edu.unlp.info.oo1.ej09;
import java.time.*;

public class Cliente {
    private LocalDate fechaAlta;
    public LocalDate getFechaAlta() {
		return this.fechaAlta;
	}
    
    public int añosDesdeFechaAlta() {
    	return Period.between(this.getFechaAlta(), LocalDate.now()).getYears();
    }

}
