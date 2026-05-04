package ar.edu.unlp.objetos.uno.ej18;

import java.util.List;

public class ArqueroBuilder implements Builder {
	private Personaje personaje;
	
	public ArqueroBuilder(String nombre) {
		super();
		this.personaje = new Personaje(nombre);
	}

	@Override
	public void elegirArmadura() {
		this.personaje.agregarArmadura(new Cuero());
	}

	@Override
	public void elegirArma() {
		this.personaje.agregarArma(new Arco());
	}

	@Override
	public void elegirHabilidades() {
		this.personaje.agregarHabilidades(List.of("Disparos de flechas"));
	}

	@Override
	public Personaje personaje() {
		return this.personaje;
	}

}
