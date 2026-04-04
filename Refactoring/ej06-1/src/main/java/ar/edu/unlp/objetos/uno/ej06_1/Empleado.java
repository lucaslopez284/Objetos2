package ar.edu.unlp.objetos.uno.ej06_1;

public abstract class Empleado {
	protected String nombre;
    protected String apellido;
    protected double sueldoBasico = 0;
    
    public abstract double sueldo();

}
