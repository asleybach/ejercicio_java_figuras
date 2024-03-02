# Ejercicio Java Figuras

Seleccione como patron de diseño de creación Abstract Factory pues me permite crear 
colecciones de objetos ( en este caso figuras ) cuyas caracteristicas pueden cambiar 
(lados de la figura por ejemplo), sin especificar su clase concreta. 
Adicional senti que era el patron de diseño de creación más sencillo de implementar.

Se creo la clase FiguraFactory para la creación de colecciones de figura, identificandolas con el nombre
Solamente cambie la clase hija Cuadrado para aplicar los cambios correspondientes al patron de diseña Factory.  

####
package Ejercicios_Figuras;

import java.util.Scanner;

public abstract class FiguraFactory {    
    
    protected double area;
    protected double perimetro;

    public abstract void calcularArea();
    public abstract void calcularPerimetro();    
        
    public static Figura crearFigura(String tipo) {
        
        Scanner scanner = new Scanner(System.in);
        
        if (tipo.equals("cuadrado")) {
            System.out.println("Introduzca por favor el lado del cuadrado: ");
            double lado = scanner.nextDouble();
            return new Cuadrado(lado);
        } else {
            throw new IllegalArgumentException("Tipo de figura no válida");
        }
    }
    
    public static double calcularAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }
    
    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }
    
    }


se selecciono como patron de diseño de comportamiento, el patrón chain responsibility... 
bueno por lo menos se intento usarlo, esta parte con la creación de la clase manejador como interface, 
y la clase manejadorCalculoArea que implementa al manejador. 
Esta selección se debe a que se visualizo que este patron de diseño 
permite manejar codigo y solicitudes [para su ejecución] por separado, 
lo que facilita extender el codigo si es necesario sin afectar el llamado a la ejecución.

####

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

