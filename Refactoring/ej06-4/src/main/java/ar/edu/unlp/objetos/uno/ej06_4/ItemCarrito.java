package ar.edu.unlp.objetos.uno.ej06_4;

public class ItemCarrito {
	
	private Producto producto;
    private int cantidad;
        
    public Producto getProducto() {
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
    
    public double calcularCosto() {
    	return this.getProducto().getPrecio() * this.getCantidad();
    }


}
