package ar.edu.unlp.objetos.uno.ej10;

public class Restando extends Operando {

	@Override
	public void setValor(Double valor, Calculadora unaCalculadora) {
		unaCalculadora.setValorAcumulado(unaCalculadora.getValorAcumulado() - valor);

	}

}
