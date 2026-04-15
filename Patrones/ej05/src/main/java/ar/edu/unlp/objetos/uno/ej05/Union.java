package ar.edu.unlp.objetos.uno.ej05;

import java.util.List;
import java.util.stream.Collectors;

public class Union extends ElementoQuimico {
	
	private List<Atomo> partes;

	public Union(List<Atomo> partes) {
	    this.partes = partes;
	}

	public String formula() {
		return partes.stream()
                .map(p -> p.formula())
                .collect(Collectors.joining());
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
