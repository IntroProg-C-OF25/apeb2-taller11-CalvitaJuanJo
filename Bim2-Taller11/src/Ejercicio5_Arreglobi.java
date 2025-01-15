/**
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación
 * de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * 
 * @author Juan Jose 
 */
import java.util.Scanner;


public class Ejercicio5_Arreglobi {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese el tamano de la matriz cuadrada: ");
        int tamaño = tcl.nextInt();
        int[][] matriz1 = new int[tamaño][tamaño];
        int[][] matriz2 = new int[tamaño][tamaño];

        System.out.println("Ingrese los valores de la primera matriz:");
        fullmatriz(matriz1, tcl);

        System.out.println("Ingrese los valores de la segunda matriz:");
        fullmatriz(matriz2, tcl);

        System.out.println("Matriz1:");
        presmatriz(matriz1);

        System.out.println("Matriz2:");
        presmatriz(matriz2);

        System.out.println("La suma de matrices:");
        int[][] suma = sumatriz(matriz1, matriz2);
        presmatriz(suma);

        System.out.println("La resta de matrices:");
        int[][] resta = restmatriz(matriz1, matriz2);
        presmatriz(resta);

        System.out.println("La multiplicacion de matrices:");
        int[][] multiplicacion = multimatriz(matriz1, matriz2);
        presmatriz(multiplicacion);
    }

    public static void fullmatriz(int[][] matriz, Scanner tcl) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
    }

    public static void presmatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumatriz(int[][] matriz1, int[][] matriz2) {
        int tamaño = matriz1.length;
        int[][] result = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                result[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return result;
    }

    public static int[][] restmatriz(int[][] matriz1, int[][] matriz2) {
        int tamaño = matriz1.length;
        int[][] result = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                result[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return result;
    }

    public static int[][] multimatriz(int[][] matriz1, int[][] matriz2) {
        int tamaño = matriz1.length;
        int[][] result = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                for (int k = 0; k < tamaño; k++) {
                    result[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return result;
    }
}
/* *
 * run:
 * Ingrese el tamano de la matriz cuadrada: 5
 * Ingrese los valores de la primera matriz:
 * Ingrese valor para [0][0]: 10
 * Ingrese valor para [0][1]: 0
 * Ingrese valor para [0][2]: 5
 * Ingrese valor para [0][3]: 4
 * Ingrese valor para [0][4]: 6
 * Ingrese valor para [1][0]: 4
 * Ingrese valor para [1][1]: 7
 * Ingrese valor para [1][2]: 5
 * Ingrese valor para [1][3]: 6
 * Ingrese valor para [1][4]: 2
 * Ingrese valor para [2][0]: 1
 * Ingrese valor para [2][1]: 9
 * Ingrese valor para [2][2]: 8
 * Ingrese valor para [2][3]: 4
 * Ingrese valor para [2][4]: 2
 * Ingrese valor para [3][0]: 5
 * Ingrese valor para [3][1]: 4
 * Ingrese valor para [3][2]: 3
 * Ingrese valor para [3][3]: 2
 * Ingrese valor para [3][4]: 8
 * Ingrese valor para [4][0]: 4
 * Ingrese valor para [4][1]: 6
 * Ingrese valor para [4][2]: 5
 * Ingrese valor para [4][3]: 4
 * Ingrese valor para [4][4]: 3 
 *
 * Ingrese los valores de la segunda matriz:
 * Ingrese valor para [0][0]: 5
 * Ingrese valor para [0][1]: 54
 * Ingrese valor para [0][2]: 6
 * Ingrese valor para [0][3]: 7
 * Ingrese valor para [0][4]: 8
 * Ingrese valor para [1][0]: 7
 * Ingrese valor para [1][1]: 6
 * Ingrese valor para [1][2]: 7
 * Ingrese valor para [1][3]: 2
 * Ingrese valor para [1][4]: 1
 * Ingrese valor para [2][0]: 4
 * Ingrese valor para [2][1]: 6
 * Ingrese valor para [2][2]: 7
 * Ingrese valor para [2][3]: 5
 * Ingrese valor para [2][4]: 4
 * Ingrese valor para [3][0]: 2
 * Ingrese valor para [3][1]: 3
 * Ingrese valor para [3][2]: 4
 * Ingrese valor para [3][3]: 5
 * Ingrese valor para [3][4]: 6
 * Ingrese valor para [4][0]: 7
 * Ingrese valor para [4][1]: 8
 * Ingrese valor para [4][2]: 5
 * Ingrese valor para [4][3]: 6
 * Ingrese valor para [4][4]: 4
 * 
 * Matriz1:
 * 10 0 5 4 6 
 * 4 7 5 6 2 
 * 1 9 8 4 2 
 * 5 4 3 2 8 
 * 4 6 5 4 3 
 * 
 * Matriz2:
 * 5 54 6 7 8 
 * 7 6 7 2 1 
 * 4 6 7 5 4 
 * 2 3 4 5 6 
 * 7 8 5 6 4 
 * 
 * La suma de matrices:
 * 15 54 11 11 14 
 * 11 13 12 8 3 
 * 5 15 15 9 6 
 * 7 7 7 7 14 
 * 11 14 10 10 7 
 * 
 * La resta de matrices:
 * 5 -54 -1 -3 -2 
 * -3 1 -2 4 1 
 * -3 3 1 -1 -2 
 * 3 1 -1 -3 2 
 * -3 -2 0 -2 -1 
 *
 * La multiplicacion de matrices:
 * 120 630 141 151 148 
 * 115 322 142 109 103 
 * 122 184 151 97 81 
 * 125 382 127 116 100 
 * 111 318 132 103 94 
 * BUILD SUCCESSFUL (total time: 3 minutes 19 seconds)
 */

