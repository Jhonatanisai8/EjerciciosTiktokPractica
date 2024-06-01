package EjerciciosLogica;

import java.util.Scanner;

public class Ejercicio12FactorialNumero {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        // definimos las variables
        int numero, factorial;
        System.out.println("Factorial de un número");

        do {
            factorial = 1;
            // pedimos los datos
            System.out.print("Ingrese el número: ");
            numero = leer.nextInt();
            // calculamos el factorial mediante un ciclo
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            // mostramos los resultados
            System.out.println("Factorial de: " + numero + " es: " + factorial);
        } while (numero != 0);
    }
}
