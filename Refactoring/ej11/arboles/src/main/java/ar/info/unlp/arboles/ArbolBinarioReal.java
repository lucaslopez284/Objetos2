package ar.info.unlp.arboles;

public class ArbolBinarioReal implements ArbolBinario {
    private int valor;
    private ArbolBinario hijoIzquierdo;
    private ArbolBinario hijoDerecho;

    public ArbolBinarioReal(int valor) {
        this.valor = valor;
        this.hijoIzquierdo = new ArbolBinarioNull();
        this.hijoDerecho = new ArbolBinarioNull();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArbolBinario getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(ArbolBinario hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public ArbolBinario getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(ArbolBinario hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

   public String recorrerPreorden() {
        String resultado = valor + " - ";
        resultado += this.getHijoIzquierdo().recorrerPreorden();
        resultado += this.getHijoDerecho().recorrerPreorden();
        return resultado;
    }

   public String recorrerInorden() {
        String resultado = "";
        resultado += this.getHijoIzquierdo().recorrerInorden();
        resultado += valor + " - ";
        resultado += this.getHijoDerecho().recorrerInorden();
        return resultado;
    }

   public String recorrerPostorden() {
        String resultado = "";
        resultado += this.getHijoIzquierdo().recorrerPostorden();
        resultado += this.getHijoDerecho().recorrerPostorden();
        resultado += valor + " - ";
        return resultado;
    }

}

