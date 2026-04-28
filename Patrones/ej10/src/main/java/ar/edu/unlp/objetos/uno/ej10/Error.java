package ar.edu.unlp.objetos.uno.ej10;

public class Error implements Estado {

	@Override
	public void setValor(Double valor, Calculadora unaCalculadora) {
	}
	
	public String getResultado(Calculadora unaCalculadora) {
		return "Error";
	}

}
