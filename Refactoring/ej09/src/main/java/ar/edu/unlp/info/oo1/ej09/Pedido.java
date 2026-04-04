package ar.edu.unlp.info.oo1.ej09;
import java.time.*;
import java.util.*;

public class Pedido {
	
	  private Cliente cliente;
	  private List<Producto> productos;
	  private FormaDePago formaPago;
	  public Pedido(Cliente cliente, List<Producto> productos, FormaDePago formaPago) {
	    this.cliente = cliente;
	    this.productos = productos;
	    this.formaPago = formaPago;
	   }
	   public double getCostoTotal() {
	     double costoProductos = this.productos.stream()
	    		 .mapToDouble(producto -> producto.getPrecio())
	    		 .sum();
	     costoProductos = this.formaPago.calcularExtra(costoProductos);
	     if (this.cliente.añosDesdeFechaAlta()> 5) {
	       return costoProductos * 0.9;
	     }
	     return costoProductos;
	   }
	}



