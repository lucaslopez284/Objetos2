package ar.edu.unlp.objetos.uno.ej14;

import java.util.List;

public class Equipo {
	
	private List<Componente> componentes;
	
	public void agregarComponente(Componente componente) {
		this.componentes.add(componente);
	}
	
	public double precio() {
		return this.componentes.stream().mapToDouble(com -> com.getPrecio()).sum() * 1.21;
	}
	
	public double consumo() {
		return this.componentes.stream().mapToDouble(com -> com.getConsumo()).sum();
	}
	
}
