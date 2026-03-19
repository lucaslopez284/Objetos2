package ar.edu.unlp.info.oo1.ej02;

public class Tijera implements Jugada {
	
	public Tijera() {
	
	}
	
	public String juegaContraPiedra(Piedra pie) {
		return "Gano Piedra";
	}
	
	public String juegaContraPapel(Papel pap) {
		return "Gano Tijera";
	}
	
	public String juegaContraTijera(Tijera tij) {
		return "Empate";
	}
	
	public String juegaContraLagarto(Lagarto lag) {
		return "Gano Tijera";
	}
	
	public String juegaContraSpock(Spock spo){
		return "Gano Spock";
	}

}
