package EjerciciosLogica;

/*EJERCICIO:
Escribe un programa que cree una matriz de números 
(dada por el usuario) y luego permita al usuario buscar
 un número en la matriz. El programa debe indicar si el 
 número se encuentra en la matriz y en qué posición. */

import java.util.Scanner;

public class Ejercicio41BuscarNumeroMatriz {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        /* Matriz de 3 filas y 4 columnas */
        int matriz[][] = {
                { 35, 67, 78, 244 },
                { 12, 234, 123, 76 },
                { 11, 66, 55, 88 }
        };

        /* Numero a buscar */
        int numeroBuscar = 76;
        /* llamamos al metodo que busca en el dato en la matriz */
        encontrarNumeroMatriz(matriz, numeroBuscar);
    }

    public static void encontrarNumeroMatriz(int matriz[][], int numero) {
        /* variables para las posiciones */
        int i;
        int j = 0;

        /* Procedemos a buscar el número pasado por parametro */
        boolean encontrado = false;
        buscar: for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        /* mostramos si el número esta o no en la matriz */
        if (encontrado) {
            System.out.println("Elemento " + numero +
                    " encontrado en la posicion:" +
                    "\n[" + i + "]" + "[" + j + "]");
        } else {
            System.out.println("Elemento " + numero +
                    " no encontrado.");
        }
    }
    


    public static void llenarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int numerosMatriz[][]) {
        for (int i = 0; i < numerosMatriz.length; i++) {
            for (int j = 0; j < numerosMatriz[i].length; j++) {
                System.out.print("[" + numerosMatriz[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static void ejemplo() {
        int cantFilas, cantColumnas;
        System.out.print("Ingresa el numero de filas para la matriz: ");
        cantFilas = leer.nextInt();
        System.out.print("Ingresa el numero de columnas para la matriz: ");
        cantColumnas = leer.nextInt();
        System.out.println("Matriz difinida de " + cantFilas + " filas " +
                "\npor " + cantColumnas + " columnas.");

        /* Definimos nuestra matriz */
        int matrizEnteros[][] = new int[cantFilas][cantColumnas];

        /* llamamos al método para llenar la matriz */
        llenarMatriz(matrizEnteros);

        /* Pedimos el número a buscar */
        System.out.print("Ingrese el número a buscar: ");
        int numero = leer.nextInt();
    }

}
