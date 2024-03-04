
package Figuras2daSolucion;

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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    public double getArea(){
        return area;
    }
    
    public double getPerimetro(){
        return perimetro;
    }
    
    
}