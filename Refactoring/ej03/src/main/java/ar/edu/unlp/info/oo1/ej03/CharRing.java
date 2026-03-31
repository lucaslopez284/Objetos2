package ar.edu.unlp.info.oo1.ej03;

public class CharRing extends Ring {
    private char[] source;

    public CharRing(String src) {
        source = src.toCharArray();
    }

    public char next() {
    	idx = validacion(source.length);
        return source[idx++];
    }
}

