
package Ejercicios_Figuras;

import static Ejercicios_Figuras.FiguraFactory.calcularAreaCuadrado;
import static Ejercicios_Figuras.FiguraFactory.calcularPerimetroCuadrado;


public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        //area = Math.pow(lado, 2);
        area = calcularAreaCuadrado(lado);
    }

    @Override
    public void calcularPerimetro() {
        //perimetro = 4 * lado;
        perimetro = calcularPerimetroCuadrado(lado);
    }

   
}