package ar.edu.unlp.objetos.uno.ej04;

public abstract class Topografia {

    public abstract double proporcionAgua();
    public abstract double proporcionTierra();
    
    public boolean sonIgualesProporcion(Topografia otra) {
    	return this.proporcionAgua() == otra.proporcionAgua() && this.proporcionTierra() == otra.proporcionTierra();
    }
    
    public boolean sonIguales(Topografia otra) {
    	return this.equals(otra);
    }
    public abstract boolean compararConMixta(Topografia otraTopografia);
    // doble dispach ?
    
    public abstract boolean compararConAgua(Topografia otraTopografia);
    
    public abstract boolean compararConTierra(Topografia otraTopografia);
    

}
