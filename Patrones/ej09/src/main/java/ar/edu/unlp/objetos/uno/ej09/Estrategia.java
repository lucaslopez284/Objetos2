package ar.edu.unlp.objetos.uno.ej09;
import java.util.List;

public interface Estrategia {
	
	public List<Pelicula> sugerirContenido(Decodificador unDecodificador);

}
