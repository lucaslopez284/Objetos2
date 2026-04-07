package ar.edu.unlp.info.oo2.biblioteca;
import org.json.simple.JSONObject;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class JSONExporter extends VoorheesExporter{
	
	
	public JSONExporter() {
		super();
	}

	private JSONObject exportar(Socio socio) {
		JSONObject json = new JSONObject();
		json.put("nombre", socio.getNombre());
		json.put("email", socio.getEmail());
		json.put("legajo", socio.getLegajo());
		return json;
	}
	
	public String exportar(List<Socio> socios) {
		JSONArray array = new JSONArray();
	    socios.stream().forEach(s-> array.add(this.exportar(s)));
		return array.toJSONString();
	}

}
