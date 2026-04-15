package ar.edu.unlp.objetos.uno.ej07;

import java.util.ArrayList;
import java.util.List;

public class ProductoDosFactory implements FactoryProductoCombinado {
	
	

	@Override
	public List<ProductoFinanciero> factoryMethod() {
		List<ProductoFinanciero> lista = new ArrayList <ProductoFinanciero>();
		CompraBonoBajoRiesgo bonoBajoRiesgo = new CompraBonoBajoRiesgo(5);
		CompraDolares compraDolares = new CompraDolares(1000);
		PlazoFijo plazoFijo = new PlazoFijo(35, 5); 
		CompraPesos compraPesos = new CompraPesos (950);
		lista.add(bonoBajoRiesgo);
		lista.add(compraDolares);
		lista.add(plazoFijo);
		lista.add(compraPesos);
		return lista;
	}

}
