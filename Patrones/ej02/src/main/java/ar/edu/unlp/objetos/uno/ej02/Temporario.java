package ar.edu.unlp.objetos.uno.ej02;

public class Temporario extends Empleado {
	private int hijos;
	private boolean casado;
	private int horas;
	
	

	public Temporario(int hijos, boolean casado, int horas) {
		super();
		this.hijos = hijos;
		this.casado = casado;
		this.horas = horas;
	}

	@Override
	public double basico() {
		return 20000 + this.horas * 3000;
	}

	@Override
	public double adicional() {
		double result = 2000 * hijos;
		if (this.casado) {
			result+= 5000;
		}
		return result;
	}

}
