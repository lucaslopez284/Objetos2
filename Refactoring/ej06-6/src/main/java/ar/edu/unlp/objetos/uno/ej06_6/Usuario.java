package ar.edu.unlp.objetos.uno.ej06_6;
import java.util.*;

public class Usuario {
	
	private String nombre;
	private Integer telefono;
	private Suscripcion tipoSubscripcion;
	private String email;
	private List<Pelicula> peliculasCompradas;

    public void setTipoSubscripcion(Suscripcion unTipo) {
   	 this.tipoSubscripcion = unTipo;
    }
    
    public double calcularCostoPelicula(Pelicula pelicula) {
   	  return this.tipoSubscripcion.calcularCostoPelicula(pelicula);
    }


}
