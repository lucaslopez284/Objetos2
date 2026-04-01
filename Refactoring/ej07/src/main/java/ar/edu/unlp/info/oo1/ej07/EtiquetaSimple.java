package ar.edu.unlp.info.oo1.ej07;

public class EtiquetaSimple extends Etiqueta {
	public EtiquetaSimple(String nombre, double precio) {
        super(nombre, precio);
    }
	
    public void imprimirPrecio() {
    	System.out.println("Precio: $" + precio);
    }
    
    public void imprimirTipo() {
    	System.out.println("--- ETIQUETA BÁSICA ---");
    }
}
