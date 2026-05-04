package ar.edu.unlp.objetos.uno.ej18;

public class Acero implements Armadura {

	@Override
	public int recibirDanioEspada() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int recibirDanioArco() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int recibirDanioBaston() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public int recibirDanioMartillo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
