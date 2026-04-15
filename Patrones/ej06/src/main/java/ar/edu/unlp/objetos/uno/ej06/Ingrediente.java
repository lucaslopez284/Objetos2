package ar.edu.unlp.objetos.uno.ej06;

public class Ingrediente {
	private String nombre;
    private double precio;

    public Ingrediente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

}
