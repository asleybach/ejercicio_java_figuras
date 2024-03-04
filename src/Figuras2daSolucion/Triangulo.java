
package Figuras2daSolucion;

public class Triangulo extends Figura {

    private double base;
    private double altura;

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
        perimetro = base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getArea(){
        return area;
    }
    
    public double getPerimetro(){
        return perimetro;
    }


}