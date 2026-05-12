package ar.info.unlp.arboles;

public interface ArbolBinario {
	
	public int getValor();
	public void setValor(int valor);
	public ArbolBinario getHijoIzquierdo();
	public void setHijoIzquierdo(ArbolBinario hijoIzquierdo);
	public ArbolBinario getHijoDerecho();
	public void setHijoDerecho(ArbolBinario hijoDerecho);
	public String recorrerPreorden();
	public String recorrerInorden();
	public String recorrerPostorden();

}
