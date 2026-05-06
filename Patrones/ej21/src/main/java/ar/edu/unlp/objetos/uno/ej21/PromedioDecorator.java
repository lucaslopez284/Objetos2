package ar.edu.unlp.objetos.uno.ej21;

public class PromedioDecorator extends Decorator {

	public PromedioDecorator(WeatherData weatherComponent) {
		super(weatherComponent);
	}
	
	public String displayData() {
		double promedio = this.getTemperaturas().stream().mapToDouble(t -> t).sum() / this.getTemperaturas().stream().mapToDouble(t -> t).count();
		return super.displayData() +
				"Promedio: " + promedio;
	}

}
