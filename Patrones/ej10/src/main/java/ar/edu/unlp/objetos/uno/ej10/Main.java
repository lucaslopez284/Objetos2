package ar.edu.unlp.objetos.uno.ej10;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora(); 
		calc.setValor(5); // Establece el valor inicial 
		calc.mas(); // Prepara para sumar 
		calc.setValor(3); // Suma 3 al valor acumulado 
		System.out.println(calc.resultado()); // Imprimirá "8.0"
		calculadora.por();
		calculadora.setValor(2);
		assertEquals(calculadora.resultado(), "16.0");
	}

}
