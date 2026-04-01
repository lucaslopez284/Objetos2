package ar.edu.unlp.info.oo1.ej07;

public abstract class Etiqueta {
	protected String nombreProducto;
    protected double precio;

    public Etiqueta(String nombre, double precio) {
        this.nombreProducto = nombre;
        this.precio = precio;
    }
    
    protected abstract void imprimirPrecio();
    
    protected abstract void imprimirTipo();
    
    public void generar() {
    	this.imprimirTipo();
        System.out.println("Producto: " + nombreProducto);
        this.imprimirPrecio();
        System.out.println("-----------------------");
    }


}
