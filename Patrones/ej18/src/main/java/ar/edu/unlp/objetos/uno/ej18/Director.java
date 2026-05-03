package ar.edu.unlp.objetos.uno.ej18;

public class Director {
	
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	
	public void construirPersonaje() {
		this.builder.elegirArmadura();
		this.builder.elegirArma();
		this.builder.elegirHabilidades();
	}
	
	

}
