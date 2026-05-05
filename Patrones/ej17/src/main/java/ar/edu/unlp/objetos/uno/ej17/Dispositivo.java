package ar.edu.unlp.objetos.uno.ej17;

public class Dispositivo {
	
	private Strategy crcCalculator;
	private Connection connection;
	private Ringer ringer;
	
	public Dispositivo(Strategy crcCalculator, Connection connection, Ringer ringer) {
		super();
		this.crcCalculator = crcCalculator;
		this.connection = connection;
		this.ringer = ringer;
	}



	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
		
	}



	public void setCrc(Strategy crcCalculator) {
		this.crcCalculator = crcCalculator;
	}
	
	
	
	

}
