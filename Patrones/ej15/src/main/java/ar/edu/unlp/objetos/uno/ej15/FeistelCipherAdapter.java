package ar.edu.unlp.objetos.uno.ej15;

public class FeistelCipherAdapter implements Cifrador {
	private FeistelCipher feistelCipher;

	public FeistelCipherAdapter(String clave) {
		super();
		this.feistelCipher = new FeistelCipher(clave);
	}

	@Override
	public String cifrar(String mensaje) {
		return this.feistelCipher.encode(mensaje);
	}

	@Override
	public String descifrar(String mensaje) {
		return this.feistelCipher.encode(mensaje);
	}

}
