/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el 
 * promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el 
 * promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 
 * el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la 
 * función se la debe llamar desde un método principal. Los parámetros 
 * necesarios para llamar a la función, deben ser ingresados solicitados al 
 * usuario.
 * 
 * @author Juan Jose
 */
import java.util.Scanner;

public class Ejercicio3_Parametros {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Ingresa 4 numeros decimales a continuacion :) :");
        System.out.print("Numero 1: ");
        double num1 = tcl.nextDouble();
        System.out.print("Numero 2: ");
        double num2 = tcl.nextDouble();
        System.out.print("Numero 3: ");
        double num3 = tcl.nextDouble();
        System.out.print("Numero 4: ");
        double num4 = tcl.nextDouble();

        
        String resultado = obtenerprocualitativo(num1, num2, num3, num4);

        System.out.println("El promedio cualitativo es: " + resultado);
    }

    public static String obtenerprocualitativo(double a, double b, double c, double d) {
       
        double promedio = (a + b + c + d) / 4;
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio no alcanza";
        }
    }
}
/***
 * run:
 * Ingresa 4 numeros decimales a continuacion :) :
 * Numero 1: 5
 * Numero 2: 4
 * Numero 3: 3
 * Numero 4: 2
 * El promedio cualitativo es: Regular
 * BUILD SUCCESSFUL (total time: 6 seconds)
 */

