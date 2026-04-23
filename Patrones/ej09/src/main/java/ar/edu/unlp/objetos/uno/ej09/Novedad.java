package ar.edu.unlp.objetos.uno.ej09;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements Estrategia {

	public List<Pelicula> sugerirContenido(Decodificador unDecodificador) {
		return unDecodificador.getPeliculas().stream()
	            .filter(p -> !unDecodificador.getVistas().contains(p))
	            .sorted(Comparator.comparingInt(Pelicula::getEstreno)
	                .reversed())
	            .limit(3)
	            .collect(Collectors.toList());	
	}

}
