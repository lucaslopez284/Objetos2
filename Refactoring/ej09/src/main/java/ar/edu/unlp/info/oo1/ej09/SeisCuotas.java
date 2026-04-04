package ar.edu.unlp.info.oo1.ej09;

public class SeisCuotas implements FormaDePago {
	
	
	public SeisCuotas() {
		super();
	}

	public double calcularExtra(Double costo) {
		return costo * 0.2;
	}

}
