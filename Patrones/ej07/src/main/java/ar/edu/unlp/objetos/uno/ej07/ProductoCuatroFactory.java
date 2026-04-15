package ar.edu.unlp.objetos.uno.ej07;

import java.util.ArrayList;
import java.util.List;

public class ProductoCuatroFactory implements FactoryProductoCombinado {

	@Override
	public List<ProductoFinanciero> factoryMethod() {
		List<ProductoFinanciero> lista = new ArrayList <ProductoFinanciero>();
		CompraBonoAltoRiesgo bonoAltoRiesgo1 = new CompraBonoAltoRiesgo(5);
		CompraBonoAltoRiesgo bonoAltoRiesgo2 = new CompraBonoAltoRiesgo(5);
		CompraBonoAltoRiesgo bonoAltoRiesgo3 = new CompraBonoAltoRiesgo(5);
		lista.add(bonoAltoRiesgo1);
		lista.add(bonoAltoRiesgo2);
		lista.add(bonoAltoRiesgo3);
		return lista;
	}

}
