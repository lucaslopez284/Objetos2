package ar.edu.unlp.objetos.uno.ej19;

public class PermisosDecorator extends ArchivoDecorator {

	public PermisosDecorator(Archivo archivo) {
		super(archivo);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.getPermisos();
	}

}
