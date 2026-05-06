package ar.edu.unlp.objetos.uno.ej21;

public class MinMaxDecorator extends Decorator {

	public MinMaxDecorator(WeatherData weatherComponent) {
		super(weatherComponent);
	}
	
	public String displayData() {
		double maximo = this.getTemperaturas().stream().mapToDouble(t -> t).max().orElse(0);
		double minimo = this.getTemperaturas().stream().mapToDouble(t -> t).min().orElse(0);
		return super.displayData() +
				"Minimo: " + minimo + 
				"Maximo: " + maximo;
	}

}
