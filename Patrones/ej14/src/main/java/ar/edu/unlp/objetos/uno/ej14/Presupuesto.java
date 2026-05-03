package ar.edu.unlp.objetos.uno.ej14;

import java.time.LocalDate;

public class Presupuesto {
	
	private String nombrePersona;
	private LocalDate fecha;
	private Equipo equipo;
	
	public Presupuesto(String nombrePersona, Equipo equipo) {
		super();
		this.nombrePersona = nombrePersona;
		this.fecha = LocalDate.now();
		this.equipo = equipo;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
