package ar.edu.unlp.objetos.uno.ej18;

public class Baston implements Arma {

	@Override
	public int atacar(Armadura armadura) {
		// TODO Auto-generated method stub
		return armadura.recibirDanioBaston();
	}

}
