package ar.edu.unlp.objetos.uno.ej18;

public class Espada implements Arma {

	@Override
	public int atacar(Armadura armadura) {
		// TODO Auto-generated method stub
		return armadura.recibirDanioEspada();
	}

}
