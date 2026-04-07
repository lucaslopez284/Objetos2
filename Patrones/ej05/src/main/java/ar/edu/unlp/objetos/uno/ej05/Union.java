package ar.edu.unlp.objetos.uno.ej05;

import java.util.List;

public class Union extends ElementoQuimico {
	
	private List<Atomo> partes;

	public Union(List<Atomo> partes) {
	    this.partes = partes;
	}

	public String formula() {
		// TODO Auto-generated method stub
		return null;
	}

	public int pesoMolecular() {
		return this.partes.stream()
				.mapToInt(p-> p.pesoMolecular())
				.sum();
	}

	public int carga() {
		return this.partes.stream()
				.mapToInt(p-> p.carga())
				.sum();
	}

	public boolean esValida() {
		return this.partes.stream()
				.filter(p->p.esMetal())
				.count() < 2;
	}
	
	public String estabilidad() {
		if (this.carga() == 0) {
			return "molecula";
		}
		else return "ion";
	}
	
}
