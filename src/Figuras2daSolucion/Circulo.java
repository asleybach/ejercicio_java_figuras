
package Figuras2daSolucion;


public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public void calcularArea(CalculadorArea calculadorArea) {
        //area = Math.PI * Math.pow(radio, 2);
        area = calculadorArea.calcularArea(radio);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea(){
        return area;
    }
    
    public double getPerimetro(){
        return perimetro;
    }

  
    
    
}