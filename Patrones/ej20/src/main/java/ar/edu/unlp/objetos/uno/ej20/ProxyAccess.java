package ar.edu.unlp.objetos.uno.ej20;

import java.util.Collection;
import java.util.List;

public class ProxyAccess implements DatabaseAccess {
	private String password;
	private boolean loggedIn; 
	private DatabaseRealAccess dbRealAccess;
	
	
	
	public void logIn(String password) {
		if (this.password.equals(password)) {
			this.loggedIn = true;
		}
	}
	
	public void logOut(String password) {
		this.loggedIn = false;
	}
	
	private boolean isLoggedIn() {
		return this.isLoggedIn();
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.isLoggedIn()) {
			return this.dbRealAccess.getSearchResults(queryString);
		}
		return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.isLoggedIn()) {
			return this.dbRealAccess.insertNewRow(rowData);
		}
		return 0;
	}
	

}
