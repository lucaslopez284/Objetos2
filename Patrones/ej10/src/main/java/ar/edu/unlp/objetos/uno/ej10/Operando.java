package ar.edu.unlp.objetos.uno.ej10;

public abstract class Operando implements Estado {

	@Override
	public abstract void setValor(Double valor, Calculadora unaCalculadora);

	public String getResultado(Calculadora unaCalculadora) {
		return String.valueOf(unaCalculadora.getValorAcumulado());
	}

}
