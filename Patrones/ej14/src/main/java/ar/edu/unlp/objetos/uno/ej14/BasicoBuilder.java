package ar.edu.unlp.objetos.uno.ej14;

public class BasicoBuilder implements Builder {
	 private Equipo equipo;
	 private Catalogo catalogo;
	 
	 public BasicoBuilder(Catalogo catalogo) {
	        this.catalogo = catalogo;
	        this.equipo = new Equipo();
	 }

	@Override
	public void elegirProcesador() {
		equipo.agregarComponente(catalogo.getComponente("procesador basico"));
	}

	@Override
	public void elegirMemoria() {
		equipo.agregarComponente(catalogo.getComponente("8 gb"));
	}

	@Override
	public void elegirDisco() {
		equipo.agregarComponente(catalogo.getComponente("hdd 500 gd"));
	}

	@Override
	public void elegirTarjeta() {
	}

	@Override
	public void elegirGabinete() {
		equipo.agregarComponente(catalogo.getComponente("gabinete estandar"));
	}
	
	public Equipo equipo() {
        return equipo;
    }

}
