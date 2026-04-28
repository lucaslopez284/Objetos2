package ar.edu.unlp.objetos.uno.ej10;

public class Calculadora {
	private double valorAcumulado;
	private Estado estado;
	private boolean esperandoValor;
	
	public Calculadora() {
		super();
		this.valorAcumulado = 0;
		this.estado = new Inicio();
		this.esperandoValor = true;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	public double getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(double valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}


	/**
 	* Devuelve el resultado actual de la operación realizada.
    * Si no se ha realizado ninguna operación, devuelve el valor acumulado.
    * Si la calculadora se encuentra en error, devuelve “error”
    */
    public String getResultado() {
    	return this.estado.getResultado(this);
    }


    /**
     * Pone en cero el valor acumulado y reinicia la calculadora
     */
    public void borrar() {
    	this.valorAcumulado = 0;
		this.estado = new Inicio();
		this.esperandoValor = true;
    }


    /**
     * Asigna un valor para operar. 
     * si hay una operación en curso, el valor será utilizado en la operación
     */
    public void setValor(double unValor) { 	
    	if (this.esperandoValor) {
    		this.estado.setValor(unValor, this);
        	this.esperandoValor = false;
    	}
    	else {
    		this.setEstado(new Error());
    	}
    }


    /**
    * Indica que la calculadora debe esperar un nuevo valor. 
    * Si a continuación se le envía el mensaje setValor(), la calculadora sumará
    * el valor recibido como parámetro, al valor actual y guardará el resultado 
    */
    public void mas() {
    	if (!this.esperandoValor) {
    		this.setEstado(new Sumando());
        	this.esperandoValor = true;
    	}
    	else {
    		this.setEstado(new Error());
    	}
    }
    
    public void menos() {
    	if (!this.esperandoValor) {
    		this.setEstado(new Restando());
        	this.esperandoValor = true;
    	}
    	else {
    		this.setEstado(new Error());
    	}
    }
    
    public void por() {
    	if (!this.esperandoValor) {
    		this.setEstado(new Multiplicando());
        	this.esperandoValor = true;
    	}
    	else {
    		this.setEstado(new Error());
    	}
    }
    
    public void dividido() {
    	if (!this.esperandoValor) {
    		this.setEstado(new Dividiendo());
        	this.esperandoValor = true;
    	}
    	else {
    		this.setEstado(new Error());
    	}
    }



}
