package EjerciciosLogica;
/*
 * Ejercicio:
 * Realizar un algotimo que permita ingresar una frase y
 * la  imprima al revés 
 * Ejemplo:
 * Hola mundo
 * odnum aloh
 */

import java.util.Scanner;

public class Ejercicio28InvertirFrase {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // variables
        String frase, opcion;
        char frase2[];
        do {
            // pedimos la frase
            System.out.print("Ingresa una frase: ");
            frase = leer.nextLine();
            frase2 = new char[frase.length()];

            // la guardamos dentro de un arreglo
            for (int i = 0; i < frase.length(); i++) {
                frase2[i] = frase.charAt(i);
            }

            // la mostramos al revés
            for (int j = frase2.length - 1; j >= 0; j--) {
                System.out.print(frase2[j]);
            }

            System.out.println();
            // preguntamos si desea continuar
            System.out.println("¿Desea continuar? y/o: ");
            opcion = leer.nextLine();
        } while (!opcion.equalsIgnoreCase("o"));
    }
}
