package ar.info.unlp.arboles;

public class ArbolBinarioNull implements ArbolBinario {

	public int getValor() {
		return 0;
	}

	public void setValor(int valor) {
	}

	public ArbolBinario getHijoIzquierdo() {
		return this;
	}

	public void setHijoIzquierdo(ArbolBinario hijoIzquierdo) {
	}

	public ArbolBinario getHijoDerecho() {
		return this;
	}

	public void setHijoDerecho(ArbolBinario hijoDerecho) {
	}

	public String recorrerPreorden() {
		return "";
	}

	public String recorrerInorden() {
		return "";
	}

	public String recorrerPostorden() {
		return "";
	}

}
