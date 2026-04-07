package ar.edu.unlp.objetos.uno.ej05;

public class Atomo extends ElementoQuimico {
	
	// nombre, símbolo, peso atómico (entero simplificado), carga típica y clasificación (metal / no metal).
	private String nombre;
	private String simbolo;
	private int peso;
	private int carga;
	private boolean esMetal;
	public boolean esMetal() {
		return esMetal;
	}
	
	@Override
	public String formula() {
		return this.simbolo;
	}

	@Override
	public int pesoMolecular() {
		return this.peso;
	}

	@Override
	public int carga() {
		return this.carga;
	}

	@Override
	public boolean esValida() {
		return true;
	}

}
