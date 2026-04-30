package ar.edu.unlp.objetos.uno.ej15;

public class Mensajero {
	
	private Cifrador cifrador;
	
	public Mensajero(Cifrador cifrador) {
		super();
		this.cifrador = cifrador;
	}

	public void enviar(String mensaje) {
		System.out.println(this.cifrador.cifrar(mensaje));
	}
	
    public void recibir(String mensaje) {
		System.out.println(this.cifrador.descifrar(mensaje));
	}

	public void setCifrador(Cifrador cifrador) {
		this.cifrador = cifrador;
	}
    
    

}
