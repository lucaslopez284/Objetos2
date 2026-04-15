package ar.edu.unlp.objetos.uno.ej07;
import java.time.*;

public abstract class ProductoFinanciero {
	
	private LocalDate fechaOperacion;
	
	
	
	public ProductoFinanciero() {
		super();
		this.fechaOperacion = LocalDate.now();
	}



	public abstract double retornoInversion(double montoInicial);

}
