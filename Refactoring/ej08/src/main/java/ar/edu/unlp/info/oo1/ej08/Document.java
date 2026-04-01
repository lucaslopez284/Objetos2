package ar.edu.unlp.info.oo1.ej08;
import java.util.*;

public class Document {
    List<String> words;
  
    public long characterCount() {
    	return this.words
    			.stream()
    			.mapToLong(w -> w.length())
    			.sum();
	}
    
    public long averageCharactersInWords() {
    	return this.characterCount() / this.words.size();
	}
    // Resto del código que no importa
}

