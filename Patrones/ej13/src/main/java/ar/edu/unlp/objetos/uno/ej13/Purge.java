package ar.edu.unlp.objetos.uno.ej13;

public class Purge extends ProcessStep {
	protected boolean basicExecute(MixingTank tank) {
		return tank.heatPower(0) && tank.mixerPower(0) && tank.purge();
	}
}
