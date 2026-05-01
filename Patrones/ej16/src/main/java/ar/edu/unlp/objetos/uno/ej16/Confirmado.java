package ar.edu.unlp.objetos.uno.ej16;

public class Confirmado extends General {
	
	public String obtenerInformacion(Excursion unaExcursion) {
		return super.obtenerInformacion(unaExcursion)
				+ unaExcursion.getEmailUsuarios() 
				+ unaExcursion.faltantes(unaExcursion.getCupoMin()) + "\n";
	}
	
	public void inscribir(Excursion unaExcursion, Usuario unUsuario) {
		unaExcursion.agregarAInscriptos(unUsuario);
		if (unaExcursion.cantidadInscriptos() == unaExcursion.getCupoMax()) {
			unaExcursion.setEstado(new Completo());
		}
	}

}
