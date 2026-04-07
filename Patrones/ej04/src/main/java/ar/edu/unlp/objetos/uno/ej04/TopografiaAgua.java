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

}
