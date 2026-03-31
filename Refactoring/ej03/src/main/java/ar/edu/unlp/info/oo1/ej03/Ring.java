package ar.edu.unlp.info.oo1.ej03;

public abstract class Ring {
	
	protected int idx;
	

	public Ring() {
		this.idx = 0;
	}
	
	protected int validacion(int longitud) {
		if (idx > longitud) {
			return 0;
		}
		else return idx;
	}
	
	

}
