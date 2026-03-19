package ar.edu.unlp.info.oo1.ej02;

public class Spock implements Jugada{
	
	public Spock() {
		
	}
	
	public String juegaContraPiedra(Piedra pie) {
		return "Gano Spock";
	}
	
	public String juegaContraPapel(Papel pap) {
		return "Gano Papel";
	}
	
	public String juegaContraTijera(Tijera tij) {
		return "Gano Spock";
	}
	
	public String juegaContraLagarto(Lagarto lag) {
		return "Gano Lagarto";
	}
	
	public String juegaContraSpock(Spock spo){
		return "Empate";
	}

}
