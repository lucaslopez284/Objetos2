package ar.edu.unlp.objetos.uno.ej02;

public class Planta extends Empleado {
	private int hijos;
	private boolean casado;
	private int antiguedad;
	
	

	public Planta(int hijos, boolean casado, int antiguedad) {
		super();
		this.hijos = hijos;
		this.casado = casado;
		this.antiguedad = antiguedad;
	}

	@Override
	public double basico() {
		return 50000;
	}

	@Override
	public double adicional() {
		double result = 2000 * hijos + 2000 * antiguedad;
		if (this.casado) {
			result+= 5000;
		}
		return result;
	}

}
