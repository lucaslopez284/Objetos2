package ar.edu.unlp.objetos.uno.ej04;

public class TopografiaAgua extends Topografia {
	
	public TopografiaAgua() {
	}
	
	public double proporcionAgua() {
		return 1;
	}

	@Override
	public double proporcionTierra() {
		return 0;
	}

	
	public boolean compararConMixta(Topografia otraTopografia) {
		return false;
	}

	public boolean compararConAgua(Topografia otraTopografia) {
		return true;
	}

	public boolean compararConTierra(Topografia otraTopografia) {
		return false;
	}


	public boolean equals(Topografia otra) {
		return otra.compararConAgua(this);
	}
	
	
	
	

}
