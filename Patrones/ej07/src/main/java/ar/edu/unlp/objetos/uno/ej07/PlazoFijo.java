package ar.edu.unlp.objetos.uno.ej07;

public class PlazoFijo extends ProductoFinanciero {
	
	private int cantidadDias;
	private double interes;

	public PlazoFijo(int cantidadDias, double interes) {
		super();
		this.cantidadDias = cantidadDias;
		this.interes = interes;
	}

	@Override
	public double retornoInversion(double montoInicial) {
		// TODO Auto-generated method stub
		return 0;
	}

}
