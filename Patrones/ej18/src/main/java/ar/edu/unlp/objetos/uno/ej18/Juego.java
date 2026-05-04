package ar.edu.unlp.objetos.uno.ej18;

public class Juego {
	private Personaje participanteUno;
	private Personaje participanteDos;
	
	
	public Juego(Personaje participanteUno, Personaje participanteDos) {
		super();
		this.participanteUno = participanteUno;
		this.participanteDos = participanteDos;
	}
	
	public void combatir() {
		if (this.participanteUno.estaVivo() && this.participanteDos.estaVivo()) {
			participanteUno.atacar(participanteDos);
			participanteDos.atacar(participanteUno);
		}
	}
	
	public Personaje ganador() {
		if (participanteUno.getVida() > participanteDos.getVida()){
			return participanteUno;
		}
		if (participanteUno.getVida() < participanteDos.getVida()){
			return participanteDos;
		}
		return null;
	}

}
