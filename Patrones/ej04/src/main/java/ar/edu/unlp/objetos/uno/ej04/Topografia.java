package ar.edu.unlp.objetos.uno.ej04;

public abstract class Topografia {

    public abstract double proporcionAgua();
    public abstract double proporcionTierra();

    public boolean sonIgualesEnProporcion(Topografia otra) {
        return Math.abs(this.proporcionAgua() - otra.proporcionAgua()) < 0.0001 
        		&& Math.abs(this.proporcionTierra() - otra.proporcionTierra()) < 0.0001;
    }
    

}
