package ar.edu.unlp.objetos.uno.ej18;

import java.util.List;

public class ThoorBuilder implements Builder {
private Personaje personaje;
	
	public ThoorBuilder(String nombre) {
		super();
		this.personaje = new Personaje(nombre);
	}

	@Override
	public void elegirArmadura() {
		this.personaje.agregarArmadura(new Hierro());
	}

	@Override
	public void elegirArma() {
		this.personaje.agregarArma(new Martillo());
	}

	@Override
	public void elegirHabilidades() {
		this.personaje.agregarHabilidades(List.of("Lanzar rayos", "Combate a distancia"));
	}

	@Override
	public Personaje personaje() {
		return this.personaje;
	}

}
