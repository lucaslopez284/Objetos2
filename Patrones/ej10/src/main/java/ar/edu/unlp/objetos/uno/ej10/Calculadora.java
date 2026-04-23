package ar.edu.unlp.objetos.uno.ej10;

public class Calculadora {
	
	private double double valorActual;
	private boolean error;
	private boolean valorSeteado;
	
	/**
 	* Devuelve el resultado actual de la operación realizada.
    * Si no se ha realizado ninguna operación, devuelve el valor acumulado.
    * Si la calculadora se encuentra en error, devuelve “error”
    */
    public String getResultado() {
    	return String(this.result);
    }


    /**
     * Pone en cero el valor acumulado y reinicia la calculadora
     */
    public void borrar() {
    	
    }


    /**
     * Asigna un valor para operar. 
     * si hay una operación en curso, el valor será utilizado en la operación
     */
    public void setValor(double unValor) {
    	
    }


    /**
    * Indica que la calculadora debe esperar un nuevo valor. 
    * Si a continuación se le envía el mensaje setValor(), la calculadora sumará
    * el valor recibido como parámetro, al valor actual y guardará el resultado 
    */
    public void mas() {
    	
    }
    
    public void menos() {
    	
    }
    
    public void por() {
    	
    }
    
    public void dividido() {
    	
    }



}
