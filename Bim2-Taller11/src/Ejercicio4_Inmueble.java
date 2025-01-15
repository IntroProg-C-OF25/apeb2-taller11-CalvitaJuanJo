/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro 
 * procedimiento para calcular el valor del predio de un bien inmueble. Cada 
 * procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, 
 * cédula del cliente).
 * 
 * @author Juan Jose
 */
import java.util.Scanner;


public class Ejercicio4_Inmueble {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre :): ");
        String nombrecliente = tcl.nextLine();
        System.out.print("Ingrese su numero de cedula porfa :): ");
        String cedulacliente = tcl.nextLine();

        System.out.println("Menu:");
        System.out.println("1. Desea calcular su valor de la planilla de luz");
        System.out.println("2. Desea calcular el valor del predio de un bien inmueble");
        System.out.print("Ingrese una opcion porfa :): ");
        int opcion = tcl.nextInt();

        switch (opcion) {
            case 1:
                calvalorluz(nombrecliente, cedulacliente);
                break;
            case 2:
                calpredio(nombrecliente, cedulacliente);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void calvalorluz(String nombre, String cedula) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el valor del kilowatio: ");
        double vakilovatios = tcl.nextDouble();
        System.out.print("Ingrese el numero de kilowatios consumidos: ");
        double kiloconsumidos = tcl.nextDouble();

        double totalLuz = vakilovatios * kiloconsumidos;

        System.out.println("Cliente " + nombre + " con cedula " + cedula +
                " debe cancelar el valor de $" + totalLuz);
    }

    public static void calpredio(String nombre, String cedula) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el valor del inmueble: ");
        double valinmueble = tcl.nextDouble();

        double topredio = valinmueble * 0.02;

        System.out.println("Cliente " + nombre + "con cédula " + cedula +
                " tiene un bien inmueble valorado en $" + valinmueble +
                " y tiene que pagar de predio $" + topredio);
    }
}
/**
 * run:
 * Ingrese su nombre :): Juan Jose
 * Ingrese su numero de cedula porfa :): 1106053810
 * Menu:
 * 1. Desea calcular su valor de la planilla de luz
 * 2. Desea calcular el valor del predio de un bien inmueble
 * Ingrese una opcion porfa :): 1
 * Ingrese el valor del kilowatio: 10
 * Ingrese el numero de kilowatios consumidos: 50
 * Cliente Juan Jose con cedula 1106053810 debe cancelar el valor de $500.0
 * BUILD SUCCESSFUL (total time: 16 seconds)
 */
