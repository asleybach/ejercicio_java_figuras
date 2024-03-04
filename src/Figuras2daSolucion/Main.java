
package Figuras2daSolucion;

import java.util.Scanner;

public class Main {

    /*private static CalculadorAreaTriangulo CalculadorAreaTriangulo;
    private static CalculadorAreaCuadrado CalculadorAreaCuadrado;
    private static CalculadorAreaTriangulo CalculadorAreaCirculo;*/

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String opcion = "";
        
            System.out.println("Ingresa nombre figura [Triangulo | Cuadrado | Circulo]: ");
            opcion = scanner.next();

            Figura figura = FabricaFiguras.crearFigura(opcion);
         
            if (figura instanceof Triangulo) {
                Triangulo triangulo = (Triangulo) figura;
                System.out.println("Ingrese la base del triángulo:");
                double base = scanner.nextDouble();

                System.out.println("Ingrese la altura del triángulo:");
                double altura = scanner.nextDouble();

                triangulo.setBase(base);
                triangulo.setAltura(altura);
                
                //contexto con un calculador de área para cuadrados
                Contexto calculador = new Contexto(new CalculadorAreaTriangulo());
         
                //Calcular el área del cuadrado
                calculador.calcularArea(triangulo);

                //triangulo.calcularArea(CalculadorAreaTriangulo);
                triangulo.calcularPerimetro();
                
                System.out.println("Área del triángulo: " + triangulo.getArea());
                System.out.println("Perímetro: " + triangulo.getPerimetro());
            } else if (figura instanceof Cuadrado) {
                Cuadrado cuadrado = (Cuadrado) figura;

                System.out.println("Ingrese el lado del cuadrado:");
                double lado = scanner.nextDouble();

                cuadrado.setLado(lado);
                
                //contexto con un calculador de área para cuadrados
                Contexto calculador = new Contexto(new CalculadorAreaCuadrado());
         
                //Calcular el área del cuadrado
                calculador.calcularArea(cuadrado);

                //cuadrado.calcularArea();
                cuadrado.calcularPerimetro();

                System.out.println("Área del cuadrado: " + cuadrado.getArea());
                System.out.println("Perimetro: " + cuadrado.getPerimetro());
            } else if (figura instanceof Circulo){
                Circulo circulo = (Circulo) figura;
            
                System.out.println("Ingrese el radio del circulo:");
                double radio = scanner.nextDouble();
                circulo.setRadio(radio);
                
                //contexto con un calculador de área para cuadrados
                Contexto calculador = new Contexto(new CalculadorAreaCirculo());
         
                //Calcular el área del cuadrado
                calculador.calcularArea(circulo);
                
                //circulo.calcularArea();
                circulo.calcularPerimetro();
                
                System.out.println("Área del Circulo: " + circulo.getArea());
                System.out.println("Perimetro: " + circulo.getPerimetro());
        }
  
}
    
}