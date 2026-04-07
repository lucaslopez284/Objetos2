package ar.edu.unlp.objetos.uno.ej02;

public abstract class Empleado {
	
	public abstract double basico();
	public abstract double adicional();
	
	public double descuento() {
		return this.basico() * 0.13 + this.descuento() * 0.5;
	}
	
	public double sueldo() {
		return this.basico() + this.adicional() - this.descuento();
	}

}
