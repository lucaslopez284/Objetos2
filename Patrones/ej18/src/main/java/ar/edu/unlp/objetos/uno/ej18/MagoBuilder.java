package ar.edu.unlp.objetos.uno.ej18;

import java.util.List;

public class MagoBuilder implements Builder {
	private Personaje personaje;
	
	public MagoBuilder(String nombre) {
		super();
		this.personaje = new Personaje(nombre);
	}

	@Override
	public void elegirArmadura() {
		this.personaje.agregarArmadura(new Cuero());
	}

	@Override
	public void elegirArma() {
		this.personaje.agregarArma(new Baston());
	}

	@Override
	public void elegirHabilidades() {
		this.personaje.agregarHabilidades(List.of("Magia", "Combate a distancia"));
	}

	@Override
	public Personaje personaje() {
		return this.personaje;
	}

}
