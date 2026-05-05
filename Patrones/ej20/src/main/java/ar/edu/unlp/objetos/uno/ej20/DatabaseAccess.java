package ar.edu.unlp.objetos.uno.ej20;
	
import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	Collection<String> getSearchResults(String queryString);
	int insertNewRow(List<String> rowData);
}


