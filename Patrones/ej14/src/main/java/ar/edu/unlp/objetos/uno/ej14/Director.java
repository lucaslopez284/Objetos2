package ar.edu.unlp.objetos.uno.ej14;

public class Director {
	
    private Builder builder;
    
    
	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	
	public void armarComputadora() {
		builder.elegirProcesador();
        builder.elegirMemoria();
        builder.elegirDisco();
        builder.elegirTarjeta();
        builder.elegirGabinete();
	}

}
