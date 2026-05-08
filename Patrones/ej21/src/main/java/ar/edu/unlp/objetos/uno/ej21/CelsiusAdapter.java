package ar.edu.unlp.objetos.uno.ej21;

import java.util.List;

public class CelsiusAdapter implements WeatherData {
	
	private HomeWeatherStation weatherStation;
	
	

	public CelsiusAdapter(HomeWeatherStation weatherStation) {
		super();
		this.weatherStation = weatherStation;
	}

	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return null;
	}

}
