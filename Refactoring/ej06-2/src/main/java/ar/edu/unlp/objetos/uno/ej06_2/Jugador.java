package ar.edu.unlp.objetos.uno.ej06_2;

public class Jugador {
	public String nombre;
    public String apellido;
    public int puntuacion = 0;
    
    public void incrementar() {
        puntuacion = this.puntuacion + 100;
    }
    public void decrementar() {
    	puntuacion = this.puntuacion - 50;
    }



}
