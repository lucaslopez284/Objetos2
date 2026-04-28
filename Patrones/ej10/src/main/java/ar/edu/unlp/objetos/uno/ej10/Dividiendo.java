package ar.edu.unlp.objetos.uno.ej10;

public class Dividiendo extends Operando {

	@Override
	public void setValor(Double valor, Calculadora unaCalculadora) {
		if (valor == 0) {
			unaCalculadora.setEstado(new Error());
		}
		else {
			unaCalculadora.setValorAcumulado(unaCalculadora.getValorAcumulado() / valor);
		}

	}

}
