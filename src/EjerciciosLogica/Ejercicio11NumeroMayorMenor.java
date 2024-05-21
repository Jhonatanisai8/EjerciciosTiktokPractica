package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio11NumeroMayorMenor {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        // definimos las variables
        int n1, n2;

        // pedimos los números al usuario
        System.out.print("Ingresa el primer número: ");
        n1 = leer.nextInt();
        System.out.print("Ingresa el segundo número: ");
        n2 = leer.nextInt();

        /*
         * hacemos el uso de condicinales para determininar
         * el mayor,menor o sin iguales.
         * Mostramos los resultados.
         */

        if (n1 > n2) {
            System.out.println("Número mayor: " + n1);
            System.out.println("Número menor: " + n2);
        } else if (n2 > n1) {
            System.out.println("Número mayor es: " + n2);
            System.out.println("Número menor es: " + n1);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}
