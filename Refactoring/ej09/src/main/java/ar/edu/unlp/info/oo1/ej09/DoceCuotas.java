package ar.edu.unlp.info.oo1.ej09;

public class DoceCuotas implements FormaDePago {

	public double calcularExtra(Double costo) {
		return costo * 0.5;
	}

}
