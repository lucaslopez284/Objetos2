package ar.edu.unlp.info.oo1.ej02;

public class Papel implements Jugada {
	
    public Papel() {
		
	}
	
	public String juegaContraPiedra(Piedra pie) {
		return "Gano Papel";
	}
	
	public String juegaContraPapel(Papel pap) {
		return "Empate";
	}
	
	public String juegaContraTijera(Tijera tij) {
		return "Gano Tijera";
	}
	
	public String juegaContraLagarto(Lagarto lag) {
		return "Gano Lagarto";
	}
	
	public String juegaContraSpock(Spock spo){
		return "Gano Papel";
	}

}
