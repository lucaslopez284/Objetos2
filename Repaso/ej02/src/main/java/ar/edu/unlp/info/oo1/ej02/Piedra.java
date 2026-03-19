package ar.edu.unlp.info.oo1.ej02;

public class Piedra implements Jugada {
	
	public Piedra() {
		
	}


	public String juegaContraPiedra(Piedra pie) {
		return "Empate";
	}
	
	public String juegaContraPapel(Papel pap) {
		return "Gano Papel";
	}
	
	public String juegaContraTijera(Tijera tij) {
		return "Gano Piedra";
	}
	
	public String juegaContraLagarto(Lagarto lag) {
		return "Gano Piedra";
	}
	
	public String juegaContraSpock(Spock spo){
		return "Gano Spock";
	}

}
