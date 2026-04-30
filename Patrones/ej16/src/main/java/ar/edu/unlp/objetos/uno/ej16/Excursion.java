package ar.edu.unlp.objetos.uno.ej16;
import java.util.*;
import java.time.*;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String encuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private List<Usuario> inscriptos;
	private List<Usuario> listaDeEspera;
	private Estado estado;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, 
			String encuentro, double costo, int cupoMin, int cupoMax, Estado estado) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.encuentro = encuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.inscriptos = new ArrayList<Usuario>();
		this.listaDeEspera = new ArrayList<Usuario>();
	}
	
	private void agregarAListaDeEspera(Usuario unUsuario) {
		this.listaDeEspera.add(unUsuario);
	}
	
	public void inscribir(Usuario unUsuario) {
		if (this.inscriptos.size() < this.cupoMin) {
			this.inscriptos.add(unUsuario);
		}
			this.agregarAListaDeEspera(unUsuario);
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMin() {
		return cupoMin;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public String getEncuentro() {
		return encuentro;
	}

	public int faltantes(int cupo) {
		return cupo - this.inscriptos.size();
	}
	
	public String getEmailUsuarios() {
		String listaUsuarios = "";
		for(Usuario usuario: this.inscriptos) {
			listaUsuarios += usuario.getEmail() + "\n";
		}	
		return listaUsuarios;
	}
	
	
	
	
	
}
