package ar.edu.unlp.objetos.uno.ej20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProxyAccess implements DatabaseAccess {
	private String password;
	private boolean loggedIn; 
	private DatabaseRealAccess dbRealAccess;
	
	
	
	
	
	public ProxyAccess(String password, DatabaseRealAccess database) {
		super();
		this.password = password;
		this.loggedIn = false;
		this.dbRealAccess = database;
	}

	public void logIn(String password) {
		if (this.password.equals(password)) {
			this.loggedIn = true;
		}
	}
	
	public void logOut() {
		this.loggedIn = false;
	}
	
	private boolean isLoggedIn() {
		return this.loggedIn;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.isLoggedIn()) {
			return this.dbRealAccess.getSearchResults(queryString);
		}
		return new ArrayList<>();
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.isLoggedIn()) {
			return this.dbRealAccess.insertNewRow(rowData);
		}
		return 0;
	}
	

}
