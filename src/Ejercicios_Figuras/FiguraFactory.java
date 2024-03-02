
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
    
           
    
