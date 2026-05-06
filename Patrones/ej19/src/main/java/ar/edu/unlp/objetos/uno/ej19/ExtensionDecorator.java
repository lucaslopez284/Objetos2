package ar.edu.unlp.objetos.uno.ej19;

public class ExtensionDecorator extends ArchivoDecorator {

	public ExtensionDecorator(Archivo archivo) {
		super(archivo);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.getExtension();
	}
	
	

}
