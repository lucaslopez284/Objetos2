package ar.edu.unlp.objetos.uno.ej18;

public class ArqueroBuilder implements Builder {
	private Personaje personaje;

	@Override
	public void elegirArmadura() {
	}

	@Override
	public void elegirArma() {
	}

	@Override
	public void elegirHabilidades() {
	}

	@Override
	public Personaje personaje() {
		return this.personaje;
	}

}
