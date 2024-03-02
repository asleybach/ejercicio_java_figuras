package Ejercicios_Figuras;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion = 0;
        
        Scanner scanner = new Scanner(System.in);

        while (opcion != 4) {

            System.out.println("**Seleccione la figura a calcular:**");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Circulo");
            System.out.println("4. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese la base del Triángulo: ");
                    double base = scanner.nextDouble();

                    System.out.println("Ingrese la altura del Triángulo: ");
                    double altura = scanner.nextDouble();

                    Triangulo rectangulo = new Triangulo(base, altura);
                    rectangulo.calcularArea();
                    rectangulo.calcularPerimetro();

                    System.out.println("Área del Triángulo: " + rectangulo.Area());
                    System.out.println("Perímetro del Triángulo: " + rectangulo.Perimetro());
                    break;

                case 2:
                    /*System.out.println("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado);
                    cuadrado.calcularArea();
                    cuadrado.calcularPerimetro();*/
                    
                    Figura figura = FiguraFactory.crearFigura("cuadrado");
                    Manejador manejador = new ManejadorCalcularArea();
                    manejador.manejarSolicitud(figura);
                    //manejador.calcularArea(figura);
                    figura.calcularArea();
                    figura.calcularPerimetro(); 
                    
                    /*System.out.println("Área del cuadrado: " + cuadrado.Area());
                    System.out.println("Perímetro del cuadrado: " + cuadrado.Perimetro());*/
                    
                    System.out.println("el área es: " + figura.area);
                    System.out.println("el perimetro es: " + figura.perimetro);
                    break;

                     
                case 3:
                    System.out.println("Ingrese el radio del Circulo: ");
                    double radio = scanner.nextDouble();
                    
                    Circulo circulo = new Circulo(radio);
                    circulo.calcularArea();
                    circulo.calcularPerimetro();

                    System.out.println("Área del circulo: " + circulo.Area());
                    System.out.println("Perímetro del circulo: " + circulo.Perimetro());
                    break;

                case 4:
                    System.out.println("Cierre");
                    break;

                default:
                    System.out.println("Opción no válida. Selecciona una opción del menú.");
            }
        }
    }
}

