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
	
	public void eliminarTopografia(Topografia aBorrar) {
		this.partes.remove(aBorrar);
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
	
	public boolean sonIguales(Topografia otra) {
		if (!this.sonIgualesProporcion(otra)) {
			return false;
		}
		return otra.compararConMixta(this);
	}

	@Override
	public boolean compararConMixta(Topografia otraTopografia) {
		// TODO Auto-generated method stub
		return this.partes.equals(otraTopografia);
	}

	@Override
	public boolean compararConAgua(Topografia otraTopografia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean compararConTierra(Topografia otraTopografia) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
