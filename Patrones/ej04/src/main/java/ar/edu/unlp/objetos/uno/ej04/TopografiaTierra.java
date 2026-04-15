package ar.edu.unlp.objetos.uno.ej04;

public class TopografiaTierra extends Topografia {
	
	public TopografiaTierra() {
	}

	public double proporcionAgua() {
		return 0;
	}

	public double proporcionTierra() {
		return 1;
	}
	
	public boolean compararConMixta(Topografia otraTopografia) {
		return false;
	}
	
	public boolean compararConAgua(Topografia otraTopografia) {
		return false;
	}

	public boolean compararConTierra(Topografia otraTopografia) {
		return true;
	}
	
	public boolean equals(Topografia otra) {
		return otra.compararConTierra(this);
	}


}
