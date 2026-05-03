package ar.edu.unlp.objetos.uno.ej14;

public class GamerBuilder implements Builder {

    private Equipo equipo;
    private Catalogo catalogo;

    public GamerBuilder(Catalogo catalogo) {
        this.catalogo = catalogo;
        this.equipo = new Equipo();
    }

    @Override
    public void elegirProcesador() {
        equipo.agregarComponente(catalogo.getComponente("procesador gamer"));
        equipo.agregarComponente(catalogo.getComponente("pad termico"));
        equipo.agregarComponente(catalogo.getComponente("cooler"));
    }

    @Override
    public void elegirMemoria() {
        equipo.agregarComponente(catalogo.getComponente("32 gb"));
        equipo.agregarComponente(catalogo.getComponente("32 gb"));
    }

    @Override
    public void elegirDisco() {
        equipo.agregarComponente(catalogo.getComponente("ssd 500 gb"));
        equipo.agregarComponente(catalogo.getComponente("ssd 1 tb"));
    }

    @Override
    public void elegirTarjeta() {
        equipo.agregarComponente(catalogo.getComponente("rtx 4090"));
    }

    @Override
    public void elegirGabinete() {
        equipo.agregarComponente(catalogo.getComponente("gabinete gamer"));
        double consumoFuente = equipo.consumo() * 1.5;
        equipo.agregarComponente(catalogo.getComponente("fuente " + consumoFuente + " w"));
    }

    public Equipo equipo() {
        return equipo;
    }
}
