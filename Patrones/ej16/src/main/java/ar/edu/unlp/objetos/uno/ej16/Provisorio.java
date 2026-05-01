package ar.edu.unlp.objetos.uno.ej16;

public class Provisorio extends General {
	
	public String obtenerInformacion(Excursion unaExcursion) {
		return super.obtenerInformacion(unaExcursion)
				+ unaExcursion.faltantes(unaExcursion.getCupoMin());
	}
	
	public void inscribir(Excursion unaExcursion, Usuario unUsuario) {
		unaExcursion.agregarAInscriptos(unUsuario);
		if (unaExcursion.cantidadInscriptos() == unaExcursion.getCupoMin()) {
			unaExcursion.setEstado(new Confirmado());
		}
	}

}
