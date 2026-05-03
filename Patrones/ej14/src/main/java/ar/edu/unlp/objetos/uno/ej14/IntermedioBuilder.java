package ar.edu.unlp.objetos.uno.ej14;

public class IntermedioBuilder implements Builder {

    private Equipo equipo;
    private Catalogo catalogo;

    public IntermedioBuilder(Catalogo catalogo) {
        this.catalogo = catalogo;
        this.equipo = new Equipo();
    }

    @Override
    public void elegirProcesador() {
        equipo.agregarComponente(catalogo.getComponente("procesador intermedio"));
    }

    @Override
    public void elegirMemoria() {
        equipo.agregarComponente(catalogo.getComponente("16 gb"));
    }

    @Override
    public void elegirDisco() {
        equipo.agregarComponente(catalogo.getComponente("ssd 500 gb"));
    }

    @Override
    public void elegirTarjeta() {
        equipo.agregarComponente(catalogo.getComponente("gtx 1650"));
    }

    @Override
    public void elegirGabinete() {
        equipo.agregarComponente(catalogo.getComponente("gabinete intermedio"));
        equipo.agregarComponente(catalogo.getComponente("fuente 800 w"));
    }

    public Equipo equipo() {
        return equipo;
    }
}