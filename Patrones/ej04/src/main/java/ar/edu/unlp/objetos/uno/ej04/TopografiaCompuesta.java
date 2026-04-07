package ar.edu.unlp.objetos.uno.ej04;

import java.util.List;

public class TopografiaCompuesta extends Topografia{
	
	private List<Topografia> partes;
	
	public TopografiaCompuesta(List<Topografia> partes) {
		this.partes = partes;
	}
	
	public void agregarTopografia(Topografia nueva) {
		this.partes.add(nueva);
	}

	public double proporcionAgua() {
		return (double) this.partes.stream()
				.mapToDouble(p-> p.proporcionAgua())
				.sum()/ 4;
	}
	
	public double proporcionTierra() {
		return (double) this.partes.stream()
				.mapToDouble(p-> p.proporcionTierra())
				.sum()/ 4;
	}

}
