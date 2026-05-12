package ar.edu.unlp.objetos.uno.ej12;

public class TrianguloRectangulo {
       private int base; 
       private int altura; 

       public TrianguloRectangulo(int valorBase, int valorAltura) {
          this.base = valorBase;
          this.altura = valorAltura;
       }

      public int getBase() {
          return this.base;
      }
      public int getAltura() {
          return this.altura;
      }

      public double calcularArea(double base) {
          return (this.altura * this.base) / 2;
      }
}