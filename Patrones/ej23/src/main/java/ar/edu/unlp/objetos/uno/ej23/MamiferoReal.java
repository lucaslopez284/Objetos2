package ar.edu.unlp.objetos.uno.ej23;

import java.time.*;

public class MamiferoReal implements Mamifero{
	
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public MamiferoReal(String identificador, String especie, LocalDate fechaNacimiento) {
		super();
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		this.padre = new MamiferoNull();
		this.madre = new MamiferoNull();
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		return this.getMadre().getPadre();
	}
	
	public Mamifero getAbuelaMaterna() {
		return this.getMadre().getMadre();
	}
	
	public Mamifero getAbueloPaterno() {
		return this.getPadre().getPadre();
	}
	
	public Mamifero getAbuelaPaterna() {
		return this.getPadre().getMadre();
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return unMamifero == this.getPadre() 
				|| unMamifero == this.getMadre() 
				|| this.getMadre().tieneComoAncestroA(unMamifero) 
				|| this.getPadre().tieneComoAncestroA(unMamifero);
	}

}
