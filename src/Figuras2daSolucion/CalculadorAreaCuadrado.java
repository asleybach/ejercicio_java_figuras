
package Figuras2daSolucion;




public class CalculadorAreaCuadrado implements CalculadorArea {

    @Override
    public double calcularArea(double... parametros) {
        double lado = parametros[0];
        return (Math.pow(lado, 2));
    }
}


