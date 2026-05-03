package ar.edu.unlp.objetos.uno.ej14;
import java.util.*;

public class Catalogo {
	
	private List<Componente> componentes;

    public Catalogo() {
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente(Componente componente) {
        this.componentes.add(componente);
    }

    public Componente getComponente(String descripcion) {
        for (Componente c : componentes) {
            if (c.getDescripcion().equalsIgnoreCase(descripcion)) {
                return c;
            }
        }
        return null; // o lanzar excepción
    }
	
	

}
