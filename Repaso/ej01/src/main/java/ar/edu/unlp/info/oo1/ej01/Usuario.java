package ar.edu.unlp.info.oo1.ej01;
import java.util.*;
import java.util.stream.Collectors;

public class Usuario {
	private String screenName;
	private List<Publicacion> tweets;

	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Publicacion>();
	}

	public String getScreenName() {
		return screenName;
	}
	
	
	private boolean cumpleConLong(String msj) {
		return msj.length() >= 1 && msj.length() <= 128;
	}
	
	public Tweet twittear(String mensaje) {
		Tweet twNuevo = null;
		if (this.cumpleConLong(mensaje)) {
			twNuevo = new Tweet(mensaje);
			this.tweets.add(twNuevo);
		}
		return twNuevo;
	}
	
	public Retweet darRt(Tweet origen) {
		Retweet nuevoRt = new Retweet(origen);
	    this.tweets.add(nuevoRt);
	    return nuevoRt;
	}
	
	public void eliminarTweets() {
		this.tweets.clear();
	}
	
	public List<Tweet> getTweets(){
		return this.tweets.stream().filter(tw -> !tw.esRt()).map(tw -> (Tweet) tw).collect(Collectors.toList());
	}
	
	public List<Publicacion> getPublicaciones(){
		return new ArrayList<Publicacion>(this.tweets);
	}
	

	
	
	
	
	
}
