package ar.edu.unlp.info.oo1.ej01;

public class Retweet implements Publicacion{
	private Tweet origen;
	
	public Retweet(Tweet origen) {
		super();
		this.origen = origen;
	}
	
	public String getMensaje() {
		return this.origen.getMensaje();
	}
	
	public boolean esRt() {
		return true;
	}
}
