package ar.edu.unlp.objetos.uno.ej02;

public class Pasante extends Empleado {
	private int examenes;
	
	

	public Pasante(int examenes) {
		super();
		this.examenes = examenes;
	}

	@Override
	public double basico() {
		return 20000;
	}

	@Override
	public double adicional() {
		return 2000 * this.examenes;
	}

}
