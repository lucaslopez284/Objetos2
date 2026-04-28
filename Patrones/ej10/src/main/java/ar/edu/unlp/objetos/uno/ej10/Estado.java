package ar.edu.unlp.objetos.uno.ej10;

public interface Estado {
	
	public abstract void setValor(Double valor, Calculadora unaCalculadora);
	public abstract String getResultado(Calculadora unaCalculadora);

}
