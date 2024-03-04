package Figuras2daSolucion;

public class Contexto {

    private CalculadorArea calculadorArea;

    public Contexto(CalculadorArea calculadorArea) {
        this.calculadorArea = calculadorArea;
    }

    public void calcularArea(Figura figura) {
        figura.calcularArea(calculadorArea);
    }
}
