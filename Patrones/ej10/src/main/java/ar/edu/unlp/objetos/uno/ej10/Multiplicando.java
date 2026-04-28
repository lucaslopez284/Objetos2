package ar.edu.unlp.objetos.uno.ej10;

public class Multiplicando extends Operando {

	@Override
	public void setValor(Double valor, Calculadora unaCalculadora) {
		unaCalculadora.setValorAcumulado(unaCalculadora.getValorAcumulado() * valor);

	}

}
