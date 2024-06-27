package EjerciciosLogica;

import java.util.Scanner;
public class Ejercicio25NumerosMayoresIgualesa25 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int contador = 0, cantElementos = 20;
        int arreglo[] = new int[cantElementos];

        //pedimos los datos
        System.out.println("=Ingresando datos al arreglo=");
        for (int i = 0; i < cantElementos; i++) {
            System.out.print((i + 1) + " Ingrese un elemento: ");
            arreglo[i] = leer.nextInt();

            //evaluamos cada número segun la condición
            if (arreglo[i] <= 25) {
                contador++;
            }
        }

        //mostramos los datos del arreglo
        System.out.println("=Datos del arreglo=");
        for (int i = 0; i < cantElementos; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }

        //cantidad de números <= 25
        System.out.println("\nCantidad de números menores o iguales a 25: " + contador);

    }
}
