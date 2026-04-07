package ar.edu.unlp.objetos.uno.ej03;

import java.util.List;

public class MediaPlayer {
	
	private List<Media> media;
	
	public void play() {
		for (Media m :media) {
			m.play();
		}
	}

}
