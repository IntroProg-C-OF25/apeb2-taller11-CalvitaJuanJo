/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular 
 * el área de un cuadrado, área de un triángulo y área de un rectángulo. Cada p
 * rocedimiento/función debe recibir los datos necesarios y generar el valor 
 * correspondiente. Se debe invocar a los procedimientos desde un método 
 * principal; Si el usuario ingresa 1 se llama al procedimiento 
 * obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 
 * 3 se llama al procedimiento obtenerAreaCuadrado.
 * 
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 * 
 * @author Juan Jose 
 */
import java.util.Scanner;


public class Ejercicio2_Solucion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        int opcion = 0;

        System.out.println("Calculadora :)");
        System.out.println("1. El area de un cuadrado");
        System.out.println("2. El area de un triangulo");
        System.out.println("3. El area de un rectangulo");
        System.out.print("Selecciona una opcion (Del 1 al 3): ");
        opcion = tcl.nextInt();

        if (opcion == 1) {
            calculaareacua();
        } else if (opcion == 2) {
            calculaareatri();
        } else if (opcion == 3) {
            calculaarearec();
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public static void calculaareacua() {
        Scanner tcl = new Scanner(System.in);
        int lado = 0;

        System.out.print("Ingresa el lado del cuadrado: ");
        lado = tcl.nextInt();

        int area = lado * lado * lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }

    public static void calculaareatri() {
        Scanner tcl = new Scanner(System.in);
        double base, altura;

        System.out.print("Ingresa la base del triangulo: ");
        base = tcl.nextDouble();
        System.out.print("Ingresa la altura del triangulo: ");
        altura = tcl.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    public static void calculaarearec() {
        Scanner tcl = new Scanner(System.in);
        double base, altura;

        System.out.print("Ingresa la base del rectangulo: ");
        base = tcl.nextDouble();
        System.out.print("Ingresa la altura del rectangulo: ");
        altura = tcl.nextDouble();

        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }
}
/**
 * run:
 * Calculadora :)
 * 1. El area de un cuadrado
 * 2. El area de un triangulo
 * 3. El area de un rectangulo
 * Selecciona una opcion (Del 1 al 3): 2
 * Ingresa la base del triangulo: 10
 * Ingresa la altura del triangulo: 5
 * El area del triangulo es: 25.0
 * BUILD SUCCESSFUL (total time: 11 seconds)
 */