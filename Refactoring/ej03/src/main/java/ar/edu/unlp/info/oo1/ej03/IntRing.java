package ar.edu.unlp.info.oo1.ej03;

public class IntRing extends Ring{
    private int[] source;

    public IntRing(int[] src) {
    	super();
        source = src;
    }

    public int next() {
        idx = validacion(source.length);
        return source[idx++];
    }
}

