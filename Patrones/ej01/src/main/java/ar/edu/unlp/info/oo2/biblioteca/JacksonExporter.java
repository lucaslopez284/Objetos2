package ar.edu.unlp.info.oo2.biblioteca;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JacksonExporter extends VoorheesExporter {

	@Override
	public String exportar(List<Socio> socios) {
	    ObjectMapper mapper = new ObjectMapper();
	    try {
	        return mapper.writeValueAsString(socios);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}

}
