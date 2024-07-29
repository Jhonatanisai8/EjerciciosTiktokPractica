
package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio40Matrices {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ejemplo Matriz");
        ejemploMatriz02();
    }

    public static void ejemploMatriz01() {

        /* definimos la matriz en este caso de 3 filas por 4 columnas */
        int numerosMatriz[][] = {
                { 35, 67, 78, 244 },
                { 12, 234, 123, 76 },
                { 11, 66, 55, 88 } };

        /* mostramos la matriz */
        for (int i = 0; i < numerosMatriz.length; i++) {
            for (int j = 0; j < numerosMatriz[i].length; j++) {
                System.out.print("[" + numerosMatriz[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static void ejemploMatriz02() {
        int matrizEnteros[][] = new int[2][4];
        System.out.println("Ingresa los elementos de la matri: ");
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizEnteros[i][j] = leer.nextInt();
            }
        }

        System.out.println("Elementos de la matriz: ");
        mostrarMatriz(matrizEnteros);
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}
