package ar.edu.unlp.objetos.uno.ej07;

import java.util.ArrayList;
import java.util.List;

public class ProductoUnoFactory implements FactoryProductoCombinado {

	@Override
	public List<ProductoFinanciero> factoryMethod() {
		List<ProductoFinanciero> lista = new ArrayList <ProductoFinanciero>();
		CompraDolares compraDolares = new CompraDolares(1000); 
		PlazoFijo plazoFijo = new PlazoFijo(35, 5); 
		CompraPesos compraPesos = new CompraPesos (950);
		lista.add(plazoFijo);
		lista.add(compraPesos);
		return lista;
	}

}
