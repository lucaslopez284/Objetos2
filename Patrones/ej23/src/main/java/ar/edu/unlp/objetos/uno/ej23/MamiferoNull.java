package ar.edu.unlp.objetos.uno.ej23;

import java.time.LocalDate;

public class MamiferoNull implements Mamifero {

	public String getIdentificador() {
		return "";
	}

	public void setIdentificador(String identificador) {
	}

	public String getEspecie() {
		return "";
	}

	public void setEspecie(String especie) {
	}

	public LocalDate getFechaNacimiento() {
		return LocalDate.MIN;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
	}

	public Mamifero getPadre() {
		return this;
	}

	public void setPadre(Mamifero padre) {
	}

	public Mamifero getMadre() {
		return this;
	}

	public void setMadre(Mamifero madre) {
	}

	public Mamifero getAbueloMaterno() {
		return this;
	}

	public Mamifero getAbuelaMaterna() {
		return this;
	}

	public Mamifero getAbueloPaterno() {
		return this;
	}

	public Mamifero getAbuelaPaterna() {
		return this;
	}

	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return false;
	}

}
