package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio23Mayor3Numeros {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // variables
        int numero1, numero2, numero3;

        System.out.println("Programa que te dice cual de 3 Números es mayor.");
        // ingreso de datos
        System.out.print("Ingresa un número: ");
        numero1 = leer.nextInt();

        System.out.print("Ingresa un número: ");
        numero2 = leer.nextInt();

        System.out.print("Ingresa un número: ");
        numero3 = leer.nextInt();

        // si el primer número es mayor
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El número " + numero1 + " es mayor.");
        }
        // si el segundo número es mayor
        else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El número " + numero2 + " es mayor");
        }
        // si el tercer número es mayor
        else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El número " + numero3 + " es mayor");
        }
        // si todos los números son iguales
        else {
            System.out.println("Los números son iguales");
        }
    }
}
