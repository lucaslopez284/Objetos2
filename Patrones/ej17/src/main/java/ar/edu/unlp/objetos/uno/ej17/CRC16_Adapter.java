package ar.edu.unlp.objetos.uno.ej17;

public class CRC16_Adapter implements Strategy {
	private CRC16_Calculator crc16;

	@Override
	public int crcFor(String data) {
		// TODO Auto-generated method stub
		return (int) crc16.crcFor(data);
	}

}
