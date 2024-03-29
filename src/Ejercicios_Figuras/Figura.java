
package Ejercicios_Figuras;

public abstract class Figura {

    protected double area;
    protected double perimetro;

    public abstract void calcularArea();
    public abstract void calcularPerimetro();    
    
    public double Area() {
        return area;
    }

    public double Perimetro() {
        return perimetro;
    }
}
