package ar.edu.unlp.objetos.uno.ej06_1;

public class EmpleadoPasante extends Empleado{
	 
	    public double sueldo() {
	        return this.sueldoBasico - (this.sueldoBasico * 0.13);
	    }


}
