package ar.edu.unlp.objetos.uno.ej06_1;

public class EmpleadoTemporario extends EmpleadoPasante {
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
     return super.sueldo() + (this.horasTrabajadas * 500) + (this.cantidadHijos * 1000);
    }


}
