package ar.edu.unlp.objetos.uno.ej16;

public class Completo extends General {
	
	public void inscribir(Excursion unaExcursion, Usuario unUsuario) {
		unaExcursion.agregarAListaDeEspera(unUsuario);
	}

}
