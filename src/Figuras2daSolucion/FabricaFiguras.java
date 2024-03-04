
package Figuras2daSolucion;

public class FabricaFiguras {

    public static Figura crearFigura(String tipoFigura) {

        if (tipoFigura.equalsIgnoreCase("Triangulo")) {
            return new Triangulo(0, 0);
        } else if (tipoFigura.equalsIgnoreCase("Cuadrado")) {
            return new Cuadrado(0);
        } else if (tipoFigura.equalsIgnoreCase("Circulo")){
            return new Circulo(0);            
        } else {
            throw new IllegalArgumentException("Tipo de figura no válida");
        }
    }
}