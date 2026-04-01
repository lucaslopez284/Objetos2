package ar.edu.unlp.info.oo1.ej07;

public class EtiquetaDetalle extends Etiqueta {
	public EtiquetaDetalle(String nombre, double precio) {
        super(nombre, precio);
    }
        
    public void imprimirPrecio() {
    	System.out.println("Precio sin imp.: $" + (precio * 0.79));
        System.out.println("Precio final: $" + precio);
    }
    
    public void imprimirTipo() {
    	System.out.println("--- ETIQUETA DETALLE ---");
    }

}
