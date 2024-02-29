
package Ejercicios_Figuras;

public class Triangulo extends Figura {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;       
    }

    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = base + lado1 + lado2;
    }
  
    
}