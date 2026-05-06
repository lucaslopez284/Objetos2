package ar.edu.unlp.objetos.uno.ej19;

public class EspacioDecorator extends ArchivoDecorator {

	public EspacioDecorator(Archivo archivo) {
		super(archivo);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.getEspacio();
	}

}
