package ar.edu.unlp.objetos.uno.ej13;

public class FalsoTanque extends MixingTank {
	
	private int heatPowerValue;
	private int mixerPowerValue;

	@Override
	public boolean heatPower(int percentage) {
		this.heatPowerValue = percentage;
		return true;
	}

	@Override
	public boolean mixerPower(int percentage) {
		this.mixerPowerValue = percentage;
		return true;
	}

	@Override
	public boolean purge() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double upTo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double temperature() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getHeatPowerValue() {
		return heatPowerValue;
	}

	public int getMixerPowerValue() {
		return mixerPowerValue;
	}
	
	

}
