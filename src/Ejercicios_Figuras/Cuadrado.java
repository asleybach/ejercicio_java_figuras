
package Ejercicios_Figuras;


public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        area = Math.pow(lado, 2);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 4 * lado;
    }

   
}