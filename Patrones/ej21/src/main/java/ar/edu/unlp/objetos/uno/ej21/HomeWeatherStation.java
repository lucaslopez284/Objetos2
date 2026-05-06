package ar.edu.unlp.objetos.uno.ej21;

import java.util.List;

public class HomeWeatherStation implements WeatherData {

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
		return "Temperatura F: " + this.getTemperatura() +
			   	  "Presión atmosf: " + this.getPresion() +
			   	  "Radiación solar: " + this.getRadiacionSolar();
	}

}
