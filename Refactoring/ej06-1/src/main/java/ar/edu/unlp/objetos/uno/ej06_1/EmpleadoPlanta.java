package ar.edu.unlp.objetos.uno.ej06_1;

public class EmpleadoPlanta extends EmpleadoPasante{
    public int cantidadHijos = 0;
    
    public double sueldo() {
        return super.sueldo() + this.cantidadHijos * 2000;
    }


}
