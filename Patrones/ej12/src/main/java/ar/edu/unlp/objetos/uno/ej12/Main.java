package ar.edu.unlp.objetos.uno.ej12;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("Lucas");
		AutoEnAlquiler auto = new AutoEnAlquiler(10, 5, "Ford");
		usuario.agregarAutoEnAlquiler(auto);
		Reserva reserva = new Reserva(auto, 10, LocalDate.of(2026, 4, 30), new Flexible());
		System.out.println("El monto a retornar con la politica de cancelacion flexible es: " + reserva.montoAReembolsar());
		reserva.setPolitica(new Moderada());
		System.out.println("El monto a retornar con la politica de cancelacion moderada es: " + reserva.montoAReembolsar());
	}

}
