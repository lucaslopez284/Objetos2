package ar.edu.unlp.objetos.uno.ej19;

public class CreacionDecorator extends ArchivoDecorator {

	public CreacionDecorator(Archivo archivo) {
		super(archivo);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.getFechaCreacion();
	}

}
