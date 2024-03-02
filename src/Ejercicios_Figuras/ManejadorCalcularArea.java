
package Ejercicios_Figuras;

import static Ejercicios_Figuras.FiguraFactory.calcularAreaCuadrado;

public class ManejadorCalcularArea implements Manejador {

    private Manejador manejador;

    @Override
    public void manejarSolicitud(Figura figura) {
        if (manejador != null) {
            manejador.manejarSolicitud(figura);
        } 
    }
    
    public void calcularArea() {
        double lado = 0;
        //area = Math.pow(lado, 2);
        double area = calcularAreaCuadrado(lado);
    }

    @Override
    public Ejercicios_Figuras.Manejador Manejador() {
        throw new UnsupportedOperationException("Not supported yet."); // generados por el ide
    }

    @Override
    public void calcularArea(Figura figura) {
        throw new UnsupportedOperationException("Not supported yet.");// generados por el ide
    }

  
    

    

    

}