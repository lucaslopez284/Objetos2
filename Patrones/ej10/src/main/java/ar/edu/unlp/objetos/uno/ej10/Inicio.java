package ar.edu.unlp.objetos.uno.ej10;

public class Inicio implements Estado {

	@Override
	public void setValor(Double valor, Calculadora unaCalculadora) {
		unaCalculadora.setValorAcumulado(valor);
	}
	
	public String getResultado(Calculadora unaCalculadora) {
		return "0";
	}

}
