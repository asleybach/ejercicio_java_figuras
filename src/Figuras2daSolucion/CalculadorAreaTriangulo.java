
package Figuras2daSolucion;

public class CalculadorAreaTriangulo implements CalculadorArea {

    @Override
    public double calcularArea(double... parametros) {
        double base = parametros[0];
        double altura = parametros[1];
        return (base * altura) / 2;
    }
}
