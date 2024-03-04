package Figuras2daSolucion;


public class CalculadorAreaCirculo implements CalculadorArea {

    @Override
    public double calcularArea(double... parametros) {
        double radio = parametros[0];
        return (Math.PI * Math.pow(radio, 2));
    }
}


