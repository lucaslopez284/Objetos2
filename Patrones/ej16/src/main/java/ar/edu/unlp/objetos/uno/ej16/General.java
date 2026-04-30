package ar.edu.unlp.objetos.uno.ej16;

public abstract class General implements Estado {

	@Override
	public String obtenerInformacion(Excursion unaExcursion) {
		return unaExcursion.getNombre() +"\n"
				+ unaExcursion.getCosto() +"\n"
				+ unaExcursion.getFechaInicio() +"\n"
				+ unaExcursion.getFechaFin() +"\n"
				+ unaExcursion.getEncuentro() +"\n";
	}

}
