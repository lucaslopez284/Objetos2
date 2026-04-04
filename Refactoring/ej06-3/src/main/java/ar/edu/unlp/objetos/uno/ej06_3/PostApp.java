package ar.edu.unlp.objetos.uno.ej06_3;
import java.util.*;
import java.util.stream.Collectors;

public class PostApp {
	
	private List<Post> posts;

	public List<Post> ultimosPosts(Usuario user, int cantidad) {    
	    return posts.stream()
	    		.filter(p -> !p.getUsuario().equals(user))
	    		.sorted((post1, post2) -> post2.getFecha().compareTo(post1.getFecha()))
	    		.limit(cantidad)
	    		.collect(Collectors.toList());
	}


}
