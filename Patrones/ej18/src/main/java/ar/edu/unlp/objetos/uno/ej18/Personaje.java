package ar.edu.unlp.objetos.uno.ej18;

import java.util.List;

public class Personaje {
	private String nombre;
	private int vida;
	private Armadura armadura;
	private Arma arma;
	private List<String> habilidades;
	
	public Personaje(String nombre) {
		super();
		this.nombre = nombre;
		this.vida = 100;
	}
	
	public void agregarArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	
	public void agregarArma(Arma arma) {
		this.arma = arma;
	}
	
	public void agregarHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public Arma getArma() {
		return arma;
	}
	
	public boolean estaVivo() {
		return this.getVida() > 1;
	}
	
	public void recibirAtaque(int ataque) {
	    this.vida = Math.max(0, this.vida - ataque);
	}

	public void atacar(Personaje rival) {
		rival.recibirAtaque(this.arma.atacar(rival.getArmadura()));
	}
	
	
}
