package ar.edu.unlp.objetos.uno.ej18;

public class Main {

	public static void main(String[] args) {
		MagoBuilder builderMago = new MagoBuilder("De hielo");
		ThoorBuilder builderThoor = new ThoorBuilder("Thoor fan");
		Director directorMago = new Director(builderMago);
		Director directorThoor = new Director(builderThoor);
		directorMago.construirPersonaje();
		directorThoor.construirPersonaje();
		
		Personaje magoHielo = builderMago.personaje();
		Personaje fanDeThoor = builderThoor.personaje();
		
		Juego disputa = new Juego(magoHielo, fanDeThoor);
		disputa.combatir();
		
		System.out.println(disputa.ganador().getNombre());
		
	}

}
