package ar.edu.unlp.info.oo1.ej02;

public class Lagarto implements Jugada {
	
    public Lagarto() {
		
	}
	
	public String juegaContraPiedra(Piedra pie) {
		return "Gano Piedra";
	}
	
	public String juegaContraPapel(Papel pap) {
		return "Gano Lagarto";
	}
	
	public String juegaContraTijera(Tijera tij) {
		return "Gano Tijera";
	}
	
	public String juegaContraLagarto(Lagarto lag) {
		return "Empate";
	}
	
	public String juegaContraSpock(Spock spo){
		return "Gano Lagarto";
	}
	
	

}
