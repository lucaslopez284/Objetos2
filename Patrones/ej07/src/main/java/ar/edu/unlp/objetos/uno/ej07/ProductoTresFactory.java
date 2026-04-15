package ar.edu.unlp.objetos.uno.ej07;

import java.util.ArrayList;
import java.util.List;

public class ProductoTresFactory implements FactoryProductoCombinado {

	@Override
	public List<ProductoFinanciero> factoryMethod() {
		List<ProductoFinanciero> lista = new ArrayList <ProductoFinanciero>();
		CompraBonoAltoRiesgo bonoAltoRiesgo = new CompraBonoAltoRiesgo(5);
		CompraBonoBajoRiesgo bonoBajoRiesgo = new CompraBonoBajoRiesgo(5);
		PlazoFijo plazoFijo = new PlazoFijo(35, 5); 
		lista.add(bonoAltoRiesgo);
		lista.add(bonoBajoRiesgo);
		lista.add(plazoFijo);
		return lista;
	}

}
