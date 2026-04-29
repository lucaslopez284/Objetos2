package ar.edu.unlp.objetos.uno.ej12;

import java.time.LocalDate;

public class Reserva {
	
	private AutoEnAlquiler auto;
	private int cantidadDias;
	private LocalDate fecha;
	private Politica politica;
	
	public Reserva(AutoEnAlquiler auto, int cantidadDias, LocalDate fecha, Politica politica) {
		super();
		this.auto = auto;
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
		this.politica = politica;
	}
	
	public double montoAPagar() {
		return this.cantidadDias * this.auto.getPrecioPorDia();
	}
	
	public double montoAReembolsar() {
		return this.politica.montoAReembolsar(this);
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setPolitica(Politica politica) {
		this.politica = politica;
	}
	
	
	
	

}
