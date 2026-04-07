package ar.edu.unlp.objetos.uno.ej05;

public abstract class ElementoQuimico {
	//fórmula() que retorna un String que
	//Para átomos retorna su símbolo
	//Para uniones lo crea a partir de sus componentes (por ejemplo H20)
	//pesoMolecular() que retorna un Integer con el peso del elemento.
	//carga() que retorna un Integer con el valor de la carga
	//esValida()
	//para átomos siempre es “verdad” 
	//para uniones valida las reglas de combinación presentadas anteriormente.
	
	public abstract String formula();
	public abstract int pesoMolecular();
	public abstract int carga();
	public abstract boolean esValida();
	

}
