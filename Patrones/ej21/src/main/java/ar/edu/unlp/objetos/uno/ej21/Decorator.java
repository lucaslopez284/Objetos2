package ar.edu.unlp.objetos.uno.ej21;

import java.util.List;

public abstract class Decorator implements WeatherData {
	
	protected WeatherData weatherComponent;

	public Decorator(WeatherData weatherComponent) {
		super();
		this.weatherComponent = weatherComponent;
	}

	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return weatherComponent.getTemperatura();
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return weatherComponent.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return weatherComponent.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return weatherComponent.getTemperaturas();
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return weatherComponent.displayData();
	}

}
